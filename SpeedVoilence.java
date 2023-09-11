package com;

public class SpeedVoilence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=100;
		boolean drunk=true;
		if((speed>=100 && drunk==true)||speed>=120 && drunk==false)
		{
			System.out.println("He is voilating speed rules");
		}
		else
		{
			System.out.println("He is not voilating speed rules");
		}

	}

}
