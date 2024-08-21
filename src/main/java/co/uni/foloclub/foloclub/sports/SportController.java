package co.uni.foloclub.foloclub.sports;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.uni.foloclub.foloclub.models.Sport;


@RestController
@RequestMapping("/api/v1/sports")
public class SportController {
  @Autowired
  private SportService service;

  @GetMapping
  public ResponseEntity<List<Sport>> getSports() {
    return new ResponseEntity<List<Sport>>(service.findAllSports(), HttpStatus.OK); 
  }

  @GetMapping("/{sportId}")
  public ResponseEntity<Optional<Sport>> getSport(@PathVariable String sportId) {
    return new ResponseEntity<Optional<Sport>>(service.findSportById(sportId), HttpStatus.OK);
  }
}
