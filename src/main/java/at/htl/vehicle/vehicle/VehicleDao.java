package at.htl.vehicle.vehicle;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleDao implements PanacheRepository<Vehicle> {

}
