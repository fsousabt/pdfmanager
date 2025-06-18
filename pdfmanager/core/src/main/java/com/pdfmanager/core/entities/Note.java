package com.pdfmanager.core.entities;

// Todo

import java.util.Optional;
import java.util.OptionalInt;

public class Note extends Entry {
  protected String subtitle;
  protected String discipline;
  protected Optional<String> institution;
  protected OptionalInt pageSize;

  public Note(
     int id,
     String author,
     String title,
     int libraryId,
     String subtitle,
     String discipline,
     Optional<String> institution,
     OptionalInt pageSize
    ) {
        super(id, author, title, libraryId);
        this.subtitle = subtitle;
        this.discipline = discipline;
        this.institution = institution;
        this.pageSize = pageSize;
    }

    public Note(
     String author,
     String title,
     int libraryId,
     String subtitle,
     String discipline,
     Optional<String> institution,
     OptionalInt pageSize
    ) {
        super(author, title, libraryId);
        this.subtitle = subtitle;
        this.discipline = discipline;
        this.institution = institution;
        this.pageSize = pageSize;
    }


}
