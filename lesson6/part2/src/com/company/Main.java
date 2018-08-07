package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] mas = new int [800000];
	for(int i = 0; i < mas.length; i++) mas[i] =  new Random().nextInt(10);

	Instant start = Instant.now();
	System.out.println(Servise.getSumFromMasInt(mas));
	Instant end = Instant.now();
	System.out.println("time for one thread: " +  Duration.between(start, end));

	ServiseTwo ser1 = new ServiseTwo(0,400000,mas);
	ServiseTwo ser2 = new ServiseTwo(400000,800000,mas);

	Thread thr1 = new Thread(ser1);
	Thread thr2 = new Thread(ser2);

	thr1.start();
	thr2.start();
		try {
			start = Instant.now();
			thr1.join();
			thr2.join();
			System.out.println(ser1.getSum() + ser2.getSum());
			end = Instant.now();
			System.out.println("time for two threads: " +  Duration.between(start, end));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
