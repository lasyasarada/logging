package com.epam.loggingexample1;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
public class Interest {

	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Interest.class);
	
	public double simpleInterest(double principal,double time,double rateofinterest )
	{
		double simpleinterest=(principal*time*rateofinterest)/100;
		LOGGER.info(simpleinterest);
		LOGGER.error("There can be correction");
		LOGGER.warn("Some error in the code");
		LOGGER.fatal("Program may abort");
		return simpleinterest;
	}
	public double compoundInterest(int principal, int time, double rateofinterest, int n) {
        double amount = principal * Math.pow(1 + (rateofinterest / n), n * time);
        double compoundinterest = amount - principal;
		LOGGER.info(compoundinterest);
		LOGGER.error("There will be corrrection");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		return compoundinterest;
	
	}
	public static void main(String args[]) {
		Interest interestcalculation = new Interest();
		LOGGER.debug("Simple Interest");
		LOGGER.info(interestcalculation.simpleInterest(500,2,1));
		LOGGER.info(interestcalculation.compoundInterest(2000,3,2,1));
	}

}