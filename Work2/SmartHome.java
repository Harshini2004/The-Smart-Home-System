package com.cdgn.Work2;

import java.util.Scanner;

public class SmartHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Light l = new Light();
		l.on();
		System.out.println("Give + to increase the brigthness and - to decrease");
		l.brigthness(sc.next().charAt(0));
		l.off();
		Fan f = new Fan();
		f.on();
		System.out.println("Give + to increase the speed and - to decrease");
		f.speed(sc.next().charAt(0));
		f.off();
		Ac a = new Ac();
		a.on();
		System.out.println("Give + to increase the temperature and - to decrease");
		a.temp(sc.next().charAt(0));
		a.off();
	}

}
