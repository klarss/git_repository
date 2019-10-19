/**
 * WhatTime.java
 */

import java.util.Calendar;

public class WhatTime implements Runnable{
	private int hour;
	private int min;
	private int sec;
	public void run() {
		while(true) {
			Calendar calendar = Calendar.getInstance();
			hour = calendar.get(Calendar.HOUR_OF_DAY);
			min = calendar.get(Calendar.MINUTE);
			sec = calendar.get(Calendar.SECOND);
			System.out.println(hour + ":" + min + ":" + sec);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		WhatTime time = new WhatTime();
		new Thread(time).start();
	}
}
