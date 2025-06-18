package com.pdfmanager.core.entities;

import java.util.Optional;
import java.util.OptionalInt;

public class Book extends Entry {
    protected String subtitle;
    protected String genre;
    protected Optional<String> editor;
    protected OptionalInt pageSize;
    protected int publicationYear;

    public Book(
     int id,
     String author,
     String title,
     int libraryId,
     String subtitle,
     String genre,
     Optional<String> editor,
     OptionalInt pageSize,
     int publicationYear
    ) {
        super(id, author, title, libraryId);
        this.subtitle = subtitle;
        this.genre = genre;
        this.editor = editor;
        this.pageSize = pageSize;
        this.publicationYear = publicationYear;
    }

    public Book(
     String author,
     String title,
     int libraryId,
     String subtitle,
     String genre,
     Optional<String> editor,
     OptionalInt pageSize,
     int publicationYear
    ) {
        super(author, title, libraryId);
        this.subtitle = subtitle;
        this.genre = genre;
        this.editor = editor;
        this.pageSize = pageSize;
        this.publicationYear = publicationYear;
    }



    public int getLibraryId() {
      return libraryId;
    }

    public String getSubtitle() {
      return subtitle;
    }

    public void setSubtitle(String subtitle) {
      this.subtitle = subtitle;
    }

    public String getGenre() {
      return genre;
    }

    public void setGenre(String genre) {
      this.genre = genre;
    }

    public Optional<String> getEditor() {
      return editor;
    }

    public void setEditor(Optional<String> editor) {
      this.editor = editor;
    }

    public OptionalInt getPageSize() {
      return pageSize;
    }

    public void setPageSize(OptionalInt pageSize) {
      this.pageSize = pageSize;
    }


    public int getPublicationYear() {
      return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
      this.publicationYear = publicationYear;
    }

}
