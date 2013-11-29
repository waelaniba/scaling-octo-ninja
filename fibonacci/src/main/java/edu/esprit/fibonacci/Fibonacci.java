package edu.esprit.fibonacci;

public class Fibonacci {

	
	public long fibo(int i) {

		if(i <= 1)
			return i;
		
		return fibo(i-1) + fibo(i-2);
			 
	}


}
