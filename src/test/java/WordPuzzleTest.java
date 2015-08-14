import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import static org.junit.Assert.*;
import spark.template.velocity.VelocityTemplateEngine;

public class WordPuzzleTest {
  public static void main(String[] args) {}

  @Test
  public void wordPuzzle_ReplaceAllVowels_AllVowelsBecomeDashes() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String testResult = "-ppl-";
    assertEquals(testResult, testWordPuzzle.makeWordPuzzle("apple"));
  }

  @Test
  public void wordPuzzle_ReplaceAllVowels_UnderstandsCase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String testResult = "-ppl-";
    assertEquals(testResult, testWordPuzzle.makeWordPuzzle("Apple"));
  }

}

/*
Behavior                                 Input           Output

Replaces vowels in a string wth -        apple           -ppl-
Understands upper/lowercase              Apple           -ppl-
Leaves spaces as is                      the dog         th- d-g
Handles non alpha characters             fsho!!#!        fsh-!!#!
Responds to blank entries                                Please type a sentence

*/
