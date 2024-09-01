
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
  private String id;
  private String name;
  private String description;
  private DifficultyGrade difficulty;
  private Collection<Trainer> trainers;

  // For the future, validate the creation of the Sport Object but defining the
  // Grade of Difficulty
  public Sport(String id, String name, String description, DifficultyGrade difficulty, Collection<Trainer> trainers) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.trainers = trainers;
    this.difficulty = difficulty;
  }

  // Error For assign the Enum DifficultyGrade in POSTMAN, so check it if in the
  // front end could match the ENUM
  public Sport(String id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.trainers = new LinkedList<>();

    this.difficulty = DifficultyGrade.STANDARD;
  }
}
