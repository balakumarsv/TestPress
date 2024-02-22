package com.one;

import java.util.Arrays;

public class Two {

	    public static int candy(int[] ratings) {
	        int n = ratings.length;
	        int[] candies = new int[n];

	        // Initialize all candies to 1
	        Arrays.fill(candies, 1);

	        // Traverse from left to right, give more candies to the right neighbor if rating is higher
	        for (int i = 1; i < n; i++) {
	            if (ratings[i] > ratings[i - 1]) {
	                candies[i] = candies[i - 1] + 1;
	            }
	        }

	        // Traverse from right to left, give more candies to the left neighbor if rating is higher
	        for (int i = n - 2; i >= 0; i--) {
	            if (ratings[i] > ratings[i + 1]) {
	                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
	            }
	        }

	        // Sum up all the candies
	        int totalCandies = 0;
	        for (int candy : candies) {
	            totalCandies += candy;
	        }

	        return totalCandies;
	    }

	    public static void main(String[] args) {
	        int[] ratings1 = {1, 0, 2};
	        System.out.println("Total candies distributed for ratings {1, 0, 2}: " + candy(ratings1)); // Output: 5

	        int[] ratings2 = {1, 2, 2};
	        System.out.println("Total candies distributed for ratings {1, 2, 2}: " + candy(ratings2)); // Output: 4
	      
	        int[] ratings3 = {1, 2, 3};
	        System.out.println("Total candies distributed for ratings {1, 2, 3}: " + candy(ratings3)); // Output: 6
	    
	    }
	}


