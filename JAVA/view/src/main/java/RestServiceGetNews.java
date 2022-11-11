import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public interface RestServiceGetNews {
    @GET
    @Path("/")
    String echo(@QueryParam("q") String q);
    
}
