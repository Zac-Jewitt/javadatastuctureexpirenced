package practise;

import strings.CharactersSame;
import strings.CheckAnagrams;

public class Third {
    public static void main(String[] args) {
        CheckAnagrams checkAnagrams = new CheckAnagrams();

        System.out.println("Using CheckAnagrams");
        System.out.println("water & hello = " +
                checkAnagrams.isAnagrams("water", "hello"));
        System.out.println("race & care = " +
                checkAnagrams.isAnagrams("race", "care"));

        CharactersSame charactersSame = new CharactersSame();

        System.out.println("\nUsing CharactersSame");
        System.out.println("ddddwwww = " +
                charactersSame.isAllCharactersSame("ddddwwww"));
        System.out.println("qqqqqqqq = " +
                charactersSame.isAllCharactersSame("qqqqqqqq"));

    }
}
