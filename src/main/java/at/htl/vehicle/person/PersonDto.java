package at.htl.vehicle.person;

import java.time.LocalDate;

public record PersonDto(
        Long id,
        String name,
        String dob
) {

}
