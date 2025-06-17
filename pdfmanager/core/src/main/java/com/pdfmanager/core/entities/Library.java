package com.pdfmanager.core.entities;

public class Library extends AbstractEntity {
  private String name;
  private String path;

  public Library(int id, String name, String path){
    super(id);
    this.path = path;
  }

  public Library(String name, String path){
    super();
    this.name = name;
    this.path = path;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
