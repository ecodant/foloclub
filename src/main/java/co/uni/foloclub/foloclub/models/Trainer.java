package co.uni.foloclub.foloclub.models;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Collection;
import java.util.LinkedList;

@Document(collection = "trainers")
@Data
public class Trainer {
  // @Id
  private ObjectId id;
  private String name;
  private String email;
  private String specialization;
  private Collection<TrainingSession> trainingSessions;

  public Trainer(ObjectId id, String name, String email, String specialization) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.specialization = specialization;
    this.trainingSessions = new LinkedList<>();
  }
}
