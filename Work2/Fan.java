package com.cdgn.Work2;

public class Fan implements Switch {
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
	public void speed(char c) {
		if(c=='-') {
			System.out.println("speed decreased");
		}else {
			System.out.println("speed increased");
		}
	}

}
