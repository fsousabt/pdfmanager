package com.pdfmanager.core.entities;

public class Book extends Entry {
    protected String subtitle;
    protected String genre;
    protected String editor;
    protected int pageSize;
    protected int publicationYear;

    public Book(int id, String dirname, String author, String title, int libraryId) {
        super(id, dirname, author, title, libraryId);
    }

    public Book(String dirname, String author, String title, int libraryId) {
        super(dirname, author, title, libraryId);
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

    public String getEditor() {
      return editor;
    }

    public void setEditor(String editor) {
      this.editor = editor;
    }

    public int getPageSize() {
      return pageSize;
    }

    public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
    }

    public int getPublicationYear() {
      return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
      this.publicationYear = publicationYear;
    }

}
