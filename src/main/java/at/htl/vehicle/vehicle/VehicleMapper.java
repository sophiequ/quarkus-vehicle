package at.htl.vehicle.vehicle;

import at.htl.vehicle.person.Person;
import at.htl.vehicle.person.PersonDto;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class VehicleMapper {

    public VehicleDto fromEntity(Vehicle vehicle) {
        return new VehicleDto(vehicle.getId(),
                vehicle.getModel(),
                vehicle.getBrand());
    }

    public List<VehicleDto> fromEntityList(List<Vehicle> vehicleList) {
        return vehicleList
                .stream()
                .map(this::fromEntity)
                .toList();
    }

}
