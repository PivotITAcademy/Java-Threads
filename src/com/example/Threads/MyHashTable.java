package com.example.Threads;

import java.util.HashMap;
import java.util.Hashtable;

public class MyHashTable {

	
	Hashtable<String, Integer> table=new Hashtable<>();
	
	HashMap<String, Integer> map=new HashMap<>();
	
	
	public void fillHashTable() {
		table.put("Manvir", 34);
		table.put("Shyam", 23);
	}
	
	public void updateHashTable(String key,Integer value) {
		table.put(key, value);
	}
	
	public void printHashTableValues() {
		table.entrySet().forEach(s->System.out.println(s.getKey() + " " + s.getValue()));
	}
	
	public void fillMapTable() {
		map.put("Munni", 34);
		map.put("Badname", 23);
	}
	
	public void updateMapTable(String key,Integer value) {
		map.put(key, value);
	}
	
	public void printMapValues() {
		map.entrySet().forEach(s->System.out.println(s.getKey() + " " + s.getValue()));
	}
	
}
