package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary {
	private  int numOfRides;
	private  double totalFare;
	private double averageFare;
	 
public InvoiceSummary (int numOfRides,double totalFare){
		 this.numOfRides = numOfRides;
		 this.totalFare =  totalFare;
		 this.averageFare = this.totalFare/this.numOfRides;
	 }
	 
	    public int getNumberOfRides() {
			return numOfRides;
		}

		public double getTotalFare() {
			return totalFare;
		}

		public double getAverageFare() {
			return averageFare;
		}
}
