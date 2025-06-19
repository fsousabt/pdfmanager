package com.pdfmanager.core.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.OptionalInt;

import com.pdfmanager.core.db.DatabaseInterface;
import com.pdfmanager.core.entities.Book;

public class BookRepository extends BaseRepository<Book>{

  public BookRepository(DatabaseInterface db) {
    super(db);
  }

  @Override
  protected String getTableName() {
    return "book";
  }

  @Override
  protected Book mapResultSet(ResultSet rs) throws SQLException {
    int id = rs.getInt("id");
    String author = rs.getString("author");
    String title = rs.getString("title");
    int libraryId = rs.getInt("library_id");
    String subtitle = rs.getString("subtitle");
    String genre = rs.getString("genre");
    String editor = rs.getString("editor");
    int pageSize = rs.getInt("page_size");
    OptionalInt optionalPageSize = rs.wasNull() ? OptionalInt.empty() : OptionalInt.of(pageSize);
    int publicationYear = rs.getInt("publication_year");
    return new Book(id, author, title, libraryId, subtitle, genre, editor, optionalPageSize, publicationYear);
  }

  @Override
  public void create(Book book) {
    String sql = "INSERT INTO " + getTableName() + " (library_id, author, title, subtitle, genre, editor, page_size, publication_year) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
     try (
          Connection conn = this.getConnection();
          PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, book.getLibraryId());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getTitle());
            stmt.setString(4, book.getSubtitle());
            stmt.setString(5, book.getGenre());
            stmt.setString(6, book.getEditor());
            OptionalInt bookPage = book.getPageSize();
            if(bookPage.isPresent()) {
              stmt.setInt(7, bookPage.getAsInt());
            } else {
              stmt.setNull(7, Types.INTEGER);
            }
            stmt.setInt(8, book.getPublicationYear());
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao criar livro: " + e.getMessage());
        }
  }

  @Override
  public void updateById(int id, Book book) {
    String sql = "UPDATE " + getTableName() + " SET "
               + "library_id = ?, "
               + "author = ?, "
               + "title = ?, "
               + "subtitle = ?, "
               + "genre = ?, "
               + "editor = ?, "
               + "page_size = ?, "
               + "publication_year = ? "
               + "WHERE id = ?";

    try (
        Connection conn = this.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)
    ) {
        stmt.setInt(1, book.getLibraryId());
        stmt.setString(2, book.getAuthor());
        stmt.setString(3, book.getTitle());
        stmt.setString(4, book.getSubtitle());
        stmt.setString(5, book.getGenre());
        stmt.setString(6, book.getEditor());

        OptionalInt bookPage = book.getPageSize();
        if (bookPage.isPresent()) {
            stmt.setInt(7, bookPage.getAsInt());
        } else {
            stmt.setNull(7, Types.INTEGER);
        }

        stmt.setInt(8, book.getPublicationYear());
        stmt.setInt(9, id); // ID no WHERE

        stmt.executeUpdate();

    } catch (SQLException e) {
        System.err.println("Erro ao atualizar livro com id " + id + ": " + e.getMessage());
    }
  }

}
