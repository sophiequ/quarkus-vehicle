package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.Vehicle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class RentalDao {


    @Inject
    EntityManager entityManager;

    public Rental find(long id) {
        return entityManager.find(Rental.class, id);
    }

    public List<Rental> findAll() {
        return entityManager
                .createNamedQuery("Rental.findAll", Rental.class)
                .getResultList();
    }

}
