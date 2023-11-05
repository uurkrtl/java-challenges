package org.eagle;

import java.util.Arrays;

public class Anagram {
    public boolean anagramControl(String a, String b){
        /*char[] chr1 = a.toLowerCase().toCharArray();
        char[] chr2 = b.toLowerCase().toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        return Arrays.equals(chr1,chr2);*/


        //No java.util:
        int foundedChr = 0;
        char[] chr1 = a.toLowerCase().toCharArray();
        char[] chr2 = b.toLowerCase().toCharArray();
        if (chr1.length!=chr2.length) return false;
        for (char chr : chr1){
            for (int i = 0; i<chr2.length; i++){
                if (chr==chr2[i]){
                    chr2[i]=00;
                    foundedChr++;
                    break;
                }
            }
        }
        return foundedChr == chr1.length;
    }
}
