package co.uni.foloclub.foloclub.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "users")
@EqualsAndHashCode(callSuper = true)
public class Admin extends User {
  public Admin(ObjectId id, String name, String email, String password) {
    super(id, name, email, password, "ADMIN");
  }

}
