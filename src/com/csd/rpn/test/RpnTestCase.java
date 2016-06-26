package com.csd.rpn.test;

import com.csd.rpn.java.ClassPercent;

import junit.framework.TestCase;

public class RpnTestCase extends TestCase {

	private static final boolean True = false;

	public void testPercent1() throws Exception{
		ClassPercent classPercent = new  ClassPercent();
		assertEquals(0.05, classPercent.calculate("5 %"));
				
	}
	
	public void testPercent2() throws Exception{
		ClassPercent classPercent = new  ClassPercent();
		assertEquals(0.08, classPercent.calculate("8 %"));
	
	}
	
	public void testPercent3(){
		try{
			ClassPercent classPercent = new  ClassPercent();
			double dt = classPercent.calculate("8%");
			fail();
		}catch (Exception es){
			System.out.println(es.getMessage());
			assertTrue(true);
		}
	}
	
	public void testPercent4(){
		try{
			ClassPercent classPercent = new  ClassPercent();
			double dt = classPercent.calculate("8");
			fail();
		}catch (Exception es){
			System.out.println(es.getMessage());
			assertTrue(true);
		}
	}
	
	public void testPercent5(){
		try{
			ClassPercent classPercent = new  ClassPercent();
			double dt = classPercent.calculate("8 !");
			fail();
		}catch (Exception es){
			System.out.println(es.getMessage());
			assertTrue(true);
		}
	}
	
}
