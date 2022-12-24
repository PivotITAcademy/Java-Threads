package com.example.Threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Starting Thread 2....");
		MyHashTable ht= new MyHashTable();
		
		
		ht.updateHashTable("Manvir", 37);
		ht.printHashTableValues();
		System.out.println("Stopping Thread 2....");
		/*
		 * ht.fillMapTable(); ht.updateMapTable("Munni", 45); ht.printMapValues();
		 */
		
	}
}
