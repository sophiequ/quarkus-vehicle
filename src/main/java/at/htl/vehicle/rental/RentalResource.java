package at.htl.vehicle.rental;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rentals")
@Produces(MediaType.APPLICATION_JSON)
public class RentalResource {

    @Inject
    RentalDao rentalDao;

    @Inject
    RentalMapper rentalMapper;

    @GET
    public Response findAll() {
        var rentals = rentalMapper.fromEntityList(rentalDao.listAll());
        return Response.ok(rentals).build();
    }

}
