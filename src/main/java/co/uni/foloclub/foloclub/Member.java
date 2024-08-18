package co.uni.foloclub.foloclub;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Member {
  private ObjectId id;
  private String name;
  private String mail;

}
