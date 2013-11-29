package edu.esprit.fibonacci;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {
	
	
  @Test
  public void shouldReturnZeroWhenZeroIn() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(0);
	  Assert.assertEquals(0, fibo);
	  
  }
  
  @Test
  public void shouldReturnOneWhenOneIn() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(1);
	  Assert.assertEquals(1, fibo);
	  
  } 
  
  @Test
  public void shouldReturnOneWhenTwoIn() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(2);
	  Assert.assertEquals(1, fibo);
	  
  }   
  
  @Test
  public void shouldReturnTwoWhenThreeIn() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(3);
	  Assert.assertEquals(2, fibo);
	  
  }     
  
  
  
}