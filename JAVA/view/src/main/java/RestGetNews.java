import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.FormParam;
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

    @GET
    @Path("echo")
    @Override
    public JSONObject getJSON(@FormParam("request") String request_str) {
        JSONObject json = new JSONObject();
        // парсим запрос, собираем json и отдаём его
        return json;
    }
}