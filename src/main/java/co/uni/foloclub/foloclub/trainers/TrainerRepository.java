package co.uni.foloclub.foloclub.trainers;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.uni.foloclub.foloclub.models.Trainer;

import java.util.Optional;

public interface TrainerRepository extends MongoRepository<Trainer, ObjectId> {
  Optional<Trainer> findBySpecialization(String specialization);

  Optional<Trainer> findById(String id);
  Optional<Trainer> findTrainerByName(String name);
}
