package at.htl.vehicle.person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonDao implements PanacheRepository<Person> {
}
