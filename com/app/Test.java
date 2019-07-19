package com.app;

import iififi
public class Test {
	int t=100;
	public synchronized void display() throws Exception{
		
		System.out.println(Thread.currentThread().getName()+" "+t);
		t=t-10;
		 try
		  {
		   Thread.sleep(1000);
		  }
		  catch(InterruptedException e)
		  {
		   e.printStackTrace();
		  }
			System.out.println(Thread.currentThread().getName()+" "+t);
	}

}
