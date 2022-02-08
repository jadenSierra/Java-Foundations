import java.util.*;

public class PuzzleJava{

    public static ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> outPut = new ArrayList<Integer>();
        Random random = new Random();
        int randNum;

        for(int i = 0; i <= 10; i++){
            randNum = 1+random.nextInt(20);
            outPut.add(randNum);
        }
        return outPut;
    }

    public static char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        int randLetter = random.nextInt(26);
        char letter = alphabet[randLetter];
        return letter;
    }
        
    public static String generatorPassword(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // Random random = new Random();
        // int randLetter = 1 + random.nextInt(26);
        // char letter = alphabet[randLetter];
        String password = "";

        for(int i = 0; i <= 8; i++){
        Random random = new Random();
        int randNum = random.nextInt(26);
        char letter = alphabet[randNum];
            password += letter ;
        }
        return password;
    }

    public static ArrayList<String> getNewPasswordSet(int length){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String password = "";
        ArrayList<String> passwordSet = new ArrayList<String>();

        for(int i = 1; i <= length; i++){
            password = "";
            for(int j = 0; j <= 8; j++){
            Random random = new Random();
            int randNum = random.nextInt(26);
            char letter = alphabet[randNum];
                password += letter;
            }
            
            passwordSet.add(password);
        }
        return passwordSet;
    }

}