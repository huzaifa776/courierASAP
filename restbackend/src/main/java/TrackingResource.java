import domain.Tracking;
import domain.TrackingService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;


@Stateless
@Path("tracking")
public class TrackingResource {

    @Inject
    private TrackingService trackingService;

    @GET
    @Produces("application/json")
    public List<Tracking> all() {
        return trackingService.retrieveData();
    }

    @POST
    @Consumes("application/json")
    public void save(Tracking tracking) {
        trackingService.storeData(tracking);
    }
}