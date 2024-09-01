package co.uni.foloclub.foloclub.trainingsessions;

import java.time.Duration;
import java.time.LocalDate;

import lombok.Data;

@Data
public class TrainingSessionDTO  {
        private LocalDate sessionDate;
    private Duration duration;
    private boolean stateSession;
    private String sportId;
    private String trainerId;
}
