package com.pdfmanager.core.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

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
  public void create(Book entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public void updateById(int id, Book entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateById'");
  }

}
