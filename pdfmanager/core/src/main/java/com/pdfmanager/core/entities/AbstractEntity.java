package com.pdfmanager.core.entities;

public abstract class  AbstractEntity {
    protected int id;

    public AbstractEntity(int id) {
      this.id = id;
    }

    public AbstractEntity() {}

    public int getId() {
        return id;
    }
}
