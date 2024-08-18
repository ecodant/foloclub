package co.uni.foloclub.foloclub;

/**
 * TeenagerMember
 */
import org.bson.types.ObjectId;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TeenagerMember extends Member {

  public TeenagerMember(ObjectId id, String name, String mail) {
    super(id, name, mail);
  }
}
