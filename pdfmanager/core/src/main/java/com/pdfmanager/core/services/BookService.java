package com.pdfmanager.core.services;

import java.util.List;
import java.util.OptionalInt;

import com.pdfmanager.core.entities.Book;
import com.pdfmanager.core.repositories.BookRepository;
import com.pdfmanager.core.shared.Utils;

public class BookService {
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> getAll() {
    return this.bookRepository.getAll();
  }

  public void create(String path, int libraryId, String authorName, String title, String subtitle, String genre, String publicationYear, String editor, String pageSize) {
    int publicationYearValue;
    try {
      publicationYearValue = Utils.parseIntOrThrow(publicationYear);
    } catch (NumberFormatException e) {
      System.out.println("Ano de publicação do livro é obrigatório e deve ser um valor numérico!");
      return;
    }
    OptionalInt pageSizeValue = Utils.parseOptionalInt(pageSize);

    this.bookRepository.create(new Book(authorName, title, libraryId, subtitle, genre, editor, pageSizeValue, publicationYearValue));
  }

  public void updateById(int id, int libraryId, String authorName, String title, String subtitle, String genre, int publicationYear, String editor, String pageSize) {
    OptionalInt pageSizeValue;
    try {
        pageSizeValue = OptionalInt.of(Integer.parseInt(pageSize));
    } catch (NumberFormatException e) {
        pageSizeValue = OptionalInt.empty();
    }
    Book book = new Book(authorName, title, libraryId, subtitle, genre, editor, pageSizeValue, publicationYear);
    this.bookRepository.updateById(id, book);
  }

  public void deleteById(int id) {
    this.bookRepository.deleteById(id);
  }

}
