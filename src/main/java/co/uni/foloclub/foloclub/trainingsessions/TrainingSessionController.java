
package co.uni.foloclub.foloclub.trainingsessions;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.uni.foloclub.foloclub.models.TrainingSession;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/training-sessions")
public class TrainingSessionController {

    @Autowired
    private TrainingSessionService trainingSessionService;

    @GetMapping("/sport/{sportName}")
    public ResponseEntity<TrainingSession> getSessionBySportName(@PathVariable String sportName) {
        Optional<TrainingSession> session = trainingSessionService.getSessionBySportName(sportName);
        return session.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

@PostMapping
    public ResponseEntity<TrainingSession> createTrainingSession(@RequestBody TrainingSessionDTO dto) {
        TrainingSession createdSession = trainingSessionService.createTrainingSession(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSession);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainingSession> updateTrainer(@PathVariable ObjectId id, @RequestBody TrainingSession sessionDetails) {
        try {
            TrainingSession updatedSession = trainingSessionService.updateTrainer(id, sessionDetails);
            return ResponseEntity.ok(updatedSession);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable ObjectId id) {
        trainingSessionService.deleteSession(id);
        return ResponseEntity.noContent().build();
    }
}