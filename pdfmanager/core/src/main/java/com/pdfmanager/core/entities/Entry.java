package com.pdfmanager.core.entities;

public abstract class Entry extends AbstractEntity {
    protected String dirname;
    protected String author;
    protected String title;
    protected int libraryId;


    public Entry(int id, String dirname, String author, String title, int libraryId) {
        super(id);
        this.dirname = dirname;
        this.author = author;
        this.title = title;
        this.libraryId = libraryId;
    }

    public Entry(String dirname, String author, String title, int libraryId) {
        this.dirname = dirname;
        this.author = author;
        this.title = title;
        this.libraryId = libraryId;
    }

    public String getAuthor() {
        return author;
    }

    public String getDirname() {
        return dirname;
    }

    public String getTitle() {
        return title;
    }
}
