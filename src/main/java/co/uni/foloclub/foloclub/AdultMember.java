package co.uni.foloclub.foloclub;

import org.bson.types.ObjectId;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AdultMember extends Member {

  private String profession;

  public AdultMember(ObjectId id, String name, String mail, String profession) {
    super(id, name, mail);
    this.profession = profession;
  }
}
