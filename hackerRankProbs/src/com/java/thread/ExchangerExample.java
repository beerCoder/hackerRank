package com.java.thread;

import java.util.concurrent.Exchanger;

public class ExchangerExample
{

		Exchanger exchanger = new Exchanger();

		private class Producer implements Runnable
		{
				private String queue;
				@Override
				public void run()
				{
					try
					{
							 //create tasks & fill the queue
							 //exchange the full queue for a empty queue with Consumer
							 queue = (String)exchanger.exchange("Ready Queue");
							 System.out.println(Thread.currentThread().getName()+" now has "+queue);
					}
					catch (InterruptedException e)
					{
							e.printStackTrace();
					}
				}
		}

		private class Consumer implements Runnable
		{

				private String queue;
				@Override
				public void run()
				{
					try
					{
							//do procesing & empty the queue
							//exchange the empty queue for a full queue with Producer
							queue = (String)exchanger.exchange("Empty Queue");
							System.out.println(Thread.currentThread().getName()+" now has "+queue);
					}
					catch (InterruptedException e)
					{
							e.printStackTrace();
					}
				}
		}

		private void start()
		{
				new Thread(new Producer(),"Producer").start();
				new Thread(new Consumer(),"Consumer").start();
		}

		public static void main(String[] args)
		{
				new ExchangerExample().start();
		}

}
/*
V exchange(V x)
exchange() method enables two threads to exchange their data between each other in java.
If current thread is first one to call exchange() method then it will wait until one of following things happen >
Some other thread calls exchange() method in java, or
Some other thread interrupts the current thread in java, or

 If some other thread has already called exchanger() method then it resumes its execution and following things happen -
waiting thread is resumed and receives data from current thread in java.
current thread receives data from that waiting thread and it returns immediately in java.

 V exchange(V x, long timeout, TimeUnit unit)
exchange() method enables two threads to exchange their data between each other in java.

 If current thread is first one to call exchange() method then it will until one of following things happen in java >
Some other thread calls exchange() method in java, or
Some other thread interrupts the current thread in java, or
The specified timeout elapses in java.

 If some other thread has already called exchanger() method then it resumes its execution and following things happen -
waiting thread is resumed and receives data from current thread in java.
current thread receives data from that waiting thread and it returns immediately in java.

*/
