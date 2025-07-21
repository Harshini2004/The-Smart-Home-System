package com.cdgn.Work2;

public class Light implements Switch {
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" is offed");
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" is oned");
	}
	public void brigthness(char c) {
		if(c=='-') {
			System.out.println("Bigthness decreased");
		}else {
			System.out.println("Bigthness increased");
		}
	}
}
