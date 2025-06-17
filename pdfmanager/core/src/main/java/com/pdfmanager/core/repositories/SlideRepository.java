package com.pdfmanager.core.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pdfmanager.core.db.DatabaseInterface;
import com.pdfmanager.core.entities.Slide;

public class SlideRepository extends BaseRepository<Slide> {

  public SlideRepository(DatabaseInterface db) {
    super(db);
  }

  @Override
  protected String getTableName() {
    return "slide";
  }

  @Override
  protected Slide mapResultSet(ResultSet rs) throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapResultSet'");
  }

  @Override
  public void create(Slide entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public void updateById(int id, Slide entity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateById'");
  }

}
