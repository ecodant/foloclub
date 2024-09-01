package co.uni.foloclub.foloclub.trainingsessions;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.uni.foloclub.foloclub.models.TrainingSession;

import java.util.Optional;

public interface TrainingSessionRepository extends MongoRepository<TrainingSession, ObjectId> {
  Optional<TrainingSession> findTrainingSessionBySport(String sportName);

  Optional<TrainingSession> findTrainingSessionByTrainer(String trainerName);

}
