
package co.uni.foloclub.foloclub;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Document(collection = "sports")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sport {
  @Id
  private ObjectId id;
  private String name;
  private String description;
  private DifficultyGrade difficulty;
  private List<Trainer> trainers;
}
