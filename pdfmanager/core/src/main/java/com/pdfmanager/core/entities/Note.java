package com.pdfmanager.core.entities;

// Todo
public class Note extends Entry {

  public Note(int id, String dirname, String author, String title, int libraryId) {
    super(id, dirname, author, title, libraryId);
  }

  public Note(String dirname, String author, String title, int libraryId) {
    super(dirname, author, title, libraryId);
  }

}
