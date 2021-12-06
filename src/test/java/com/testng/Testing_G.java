package com.testng;

import org.testng.annotations.Test;

public class Testing_G {
	
	@Test(groups="Electronics")
	private void mobileSearch() {
		System.out.println("Mobile Search");

	}
	
	@Test(groups="Electronics")
	private void LaptopSearch() {
		System.out.println("Laptop Search");

	}
	
	@Test(groups="Education")
	private void book() {
		System.out.println("Book Search");

	}
	
	@Test(groups="Education")
	private void pen() {
		System.out.println("Pen Search");

	}
	
	@Test(groups="Social")
	private void fb() {
		System.out.println("Book Search");

	}
	
	@Test(groups="Social")
	private void insta() {
		System.out.println("Pen Search");

	}

}
