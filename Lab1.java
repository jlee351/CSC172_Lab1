import java.util.Scanner;
import java.util.Arrays;

public class Lab1{

  //isAnagram; two string parameters for comparison
  public static void isAnagram(String a, String b){
    //boolean for whether or not the two strings are anagrams
    boolean anagram;

    //sees if the two strings are of the same length
    if (a.length() == b.length()) {
      //puts the two strings into two separate char arrays.
      char[] Array1 = a.toCharArray();
      char[] Array2 = b.toCharArray();
      Arrays.sort(Array1);
      Arrays.sort(Array2);
      anagram = Arrays.equals(Array1, Array2);
    }
    //if two strings aren't the same length, is false
    else {
      anagram = false;
    }
    //prints true if anagram, false if not.
    if (anagram) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }
  }
  //isRotation; two string parameters for comparison
  public static void isRotation(String a, String b){
    //boolean for expressing rotation or not. temp(orary) String for temporary comparison
    boolean rotation;
    String temp;
    //checks if two strings are of the same length
    if(a.length() == b.length()){
        //puts the first string twice; this way if the second string is a rotation of the first one
        //it is always a part of the bigger string temp.
        temp = a + a;
        rotation = temp.contains(b);
    }
    //if not same length, false.
    else {
      rotation = false;
    }
    //prints true if rotation, false if not.
    if(rotation){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
  }
  //main method.
  public static void main(String[] args) {
    //new scanner object
    Scanner scnr = new Scanner(System.in);
    //takes in two strings for the isAnagram
    System.out.println("first input for isAnagram: ");
    String input1 = scnr.nextLine();
    System.out.println("second input for isAnagram: ");
    String input2 = scnr.nextLine();
    //executes isAnagram
    isAnagram(input1, input2);
    //takes in two strings for the isRotation
    System.out.println("first input for isRotation: ");
    String input3 = scnr.nextLine();
    System.out.println("second input for isRotation: ");
    String input4 = scnr.nextLine();
    //executes isRotation
    isRotation(input3, input4);

  }

}
