package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.ZoneId;

@ApplicationScoped
public class PersonMapper {

    public PersonDto fromEntity(Person person) {
        return new PersonDto(person.getId(),
                person.getName(),
                person.getDob().toString());
    }

}
