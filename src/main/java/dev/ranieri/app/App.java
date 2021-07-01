package dev.ranieri.app;

import io.javalin.Javalin;

public class App {
    static int counter = 0;

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());

        app.get("/hola",context -> {
            context.result("Hola this many requests have been handled by the server version 4.0 now with a webhook that WORKS:   " + ++App.counter);
        });

        app.start();
    }
}
