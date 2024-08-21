
package co.uni.foloclub.foloclub.users;

import co.uni.foloclub.foloclub.models.Admin;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * InnerMemberRepository
 */
public interface AdminRepository extends MongoRepository<Admin, ObjectId> {
}
