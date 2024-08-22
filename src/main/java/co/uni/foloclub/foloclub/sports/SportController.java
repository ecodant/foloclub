package co.uni.foloclub.foloclub.sports;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.uni.foloclub.foloclub.models.Sport;

@RestController
@RequestMapping("/api/v1/sports")
public class SportController {

    @Autowired
    private SportService service;

    @GetMapping
    public ResponseEntity<List<Sport>> getSports() {
        return new ResponseEntity<>(service.findAllSports(), HttpStatus.OK);
    }

    @GetMapping("/{sportId}")
    public ResponseEntity<Optional<Sport>> getSport(@PathVariable String sportId) {
        return new ResponseEntity<>(service.findSportById(sportId), HttpStatus.OK);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Sport>> getSportsByName(@RequestParam String name) {
        return new ResponseEntity<>(service.findSportsByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Sport> createSport(@RequestBody Sport sport) {
        return new ResponseEntity<>(service.createSport(sport), HttpStatus.CREATED);
    }

    @PutMapping("/{sportId}")
    public ResponseEntity<Optional<Sport>> updateSport(
            @PathVariable String sportId, 
            @RequestBody Sport updatedSport) {
        return new ResponseEntity<>(service.updateSport(sportId, updatedSport), 
                                    service.findSportById(sportId).isPresent() 
                                    ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{sportId}")
    public ResponseEntity<Void> deleteSport(@PathVariable String sportId) {
        service.deleteSport(sportId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
