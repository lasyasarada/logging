package com.epam.loggingexample1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class HouseConstruction {


	double cost=0;
	private static final Logger LOGGER1 =LogManager.getLogger(HouseConstruction.class);
	public double costOfHouse(String standard,double area,String automationrequired)
	{
		if (standard.equals("StandardMaterials"))
		{
			
			
			cost=cost+(1200*area);
			
			LOGGER1.info(cost);
			LOGGER1.error("There can be correction");
			LOGGER1.warn("Some error in the code");
			LOGGER1.fatal("Program may abort");
				
		}
		
		else if (standard.equals("above standard materials"))
		{
			
			cost=cost+(1500*area);
			LOGGER1.info(cost);
			LOGGER1.error("There can be correction");
			LOGGER1.warn("Some error in the code");
			LOGGER1.fatal("Program may abort");
			
		}
		else
		{
			if (automationrequired.equals("FullyAutomatedHouse"))
			{
				cost=cost+(2500*area);
			}
			else
			{
				cost=cost+(1800*area);
			}
			LOGGER1.info(cost);
			LOGGER1.error("There can be correction");
			LOGGER1.warn("Some error in the code");
			LOGGER1.fatal("Program may abort");
		}
		
	return(cost);	
	}
	public static void main(String[] args) {
		HouseConstruction costofhouse=new HouseConstruction();
		LOGGER1.debug("Cost of the House");
		LOGGER1.info(costofhouse.costOfHouse("StandardMaterials", 500, "NoAutomation"));

	}

}
