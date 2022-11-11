import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Path("/")
public class RestGetNews implements RestServiceGetNews{
    @GET
    @Path("echo")
    @Override
    public String echo(@QueryParam("q") String original) {
        return original;
    }
}