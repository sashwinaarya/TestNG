package com.testng;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Social")
	private void faceBook() {
		System.out.println("FB");

	}
	
	@Test(groups = "Social")
	private void instagram() {
		System.out.println("Instagram");

	}
	
	@Test(groups = "Games")
	private void chess() {
		System.out.println("Chess");

	}
	
	@Test(groups = "Brand")
	private void honda() {
		System.out.println("Honda");

	}
	
	
	@Test(groups = "Social")
	private void WhatsUp() {
		System.out.println("Whats Up");

	}
	
	@Test(groups = "Games")
	private void Carrom() {
		System.out.println("Carrom");

	}

}





/*
 * Social fb instagram whats app
 * 
 * Games chess carrom
 * 
 * Brand honda tata bmw
 */