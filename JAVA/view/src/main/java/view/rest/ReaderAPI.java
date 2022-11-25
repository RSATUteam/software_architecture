package view.rest;

import DTO.AllCategories;
import DTO.AllNews;
import DTO.CategoryDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/reader/")
@Produces({ MediaType.APPLICATION_JSON })
public class ReaderAPI {
    //CategoryDTO fictionCategoryDTO = new CategoryDTO( "1", "Какие-то новости", 10);
    //CategoryDTO fictionCategory2DTO = new CategoryDTO( "2", "Ещё какие-то новости", 5);
    //AllCategoriesDTO allCategoriesDTO = new AllCategoriesDTO(Arrays.asList(fictionCategoryDTO, fictionCategory2DTO));

    @GET
    @Path("/category/all")
    public Response getAllCategory() {
        AllCategories allCategories = new AllCategories();
        return getObject(allCategories.getCategories());
    }

    @GET
    @Path("/category")
    public Response getOneCategory(@QueryParam("id") String id) {
        CategoryDTO categoryDTO = new CategoryDTO(id);

        return getObject(categoryDTO);
    }

    @GET
    @Path("/news/all")
    public Response getAllNews(){
        AllNews allNews = new AllNews();
        return getObject(allNews.getNewsDTOList());
    }

    Response getObject(ArrayList<Object> obj){
        if (obj==null)
            return Response.ok().entity("NullArray").build();
        return Response.ok().entity(obj).build();
    }

    Response getObject(Object obj){
        if (obj==null)
            return Response.ok().entity("Null").build();
        return Response.ok().entity(obj).build();
    }
}