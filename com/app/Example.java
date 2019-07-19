package com.app;
hhhhhhhh
public class Example extends Thread {
	int t=100;
	public  void run(){
		  System.out.println(Thread.currentThread().getName()+" "+t);  
	        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	        System.out.println(Thread.currentThread().getName()+" "+ t);//prints thread name 
	}
	   private synchronized void processmessage() {  
		   t=t-10;
	       
	    }

}
