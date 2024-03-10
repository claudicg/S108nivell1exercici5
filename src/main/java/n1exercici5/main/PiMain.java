package n1exercici5.main;

import n1exercici5.Interfaces.IPi;

public class PiMain {

	public static void main(String[] args) {
		
		IPi pi = () -> 3.1415;
		System.out.println(pi.getPiValue());
	}
}
