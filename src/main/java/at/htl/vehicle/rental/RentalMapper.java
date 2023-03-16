package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.Vehicle;
import at.htl.vehicle.vehicle.VehicleDto;
import at.htl.vehicle.vehicle.VehicleMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.ZoneOffset;
import java.util.List;

@ApplicationScoped
public class RentalMapper {

    @Inject
    VehicleMapper vehicleMapper;

    public RentalDto fromEntity(Rental rental) {
        return new RentalDto(
                rental.getId(),
                rental.getPerson().getId(),
                vehicleMapper.fromEntity(rental.getVehicle()),
                rental.getStartDateTime().toEpochSecond(ZoneOffset.UTC),
                rental.getEndDateTime().toEpochSecond(ZoneOffset.UTC),
                rental.getDiscount()
        );
    }

    public List<RentalDto> fromEntityList(List<Rental> rentalList) {
        return rentalList
                .stream()
                .map(this::fromEntity)
                .toList();

    }
}
