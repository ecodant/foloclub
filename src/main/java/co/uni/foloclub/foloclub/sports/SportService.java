package co.uni.foloclub.foloclub.sports;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.uni.foloclub.foloclub.models.Sport;
import org.bson.types.ObjectId;

@Service
public class SportService {

    @Autowired
    private SportRepository repository;

    public List<Sport> findAllSports() {
        return repository.findAll();
    }

    public Optional<Sport> findSportById(String id) {
        return repository.findSportById(id);
    }

    public List<Sport> findSportsByName(String name) {
        return repository.findByName(name);
    }

    public Sport createSport(Sport sport) {
        return repository.save(sport);
    }

    public Optional<Sport> updateSport(String id, Sport updatedSport) {
        Optional<Sport> existingSport = repository.findById(new ObjectId(id));
        if (existingSport.isPresent()) {
            Sport sport = existingSport.get();
            sport.setName(updatedSport.getName());
            sport.setDescription(updatedSport.getDescription());
            sport.setDifficulty(updatedSport.getDifficulty());
            sport.setTrainers(updatedSport.getTrainers());
            return Optional.of(repository.save(sport));
        }
        return Optional.empty();
    }

    public void deleteSport(String id) {
        repository.deleteById(new ObjectId(id));
    }
}
