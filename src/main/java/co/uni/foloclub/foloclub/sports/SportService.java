package co.uni.foloclub.foloclub.sports;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.uni.foloclub.foloclub.models.Sport;

import java.util.List;

@Service
public class SportService {
  @Autowired
  private SportRepository repository;

  public List<Sport> findAllSports() {
    return repository.findAll();
  }

  public Optional<Sport> findSportById(String id) {
    return repository.findSportById(id);
  }

}