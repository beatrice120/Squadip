import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "hello.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero-form", (request, response) -> {
            return new ModelAndView(new HashMap(), "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

      //  get("/favorite_photos", (request, response) -> {
            //return new ModelAndView(new HashMap(), "favorite_photos.hbs");
      //  }, new HandlebarsTemplateEngine());//
    }
}