package co.uni.foloclub.foloclub.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "users")
@EqualsAndHashCode(callSuper = true)
public class Member extends User {

  public Member(String id, String name, String email, String role) {
    super(id, name, email, role);
  }
}
