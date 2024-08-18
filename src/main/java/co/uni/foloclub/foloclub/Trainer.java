package co.uni.foloclub.foloclub;

import org.bson.types.ObjectId;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Document(collection = "trainers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
  @Id
  private ObjectId id;
  private String specialization;
  private List<TrainingSession> trainingSessions;
}
