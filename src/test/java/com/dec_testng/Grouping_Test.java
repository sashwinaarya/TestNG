package com.dec_testng;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups ="Social")
	private void faceBook() {
		System.out.println("FB");

	}
	
	@Test(groups="Car")
	private void bmw_Car() {
		System.out.println("BMW");

	}
	
	@Test(groups="Social")
	private void whats_app() {
		System.out.println("WhatsUp");

	}
	
	@Test(groups="Car")
	private void audi_Car() {
		System.out.println("Audi");

	}
	
	@Test(groups="Social")
	private void instagram() {
		System.out.println("Insta");

	}
	
	@Test(groups="Games")
	private void chess() {
		System.out.println("Chess");

	}

}
