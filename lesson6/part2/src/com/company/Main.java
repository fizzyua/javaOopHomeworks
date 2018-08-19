package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] mas = new int [100000000];
	for(int i = 0; i < mas.length; i++) mas[i] =  new Random().nextInt(10);

	Instant start = Instant.now();
	System.out.println(Servise.getSumFromMasInt(mas));
	Instant end = Instant.now();
	System.out.println("time for one thread: " +  Duration.between(start, end));

	ServiseTwo ser1 = new ServiseTwo(0,25000000,mas);
	ServiseTwo ser2 = new ServiseTwo(25000000,50000000,mas);
	ServiseTwo ser3 = new ServiseTwo(50000000,75000000,mas);
	ServiseTwo ser4 = new ServiseTwo(75000000,100000000,mas);


	Thread thr1 = new Thread(ser1);
	Thread thr2 = new Thread(ser2);
	Thread thr3 = new Thread(ser3);
	Thread thr4 = new Thread(ser4);

	thr1.start();
	thr2.start();
	thr3.start();
	thr4.start();

		try {
			start = Instant.now();
			thr1.join();
			thr2.join();
			thr3.join();
			thr4.join();
			System.out.println(ser1.getSum() + ser2.getSum() + ser3.getSum() + ser4.getSum());
			end = Instant.now();
			System.out.println("time for two threads: " +  Duration.between(start, end));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
