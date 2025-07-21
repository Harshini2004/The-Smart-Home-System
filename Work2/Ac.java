package com.cdgn.Work2;

public class Ac implements Switch {
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" is offed");
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" is on");
		
	}
	
	public void temp(char c) {
		if(c=='-') {
			System.out.println("temperature decreased");
		}else {
			System.out.println("temperature increased");
		}
	}

}
