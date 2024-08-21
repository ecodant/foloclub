
package co.uni.foloclub.foloclub.users;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.uni.foloclub.foloclub.models.User;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
  Optional<User> findByEmail(String email);
}
