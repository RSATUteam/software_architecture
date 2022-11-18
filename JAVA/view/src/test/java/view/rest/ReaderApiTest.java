package view.rest;


import DTO.AllCategoriesDTO;
import DTO.CategoryDTO;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;
import org.jboss.resteasy.test.TestPortProvider;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import view.WebAppSingletons;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ReaderApiTest {
    private static Client client;
    private static UndertowJaxrsServer server;
    private static Response response;
    private static WebTarget categoryResource;

    @BeforeClass
    public static void init() {
        client = ClientBuilder.newClient();
        categoryResource = client.target(TestPortProvider.generateURL("/reader/category"));
        server = new UndertowJaxrsServer().start();
        server.deploy(WebAppSingletons.class);
    }

    @AfterClass
    public static void stop() {
        client.close();
        server.stop();
    }

    @Test
    public void readAllCategories() {
        response  = categoryResource.path("/all").request().get();
        AllCategoriesDTO allCategoriesDTO = response.readEntity(AllCategoriesDTO.class);
        Assert.assertEquals(2, allCategoriesDTO.list.size());
    }
    @Test
    public void readCategory() {
        response  = categoryResource.queryParam("id", "2").request().get();
        CategoryDTO categoryDTO = response.readEntity(CategoryDTO.class);
        Assert.assertEquals("2", categoryDTO.id);
    }
}