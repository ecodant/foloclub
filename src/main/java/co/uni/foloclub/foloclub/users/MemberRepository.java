package co.uni.foloclub.foloclub.users;

import co.uni.foloclub.foloclub.models.Member;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * InnerMemberRepository
 */
public interface MemberRepository extends MongoRepository<Member, String> {
}
