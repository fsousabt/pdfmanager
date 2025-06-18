package com.pdfmanager.core.services;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import com.pdfmanager.core.entities.Note;
import com.pdfmanager.core.repositories.NoteRepository;

public class NoteService {
  private final NoteRepository noteRepository;

  public NoteService(NoteRepository noteRepository) {
    this.noteRepository = noteRepository;
  }

  public List<Note> getAll() {
    return this.noteRepository.getAll();
  }

  public void create(String path, int libraryId, String authorName, String title, String subtitle, String discipline, Optional<String> institution, OptionalInt pageSize) {
    // Checar se path leva a um diretorio existente -> throw Exception

    // Checar se path já foi registrado numa outra biblioteca -> throw Exception

    // Checar se nome já foi registrado numa outra biblioteca -> throw Exception

    this.noteRepository.create(new Note(authorName, title, libraryId, subtitle, discipline, institution, pageSize));
  }

  public void updateById(int id, int libraryId, String authorName, String title, String subtitle, String discipline, Optional<String> institution, OptionalInt pageSize) {
    Note note = new Note(authorName, title, libraryId, subtitle, discipline, institution, pageSize);
    this.noteRepository.updateById(id, note);
  }

  public void deleteById(int id) {
    this.noteRepository.deleteById(id);
  }
}
