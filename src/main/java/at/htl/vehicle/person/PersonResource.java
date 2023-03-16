package at.htl.vehicle.person;

import at.htl.vehicle.vehicle.Vehicle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("person")
@Produces({MediaType.APPLICATION_JSON})
public class PersonResource {

    @Inject
    PersonDao personDao;

    @Inject
    PersonMapper personMapper;

    @GET
    @Path("{id}")
    public PersonDto find(@PathParam("id") long id) {
        return personMapper.fromEntity(personDao.find(id));
    }

}
