package Metric_units;

class Metric_mass{
	// Possible weight units
	private final String[] units = {"kg", "hg", "dag", "g", "dg", "cg", "mg"};
	// Possible values 
	private final double[] x_to_mg = {1000000.0,100000.0,10000.0,1000.0,100.0,10.0,1.0};
	
	// This converts every possible metric weigth unit into mg
	public double mg_converter(double number, String unit){

		for (int i = 0; i < units.length; i++){
			if (units[i] == unit){
				double mg = number * x_to_mg[i];
				return mg;
			}
		
			
		}
		return 0.0;
		
	}
	// This converts mg into every possible metric weight unit
	public double mg_to_x(double number, String unit){
		
		for(int i = 0; i < units.length; i++){
			if (units[i] == unit){
				return number / x_to_mg[i];
				
			}
			
		}
		return 0.0;
		
		
	}
	// This converts an x metric weight unit into another x metric weight unit
	/* This method takes a double input, a 
	 * 
	 * 
	 * 
	 * 
	 */
	public double x_to_x(double input, String input_u, String output_u){
		// Converts input into mg
		double mg_result = mg_converter(input, input_u);
		// Convert mg input into desired weight unit
		double x_result = mg_to_x(mg_result, output_u);
		return x_result;
		
	
	}
	
	
	
}

