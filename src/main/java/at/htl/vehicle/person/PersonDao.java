package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class PersonDao {

    @Inject
    EntityManager entityManager;

    public Person find(long id) {
        return entityManager.find(Person.class, id);
    }

}
