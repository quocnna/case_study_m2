package service;

import model.Facility;

import java.util.Map;
import java.util.Optional;

public interface FacilityService extends BaseService<Facility> {
    Map<Facility, Integer> findAllMaintenance();
    Optional<Facility> get(String code);
}
