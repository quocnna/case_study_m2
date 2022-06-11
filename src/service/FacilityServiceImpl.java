package service;

import model.Facility;
import model.House;
import model.Room;
import model.Villa;
import util.ConstantUtil.RentType;
import util.ConstantUtil.RoomType;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilitys = new LinkedHashMap<>();

    static {
        House house = new House("HOU01", "Sweet House", 5, 55555, 5, RentType.MONTH, RoomType.STANDARD, 3);
        Room room = new Room("ROM1", "Single Room", 20, 20, 1, RentType.DAY, "massage");
        Villa villa = new Villa("VIL01", "Aston Villa", 12, 123, 10, RentType.MONTH, RoomType.DELUXE, 234, 3);
        Villa villa2 = new Villa("VIL02", "Aston Villa", 12, 123, 10, RentType.MONTH, RoomType.DELUXE, 234, 3);

        facilitys.put(house, 0);
        facilitys.put(room, 0);
        facilitys.put(villa, 0);
        facilitys.put(villa2, 0);
    }

    @Override
    public void create(Facility facility) {
        facilitys.put(facility, 0);
    }

    @Override
    public void update(Facility facility) {
        Integer val = 0;
        Iterator<Map.Entry<Facility, Integer>> iterator = facilitys.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Facility, Integer> entry = iterator.next();
            if (entry.getKey().getCode().equals(facility.getCode())) {
                val = entry.getValue();
                iterator.remove();
                break;
            }
        }

        facilitys.put(facility, val);
    }

    @Override
    public List<Facility> findAll() {
        return facilitys.keySet().stream().toList();
    }

    @Override
    public Map<Facility, Integer> findAllMaintenance() {
        return facilitys;
    }
}
