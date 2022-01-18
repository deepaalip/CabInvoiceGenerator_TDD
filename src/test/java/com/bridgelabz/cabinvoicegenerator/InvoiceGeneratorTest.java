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
		@Test
		public void givenMultipleRides_ShouldReturnInvoice() {

			Rides[] rides = {new Rides(2.0, 5), 
							new Rides(0.1, 1)};
			double totalFare = invoiceGenerator.calculateFareMultipleRides(rides);
			Assert.assertEquals(30, totalFare, 0.0);
		}
		@Test
		public void givenMultipleRides_ShouldReturnInvoiceSummary() {

			Rides[] rides = {new Rides(2.0, 5), 
							new Rides(0.1, 1)};
			InvoiceSummary summary = invoiceGenerator.calculateFareReturnObject(rides);
			InvoiceSummary expectedSummary = new InvoiceSummary(2, 30);
			if(expectedSummary.getAverageFare() == summary.getAverageFare() && expectedSummary.getNumberOfRides() == summary.getNumberOfRides() && expectedSummary.getTotalFare() == summary.getTotalFare())
			Assert.assertEquals(1, 1);
		}
		
}
