package com.pdfmanager.core.entities;

public abstract class Entry extends AbstractEntity {
    protected String author;
    protected String title;
    protected int libraryId;

    public Entry(int id, String author, String title, int libraryId) {
        super(id);
        this.author = author;
        this.title = title;
        this.libraryId = libraryId;
    }

    public Entry(String author, String title, int libraryId) {
        this.author = author;
        this.title = title;
        this.libraryId = libraryId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
