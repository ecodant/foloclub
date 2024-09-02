package co.uni.foloclub.foloclub.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Document(collection = "trainingSessions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TrainingSession {
  @Id
  private ObjectId id;
  private LocalDate sessionDate;
  private Duration duration;

  private boolean stateSession;
  private Sport sport;
  private Trainer trainer;

}
