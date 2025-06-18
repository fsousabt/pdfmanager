package com.pdfmanager.core.entities;

import java.util.Optional;

public class Slide extends Entry {

  protected String discipline;
  protected Optional<String> institution;

  public Slide(
    int id,
    String author,
    String title,
    int libraryId,
    String discipline,
    Optional<String> institution
  ) {
     super(id, author, title, libraryId);
     this.discipline = discipline;
     this.institution = institution;
  }

  public Slide(
    String author,
    String title,
    int libraryId,
    String discipline,
    Optional<String> institution
  ) {
     super(author, title, libraryId);
     this.discipline = discipline;
     this.institution = institution;
  }
}
