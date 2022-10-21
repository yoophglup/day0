package com.methodindustries.problems;

public class FizzBuzz {
	// multiple 3 is Fizz
	// Multiple 5 is Buzz
	// multiple 3 and 5 is FizzBuzz
	
	
	
	int counter;
	
	FizzBuzz(int i){
		this.counter = i;	
	}
	FizzBuzz(){}
	
	public void run() {
		for (int i=1; i <= this.counter; i++) {
		System.out.println(calculate(i));
		}
	}
	public String calculate(int i) {
		if (fizz(i) && buzz(i)) {
			return "FizzBuzz";
		}
		else if ((fizz(i))) {
			return "Fizz";
		}
		else if ((buzz(i))){
			return "Buzz";
		}
		else {
			return Integer.toString(i);
		}
	}
	
	public static boolean fizz(int i) {
		if (i%3==0) {
			return true;
		}
		return false;
	}
	public  static boolean buzz(int i) {
		return i%5==0;
		
	}
}