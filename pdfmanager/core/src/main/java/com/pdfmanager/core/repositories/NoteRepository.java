package com.pdfmanager.core.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pdfmanager.core.db.DatabaseInterface;
import com.pdfmanager.core.entities.Note;

public class NoteRepository extends BaseRepository<Note> {

  public NoteRepository(DatabaseInterface db) {
    super(db);
  }

  @Override
  protected String getTableName() {
    return "note";
  }

  @Override
  protected Note mapResultSet(ResultSet rs) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapResultSet'");
  }

  @Override
  public void create(Note entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public void updateById(int id, Note entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateById'");
  }

}
