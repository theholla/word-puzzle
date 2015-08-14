import java.util.*;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class WordPuzzle {
  /*public static void main(String[] args){
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
    }, new VelocityTemplateEngine());*/
  }

  public static void makeWordPuzzle(String userInput){

    String staticUserInput = "let the people ride bikes!";
    String[] userInputArray = staticUserInput.split("");

    HashMap <String, String> vowels = new HashMap <String, String>();
      vowels.put("a", "-");
      vowels.put("e", "-");
      vowels.put("i", "-");
      vowels.put("o", "-");
      vowels.put("u", "-");

    for (String letter : userInputArray) {
      String encryptedLetters = vowels.get(letter);
      //String[] encryptedUserInputArray = userInputArray(vowels.get(letter));
      System.out.println(encryptedLetters);
    }

/*
x User inputs a String
x App separates that String into a String[]
x Looks for vowels
x Replaces vowels with -
??? Returns new string

*/

  }

}
