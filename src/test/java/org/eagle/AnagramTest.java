package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    void anagramControl_Anagram_True(){
        Anagram anagram = new Anagram();
        String a = "CAT";
        String b1 = "CAT";
        String b2 = "ACT";
        String b3 = "tac";
        String b4 = "TCA";
        String b5 = "aTC";
        String b6 = "CtA";
        boolean expected = true;
        boolean actual1 = anagram.anagramControl(a,b1);
        boolean actual6 = anagram.anagramControl(a,b6);
        boolean actual2 = anagram.anagramControl(a,b2);
        boolean actual3 = anagram.anagramControl(a,b3);
        boolean actual4 = anagram.anagramControl(a,b4);
        boolean actual5 = anagram.anagramControl(a,b5);
        Assertions.assertEquals(expected,actual1);
        Assertions.assertEquals(expected,actual2);
        Assertions.assertEquals(expected,actual3);
        Assertions.assertEquals(expected,actual4);
        Assertions.assertEquals(expected,actual5);
        Assertions.assertEquals(expected,actual6);
    }


    @Test
    void anagramControl_NoAnagram_False(){
        Anagram anagram = new Anagram();
        String a = "ata";
        String b = "tta";
        boolean expected = false;
        boolean actual = anagram.anagramControl(a,b);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void anagramControl_NoAnagram2_False(){
        Anagram anagram = new Anagram();
        String a = "ab";
        String b = "abXY";
        boolean expected = false;
        boolean actual = anagram.anagramControl(a,b);
        Assertions.assertEquals(expected,actual);
    }
}
