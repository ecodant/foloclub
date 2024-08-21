
package co.uni.foloclub.foloclub.trainingsessions;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.uni.foloclub.foloclub.models.TrainingSession;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingSessionService {

  @Autowired
  private TrainingSessionRepository sessionRepository;

  public Optional<TrainingSession> getSessionBySportName(String sportName) {
    return sessionRepository.findTrainingSessionBySport(sportName);
  }

  public TrainingSession createSession(TrainingSession session) {
    return sessionRepository.save(session);
  }

  public TrainingSession updateTrainer(ObjectId id, TrainingSession sessionDetails) {
    return sessionRepository.findById(id).map(session -> {
      session.setSessionDate(sessionDetails.getSessionDate());
      session.setDuration(sessionDetails.getDuration());
      // Here I was thinking may set up the sport also, but could be weird, cause for
      // change such relevant aspect could be better just delete the session and
      // create a new one
      session.setTrainer(sessionDetails.getTrainer());
      return sessionRepository.save(session);
    }).orElseThrow(() -> new RuntimeException("The Session Trainer was not found with the provided Id" + id));
  }

  public void deleteSession(ObjectId id) {
    sessionRepository.deleteById(id);
  }
}
