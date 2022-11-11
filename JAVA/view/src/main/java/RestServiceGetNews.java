import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public interface RestServiceGetNews {
    @GET
    @Path("/")
    String echo(@QueryParam("q") String q);

    @GET
    @Path("echo")
    JSONObject getJSON(@FormParam("request") String request_str);
}
