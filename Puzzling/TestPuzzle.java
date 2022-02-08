import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class TestPuzzle {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		ArrayList<Integer> randomRolls = generator.getTenRolls();
        char letter = generator.getRandomLetter();
        String password = generator.generatorPassword();
        ArrayList<String> randompasswords = generator.getNewPasswordSet(6);

		System.out.println(randomRolls);
        System.out.println(letter);
        System.out.println(password);
        System.out.println(randompasswords);


		
    	//..
		// Write your other test cases here.
		//..
	}
}
