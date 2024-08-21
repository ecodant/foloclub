package co.uni.foloclub.foloclub.sports;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.uni.foloclub.foloclub.models.Sport;

import org.bson.types.ObjectId;

public interface SportRepository extends MongoRepository<Sport, ObjectId> {
  Optional<Sport> findSportById(String id);
}
