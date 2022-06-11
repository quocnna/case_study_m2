package service;

import model.Facility;

import java.util.Map;

public interface FacilityService extends BaseService<Facility> {
    Map<Facility, Integer> findAllMaintenance();
}
