package org.ort.starwars.fleet.application.ports.in;

import java.util.List;

import org.ort.starwars.fleet.domain.models.Mission;
import org.ort.starwars.fleet.domain.models.entities.Starship;

public interface FleetServiceUseCase {
    List<Starship> forMission(Mission mission);
}
