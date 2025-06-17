package com.pdfmanager.core.entities;

public class Slide extends Entry {
  public Slide(int id, String dirname, String author, String title, int libraryId) {
    super(id, dirname, author, title, libraryId);
  }

  public Slide(String dirname, String author, String title, int libraryId) {
    super(dirname, author, title, libraryId);
  }

}
