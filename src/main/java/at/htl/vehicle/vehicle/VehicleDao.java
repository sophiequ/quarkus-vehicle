package at.htl.vehicle.vehicle;

import at.htl.vehicle.person.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class VehicleDao {

    @Inject
    EntityManager entityManager;

    public Vehicle find(long id) {
        return entityManager.find(Vehicle.class, id);
    }

    public List<Vehicle> findAll() {
        return entityManager
                .createNamedQuery("Vehicle.findAll", Vehicle.class)
                .getResultList();
    }
}
