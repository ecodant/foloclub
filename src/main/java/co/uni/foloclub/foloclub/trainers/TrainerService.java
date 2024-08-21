package co.uni.foloclub.foloclub.trainers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.uni.foloclub.foloclub.models.Trainer;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {

  @Autowired
  private TrainerRepository trainerRepository;

  public List<Trainer> getAllTrainers() {
    return trainerRepository.findAll();
  }

  public Optional<Trainer> getTrainerById(ObjectId id) {
    return trainerRepository.findById(id);
  }

  public Optional<Trainer> getTrainerByName(String name) {
    return trainerRepository.findTrainerByName(name);
  }

  public Optional<Trainer> getTrainerBySpecialization(String specialization) {
    return trainerRepository.findBySpecialization(specialization);
  }

  public Trainer createTrainer(Trainer trainer) {
    return trainerRepository.save(trainer);
  }

  public Trainer updateTrainer(ObjectId id, Trainer trainerDetails) {
    return trainerRepository.findById(id).map(trainer -> {
      trainer.setName(trainerDetails.getName());
      trainer.setEmail(trainerDetails.getEmail());
      trainer.setSpecialization(trainerDetails.getSpecialization());
      trainer.setTrainingSessions(trainerDetails.getTrainingSessions());
      return trainerRepository.save(trainer);
    }).orElseThrow(() -> new RuntimeException("Trainer not found with id " + id));
  }

  public void deleteTrainer(ObjectId id) {
    trainerRepository.deleteById(id);
  }
}
