package com.journaldev.concurrency.blockingqueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicketConsumer implements Runnable {
	private LinkedBlockingQueue<String> queue;
	private TicketProducer ticketProducer;

	public TicketConsumer(LinkedBlockingQueue<String> queue,
			TicketProducer ticketProducer) {
		this.queue = queue;
		this.ticketProducer = ticketProducer;
	}

	@Override
	public void run() {

		// As long as the producer is running,
		// we remove ticket from the queue.
		while (ticketProducer.isRunning()) {

			try {
				System.out.println("Removing Ticket: " + queue.take());

				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("TicketConsumer completed.");
	}
}