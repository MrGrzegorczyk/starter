package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainVerticle extends AbstractVerticle {

  public static void main(String[] args){
    SpringApplication.run(MainVerticle.class, args);
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(3000, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 3000");
      } else {
        startPromise.fail(http.cause());
      }
    });
  }
}
