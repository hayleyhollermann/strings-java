package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string! ";
        System.out.println("My first string is: " + myString);
        myString = myString + "Now I have 2 sentences!!";
        System.out.println("My longer string is: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My copyrighted string is: " + myString);
    }
}
