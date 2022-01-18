package com.bridgelabz.cabinvoicegenerator;


public class InvoiceGenerator {
		private static final int COST_PER_TIME = 1;
		private static final int MINIMUMCOST_PER_KILOMETER = 10;
		private static final int MINIMUM_FARE = 5;
		
		public double calculateFare(double distance, int time) {
		
			double totalFare =  distance * MINIMUMCOST_PER_KILOMETER + time * COST_PER_TIME;
			if(totalFare < MINIMUM_FARE) {
				return MINIMUM_FARE;
			}
			return totalFare;
		}
		
		public double calculateFareMultipleRides(Rides[] rides) {
			
			double totalFare =0;
			 for(Rides ride : rides) {
				 totalFare += this.calculateFare(ride.distance, ride.time);
			 }
			return totalFare;
		}
	
		public InvoiceSummary calculateFareReturnObject(Rides[] rides) {
			
			double totalFare = 0;
			for(Rides ride : rides) {
				totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
			}
			return new InvoiceSummary(rides.length, totalFare);
		}
}
