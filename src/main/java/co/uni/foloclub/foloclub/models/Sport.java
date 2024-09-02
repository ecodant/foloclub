
package co.uni.foloclub.foloclub.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.LinkedList;

@Document(collection = "sports")
@Data
@NoArgsConstructor
public class Sport {
  @Id
  private ObjectId id;
  private String name;
  private String description;
  private DifficultyGrade difficulty;
  private Collection<Trainer> trainers;


  public Sport(ObjectId id, String name, String description, DifficultyGrade difficulty, Collection<Trainer> trainers) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.trainers = trainers;
    this.difficulty = difficulty;
  }


}
