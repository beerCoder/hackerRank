package com.java.thread;
import java.util.concurrent.Callable;

public class MyCallableFuture implements Callable<String> {

	private long waitTime;
	
	public MyCallableFuture(int timeInMillis){
		this.waitTime=timeInMillis;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
	}

}