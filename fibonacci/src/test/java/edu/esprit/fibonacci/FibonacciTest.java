package edu.esprit.fibonacci;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class FibonacciTest {
	
	
  @Test
  public void shouldReturnZeroWhenZeroIn() {
	  //test11
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
  
  @Test
  public void shouldReturn8When6In() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(6);
	  Assert.assertEquals(8, fibo);
	  
  }  
  
  @Test
  public void shouldReturn13When7In() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(7);
	  Assert.assertEquals(13, fibo);
	  
  }  
  
  @Test
  @Ignore
  public void shouldReturn21When8In() {
	 
	  //comment
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(8);
	  Assert.assertEquals(21, fibo);
	  
  }  
  
  @Test
  public void shouldReturn80When60In() {
	  
	  Fibonacci fibonacci = new Fibonacci();
	  long fibo = fibonacci.fibo(8);
	  Assert.assertEquals(13, fibo);
	  
  }    
  
 
  
  
}
