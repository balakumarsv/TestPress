package com.one;

import java.util.Random;
import java.util.Scanner;
public class ProgramOne {

	    public static void main(String[] args) {
	        String[] words = {"apple", "banana", "orange", "grape", "melon", "peach", "kiwi", "strawberry"};
	        Random random = new Random();
	        String wordToGuess = words[random.nextInt(words.length)];
	        int attempts = 10;
	        StringBuilder guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));

	        Scanner scanner = new Scanner(System.in);

	        while (attempts > 0) {
	        	System.out.println(wordToGuess);
	            System.out.println("Guess the word: " + guessedWord);
	            System.out.println("Attempts left: " + attempts);
	            System.out.print("Enter a character: ");
	            char guess = scanner.next().charAt(0);

	            boolean found = false;
	            for (int i = 0; i < wordToGuess.length(); i++) {
	                if (wordToGuess.charAt(i) == guess) {
	                    guessedWord.setCharAt(i, guess);
	                    found = true;
	                }
	            }

	            if (!found) {
	                attempts--;
	                System.out.println("Incorrect guess. Try again.");
	            }

	            if (guessedWord.toString().equals(wordToGuess)) {
	                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
	                break;
	            }
	        }

	        if (attempts == 0) {
	            System.out.println("Sorry! You ran out of attempts. The word was: " + wordToGuess);
	        }

	        scanner.close();
	    }
	}


