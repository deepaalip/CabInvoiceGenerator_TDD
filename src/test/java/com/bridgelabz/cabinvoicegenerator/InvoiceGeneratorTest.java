package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
	InvoiceGenerator invoiceGenerator;
	
	@Before
	public void TestInvoiceGenerator() {
		invoiceGenerator= new InvoiceGenerator();
	}

	@Test
  public void GivenDistanceAndTime_ShouldReturnTotalFare() {
	  double distance = 2.0;
	  int time = 5;
	  double fare = invoiceGenerator.calculateFare(distance,time);
	  Assert.assertEquals(25,fare,0.0);
  }
	@Test
	  public void GivenLessDistanceAndTime_ShouldReturnMinimumFare() {
		  double distance = 0.1;
		  int time = 1;
		  double fare = invoiceGenerator.calculateFare(distance,time);
		  Assert.assertEquals(5,fare,0.0);
	  }
}
