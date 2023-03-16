package at.htl.vehicle.rental;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RentalDao implements PanacheRepository<Rental> {

}
