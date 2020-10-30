import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Character> alphabet = new ArrayList<Character>();
    for (char ch = 'a'; ch <= 'z'; ++ch) {
      alphabet.add(ch);
    }

    System.out.println(alphabet);
    Collections.shuffle(alphabet);
    System.out.println(alphabet);
    int randomNumber = r.nextInt(25);
    System.out.println(alphabet.get(randomNumber));
  }
}