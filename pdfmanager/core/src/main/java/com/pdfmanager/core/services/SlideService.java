package com.pdfmanager.core.services;

import java.util.List;
import java.util.Optional;

import com.pdfmanager.core.entities.Slide;
import com.pdfmanager.core.repositories.SlideRepository;

public class SlideService {
  private final SlideRepository slideRepository;

  public SlideService(SlideRepository slideRepository) {
    this.slideRepository = slideRepository;
  }

  public List<Slide> getAll() {
    return this.slideRepository.getAll();
  }

  public void create(String path, int libraryId, String authorName, String title, String discipline, Optional<String> institution) {
    // Checar se path leva a um diretorio existente -> throw Exception

    // Checar se path já foi registrado numa outra biblioteca -> throw Exception

    // Checar se nome já foi registrado numa outra biblioteca -> throw Exception

    //update
    this.slideRepository.create(new Slide(authorName, title, libraryId, discipline, institution));
  }

  //update
  public void updateById(int id, int libraryId, String authorName, String title, String discipline, Optional<String> institution) {
    Slide slide = new Slide(authorName, title, libraryId, discipline, institution);
    this.slideRepository.updateById(id, slide);
  }

  public void deleteById(int id) {
    this.slideRepository.deleteById(id);
  }

}
