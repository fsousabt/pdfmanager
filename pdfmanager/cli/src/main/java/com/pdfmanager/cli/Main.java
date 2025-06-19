package com.pdfmanager.cli;

import java.nio.file.Paths;
import java.sql.SQLException;

import com.pdfmanager.core.db.Database;
import com.pdfmanager.core.db.DatabaseInterface;
import com.pdfmanager.core.repositories.BookRepository;
import com.pdfmanager.core.repositories.LibraryRepository;
import com.pdfmanager.core.repositories.NoteRepository;
import com.pdfmanager.core.repositories.SlideRepository;
import com.pdfmanager.core.services.BookService;
import com.pdfmanager.core.services.LibraryService;
import com.pdfmanager.core.services.NoteService;
import com.pdfmanager.core.services.SlideService;

public class Main {
    public static void main(String[] args) {
        String DB_URL = "jdbc:sqlite:" + Paths.get(System.getProperty("user.home"),"pdfmanager.db").toString();
        try {
            DatabaseInterface db = new Database(DB_URL);
            db.initialize();
            Cli app = new Cli(
                new LibraryService(new LibraryRepository(db)),
                new BookService(new BookRepository(db)),
                new NoteService(new NoteRepository(db)),
                new SlideService(new SlideRepository(db))
                );
            app.readArgs(args);
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }

    }
}