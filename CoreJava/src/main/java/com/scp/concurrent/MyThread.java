package com.scp.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread{
	//static HashMap map = new HashMap();
	static ConcurrentHashMap map = new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
			System.out.println("child thread is updating....");
			map.put(103, "XYZ");
		
	}
	public static void main(String[] args) {
		map.put(101, "Abc");
		map.put(102, "Bcd");
		MyThread t = new MyThread();
		t.start();
		Set s = map.keySet();
		Iterator itr= s.iterator();
		while(itr.hasNext()) {
			Integer i= (Integer) itr.next();
			System.out.println("main thread is iterating and current entry is: "+i+ "....."+map.get(i));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(map);

		
	}

}
