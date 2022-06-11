package controller;

import model.Facility;
import service.FacilityService;
import service.FacilityServiceImpl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityController {
    private FacilityService facilityService = new FacilityServiceImpl();

    public List<Facility> findAll(){
        return facilityService.findAll();
    }

    public void create(Facility facility){
        facilityService.create(facility);
    }

    public Map<Facility, Integer> findAllMaintenance(){
        return facilityService.findAllMaintenance();
    }
}
