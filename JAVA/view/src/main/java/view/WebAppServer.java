package view;

import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

/**
 * Консольное приложение.
 */
public class WebAppServer {

    public static void main(String[] argv) {
        startWebServer();
    }

    private static final int PORT = 8080;

    /**
     * Запускает web-сервер. По окончании работы требуется ручная остановка процесса.
     */
    private static void startWebServer()
    {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start(Undertow.builder().addHttpListener(PORT, "localhost"));
        server.deploy(WebAppSingletons.class);
        System.out.println("Сервер запущен: http://localhost:" + PORT);
        System.out.println("http://localhost:" + PORT+"/reader/category/all");
        System.out.println("http://localhost:" + PORT+"/reader/category");
    }
}
