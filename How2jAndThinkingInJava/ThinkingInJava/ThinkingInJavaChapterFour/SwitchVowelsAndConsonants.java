package ThinkingInJava.ThinkingInJavaChapterFour;

import java.util.Random;

public class SwitchVowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char)c+", "+c+": ");
            switch (c){
                case 'a':
                    System.out.println("vowel");
                    break;
                case 'e':
                    System.out.println("vowel");
                    break;
                case 'i':
                    System.out.println("vowel");
                    break;
                case 'o':
                    System.out.println("vowel");
                    break;
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                    System.out.println("vowel");
                    break;
                case 'w':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
