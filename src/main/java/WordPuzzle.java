import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class WordPuzzle {
  public static void main(String[] args){

    // Spark Forms magic

    staticFileLocation("/public");
    String layout = "templates/layout.vtl"; //locates layout file

    // Makes homepage "http://localhost:4567/",  will search for file in public/templates/form.vtl
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    //Makes a results page
    get ("/results", (request,response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/results.vtl");

      //grabs $yourUserInputString:
      String stringOfUserInput = request.queryParams("yourUserInputString");
      Integer userInput = Integer.parseInt(stringOfUserInput);
      String output = yourMethod(userInput);

      //replaces "$result" on the /results page with output:
      model.put("result", output);
      return new ModelAndView(model,layout);
      }, new VelocityTemplateEngine());

  }

  //New Method {}
}
