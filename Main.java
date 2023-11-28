package com;

public class Main {

	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.show();

	}

}
