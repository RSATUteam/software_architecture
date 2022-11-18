package view.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/writer/")
@Produces({ MediaType.APPLICATION_JSON })
public class WriterAPI {
    @GET
    @Path("/news/my")
    public Response getMyNews() {

        return Response.ok().entity(202).build();
    }

    @GET
    @Path("/category/my")
    public Response getMyCategories() {

        return Response.ok().entity(202).build();
    }
}
