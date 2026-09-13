package example;

import io.micronaut.runtime.Micronaut;
import io.micronaut.http.annotation.*;
import java.util.Map;

public class Application {
  public static void main(String[] args) { Micronaut.run(Application.class); }
  @Controller
  static class Health { @Get("/healthz") Map<String,String> health() { return Map.of("status", "ok"); } }
}
