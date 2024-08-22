
package co.uni.foloclub.foloclub.users;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.uni.foloclub.foloclub.models.User;

public interface UserRepository extends MongoRepository<User, String> {
}
