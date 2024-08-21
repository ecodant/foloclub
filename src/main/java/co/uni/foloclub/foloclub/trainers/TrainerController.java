package co.uni.foloclub.foloclub.trainers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.uni.foloclub.foloclub.models.Trainer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/trainers")
public class TrainerController {

  @Autowired
  private TrainerService trainerService;

  @GetMapping
  public List<Trainer> getAllTrainers() {
    return trainerService.getAllTrainers();
  }

  @GetMapping("/{id}")
  public Optional<Trainer> getTrainerById(@PathVariable ObjectId id) {
    return trainerService.getTrainerById(id);
  }

  @GetMapping("/name/{name}")
  public Optional<Trainer> getTrainerByName(@PathVariable String name) {
    return trainerService.getTrainerByName(name);
  }

  @GetMapping("/specialization/{specialization}")
  public Optional<Trainer> getTrainerBySpecialization(@PathVariable String specialization) {
    return trainerService.getTrainerBySpecialization(specialization);
  }

  @PostMapping
  public Trainer createTrainer(@RequestBody Trainer trainer) {
    return trainerService.createTrainer(trainer);
  }

  @PutMapping("/{id}")
  public Trainer updateTrainer(@PathVariable ObjectId id, @RequestBody Trainer trainerDetails) {
    return trainerService.updateTrainer(id, trainerDetails);
  }

  @DeleteMapping("/{id}")
  public void deleteTrainer(@PathVariable ObjectId id) {
    trainerService.deleteTrainer(id);
  }
}
