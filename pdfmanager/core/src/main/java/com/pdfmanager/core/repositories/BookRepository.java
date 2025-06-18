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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapResultSet'");
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
            stmt.setString(6, book.getEditor().toString());
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
  public void updateById(int id, Book entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateById'");
  }

}
