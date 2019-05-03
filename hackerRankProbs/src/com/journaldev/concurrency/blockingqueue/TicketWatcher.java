package com.journaldev.concurrency.blockingqueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicketWatcher implements Runnable {

	private LinkedBlockingQueue<String> queue;
	private TicketProducer ticketProducer;

	public TicketWatcher(LinkedBlockingQueue<String> queue, TicketProducer ticketProducer) {
		this.queue = queue;
		this.ticketProducer = ticketProducer;
	}

	@Override
	public void run() {

		// As long as the producer is running,
		// we want to check for tickets.
		while (ticketProducer.isRunning()) {
			System.out.println("Tickets right now: " + queue);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("TicketWatcher Completed.");
		System.out.println("Final Tickets in the queue: " + queue);
	}

}