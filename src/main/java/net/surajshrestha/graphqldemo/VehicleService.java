package net.surajshrestha.graphqldemo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository ;

    public VehicleService(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }

    @Transactional
    public Vehicle createVehicle(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.type = type;
        vehicle.modelCode = modelCode;
        vehicle.brandName = brandName;
        vehicle.launchDate = LocalDate.parse(launchDate);
        return this.vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles(final int count) {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Vehicle> getVehicle(final int id) {
//        return this.vehicleRepository.findById(id);
        return null;
    }
}