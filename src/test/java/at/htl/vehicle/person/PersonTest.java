package at.htl.vehicle.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void itShouldStoreNameAndDob() {
        var person = new Person(
                "Susi",
                LocalDate.of(2020, Month.JANUARY,2)
        );
        assertThat(person.getName())
                .isNotEmpty()
                .isEqualTo("Susi");
        assertThat(person.getDob().toString())
                .isEqualTo("2020-01-02");
    }
}