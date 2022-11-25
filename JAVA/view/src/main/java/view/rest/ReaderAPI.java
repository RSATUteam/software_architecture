package view.rest;

import DTO.AllCategories;
import DTO.CategoryDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/reader/")
@Produces({ MediaType.APPLICATION_JSON })
public class ReaderAPI {
    //CategoryDTO fictionCategoryDTO = new CategoryDTO( "1", "Какие-то новости", 10);
    //CategoryDTO fictionCategory2DTO = new CategoryDTO( "2", "Ещё какие-то новости", 5);
    //AllCategoriesDTO allCategoriesDTO = new AllCategoriesDTO(Arrays.asList(fictionCategoryDTO, fictionCategory2DTO));

    @GET
    @Path("/category/all")
    public Response getAllCategory() {
        AllCategories allCategories= new AllCategories();
        return Response.ok().entity(allCategories).build();
    }

    @GET
    @Path("/category")
    public Response getOneCategory(@QueryParam("id") String id) {
        CategoryDTO categoryDTO = new CategoryDTO(id);

        return  Response.ok().entity(categoryDTO).build();
    }
}