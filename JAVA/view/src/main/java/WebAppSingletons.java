import rest.ReaderApi;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class WebAppSingletons extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public WebAppSingletons() {
        singletons.add(new ReaderApi());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}