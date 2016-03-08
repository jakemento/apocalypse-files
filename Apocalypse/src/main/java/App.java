import java.util.*;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String [] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nw", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/nw.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/ne", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/ne.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/sw", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/sw.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/se", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/se.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nw/1", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/nw1.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nw/2", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/nw2.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nw/3", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/nw3.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nw/4", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/nw4.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
