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

  @Test
  public void wordPuzzle_ReplaceAllVowels_FineWithSpaces() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String testResult = "th- d-g";
    assertEquals(testResult, testWordPuzzle.makeWordPuzzle("the dog"));
  }

  @Test
  public void wordPuzzle_ReplaceAllVowels_UnderstandsNonAlphas() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String testResult = "b--ld---t?";
    assertEquals(testResult, testWordPuzzle.makeWordPuzzle("build-out?"));
  }

}
