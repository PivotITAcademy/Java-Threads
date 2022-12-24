package com.example.Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Starting Thread 1....");
		MyHashTable ht=new MyHashTable();
		ht.fillHashTable();
		ht.updateHashTable("Manvir", 43);
		ht.printHashTableValues();
		System.out.println("Stoping Thread 1....");

	}

}
