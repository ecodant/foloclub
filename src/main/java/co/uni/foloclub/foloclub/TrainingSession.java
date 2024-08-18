package co.uni.foloclub.foloclub;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ch.qos.logback.core.util.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Document(collection = "sports")
@Data
@AllArgsConstructor
public class TrainingSession {
  @Id
  private ObjectId id;
  private LocalDate sessionDate;
  private Duration duration;
  // The idea its that false means programed or pending and the true means
  // completed
  private boolean stateSession;
  private final Sport sport;
  private final Trainer trainer;

}
