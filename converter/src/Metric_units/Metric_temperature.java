package Metric_units;

/*
 * This class handles kelvin to celsius and celsius to kelvin conversions  
 * 
 * 
 * 
 */

public class Metric_temperature {
	
	public double celsius_to_kelvin (double celsius){
			
		return celsius + 273.15;		
		
	}
	public double kelvin_to_celsius (double kelvin){
		return kelvin - 273.15;
	}
}
