package view.rest;

import DTO.AllCategoriesDTO;
import DTO.CategoryDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Path("/reader/")
@Produces({ MediaType.APPLICATION_JSON })
public class ReaderApi {
    CategoryDTO fictionCategoryDTO = new CategoryDTO( "1", "Какие-то новости", 10);
    CategoryDTO fictionCategory2DTO = new CategoryDTO( "2", "Ещё какие-то новости", 5);
    AllCategoriesDTO allCategoriesDTO = new AllCategoriesDTO(Arrays.asList(fictionCategoryDTO, fictionCategory2DTO));

    @GET
    @Path("/category/all")
    public Response getAllCategory() {
        return Response.ok().entity(allCategoriesDTO).build();
    }

    @GET
    @Path("/category")
    public Response getOneCategory(@QueryParam("id") String id) {
        CategoryDTO categoryDTO = allCategoriesDTO.list.stream()
                .filter(item -> item.id.equals(id))
                .findFirst()
                .orElse(null);

        if (categoryDTO == null) {
            return  Response.status(404).build();
        }
        return  Response.ok().entity(categoryDTO).build();
    }
}