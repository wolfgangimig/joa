/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Background thread pool. Use this thread pool to execute COM functions in
 * Background.
 */
public class BackgTask {
	
	private final static Logger log = Logger.getLogger("BackgTask");
	
	public static void run(Runnable runnable) {
		final long startTime = System.currentTimeMillis();
		RejectedExecutionException lastException = null;
		while (System.currentTimeMillis() - startTime < RETRY_REJECTED_TIMEOUT) {
			try {
				instance.tpool.execute(runnable);
				lastException = null;
				break;
			}
			catch (RejectedExecutionException e) {
				lastException = e;
				try {
					long sleepMillis = randomTimeout.nextInt(100);
					Thread.sleep(sleepMillis);
				}
				catch (InterruptedException e2) {
					break;
				}
			}
		}
		if (lastException != null) {
			log.log(Level.WARNING, "Failed to add background task", lastException);
		}
	}

	public static void done() {
		instance.tpool.shutdownNow();
	}

	private static BackgTask instance = new BackgTask();

	private ExecutorService tpool;
	private final static int NB_OF_THREADS = 20;
	private final static long RETRY_REJECTED_TIMEOUT = 5 * 1000;
	private final static Random randomTimeout = new Random();

	private BackgTask() {
		
		int nbOfThreads = NB_OF_THREADS;
		String nb = System.getProperty("com.wilutions.com.BackgThread.NB_OF_THREADS");
		if (nb != null && nb.length() != 0) {
			try {
				nbOfThreads = Integer.parseInt(nb);
				nbOfThreads = Math.min(10, Math.max(nbOfThreads, 1));
			} catch (Throwable e) {
			}
		}

		tpool = Executors.newCachedThreadPool(new ThreadFactory() {
			public Thread newThread(Runnable r) {
				return new Thread(r, "Joa-backg-" + threadCount.incrementAndGet()) {
					public void run() {
						try {
							super.run();
						}
						catch (Throwable e) {
							e.printStackTrace();
						}
					}
				};
			}
		});

		((ThreadPoolExecutor) tpool).setMaximumPoolSize(nbOfThreads);
	}
	
	private final static AtomicInteger threadCount = new AtomicInteger();

}
