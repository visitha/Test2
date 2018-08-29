package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("faaaat");
	}


	public static boolean isPalindrome(String word) {

		char[] charArray = word.toCharArray();
		int lengthOfArray = charArray.length;
		char[] palindrome = new char[charArray.length];

		for(int i = 0; i < lengthOfArray; i++) {
			palindrome[i] = charArray[lengthOfArray - 1 -i];
		}

		String finalWord = String.valueOf(palindrome);
		if(finalWord.equalsIgnoreCase(word)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPalindromeInt(int n) {

		int r,sum=0,temp;

		temp=n;
		while(n>0){
			r=n%10;  //getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}

		if(temp==sum)
			return true;
		else
			return false;
	}
}
