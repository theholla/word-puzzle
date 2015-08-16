import java.util.*;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

//imports needed to remove unwanted characters
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class WordPuzzle {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> { //makes homepage http://localhost:4567/
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get ("/results", (request,response) -> { //makes a results page from a template
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/results.vtl");

      //grabs $userInput:
      String userInput = request.queryParams("userinput");
      String output = makeWordPuzzle(userInput);

      //replaces "$result" on the /results page with output:
      model.put("result", output);
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());
  }

  public static String makeWordPuzzle(String userInput){
    String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
    for (String letter : vowels) {
      userInput = userInput.replaceAll(letter, "-");
    }

    return userInput;

  }

}
