package at.htl.vehicle.vehicle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("vehicle")
@Produces({MediaType.APPLICATION_JSON})
public class VehicleResource {

    @Inject
    VehicleDao vehicleDao;

    @Inject
    VehicleMapper vehicleMapper;

    @GET
    @Path("{id}")
    public VehicleDto find(@PathParam("id") long id) {
        return vehicleMapper.fromEntity(vehicleDao.findById(id));
    }

    @GET
    public List<VehicleDto> findAll() {
        return vehicleMapper.fromEntityList(vehicleDao.listAll());
    }

}
