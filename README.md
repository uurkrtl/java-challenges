Palindrom:
Schreiben Sie eine Java-Funktion, die überprüft, ob ein gegebener String ein Palindrom ist. Ein Palindrom ist ein Wort, Satz oder eine Sequenz von Zeichen, die von vorne und von hinten gelesen gleich sind, nachdem man die Leerzeichen und Satzzeichen ignoriert hat. Ihre Funktion sollte true zurückgeben, wenn der Eingabestring ein Palindrom ist, andernfalls false.
Beispiel:
public static boolean isPalindrome(String str) {
    // Ihre Lösung hier
}

public static void main(String[] args) {
    System.out.println(isPalindrome("racecar")); // Ausgabe: true
    System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // Ausgabe: true
    System.out.println(isPalindrome("hello")); // Ausgabe: false
}

**********************************

Anagram
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.
isAnagram has the following parameters:
* string a: the first string
* string b: the second string

Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.