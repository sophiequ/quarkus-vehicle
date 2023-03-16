package at.htl.vehicle.person;

import at.htl.vehicle.rental.Rental;
import at.htl.vehicle.rental.RentalDto;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@ApplicationScoped
public class PersonMapper {

    public PersonDto fromEntity(Person person) {
        return new PersonDto(person.getId(),
                person.getName(),
                person.getDob().toString());
    }

    public List<PersonDto> fromEntityList(List<Person> personList) {
        return personList
                .stream()
                .map(this::fromEntity)
                .toList();

    }

}
