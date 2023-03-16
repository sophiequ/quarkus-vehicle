package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.VehicleDto;

import java.math.BigDecimal;

public record RentalDto(
        Long id,
        long personId,
        VehicleDto vehicle,
        long startDateTime,
        long endDateTime,
        BigDecimal discount
) {
}
