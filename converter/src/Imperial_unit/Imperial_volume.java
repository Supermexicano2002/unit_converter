package Imperial_unit;

import java.math.BigDecimal;

public class Imperial_volume {
	/*possible units (name/abriviation)*/
	private final String[] iunits = {"fl oz", "gi", "pt", "qt", "gal"};
	/*values for the convertions*/
	private final double[] ix_to_pint = {0.05, 0.25, 1, 2, 8};
		
	 /*inputs: a value to convert (double), and the unit (string)
	 * outputs: the converted value in pint
	 * */	
		public double pint_converter(double number, String unit)
		{
			double value=0;
			for (int i = 0; i < iunits.length; i++)/* go trough all the Im. units*/
			{ 
				if (iunits[i] == unit)/*finds the matching unit */
				{ 
					double pint = number * ix_to_pint[i]; /*converts the value accordingly*/
					value = pint; /*outputs the converted value in pint*/
				}
			
				
			}
			return value;
			
		 }
		/*inputs: a value in pint to convert (double) to a selected unit (string)
		 * outputs: the converted value of the selected Imperial value
		 * */	
		public double pint_to_x(double number, String unit)
		{		
			double value=0;
			for(int i = 0; i < iunits.length; i++)
			{
				if (iunits[i] == unit)
				{
					double pint= number / ix_to_pint[i];
					value = pint;
					
				}
				
			}
			return value;		
			
		}
		
		
	
		public String x_to_x(double input, String input_u, String output_u)
		{
			// Converts input into mg
			double mg_result = pint_converter(input, input_u);
			// Convert mg input into desired weight unit
			double x_result = pint_to_x(mg_result, output_u);
			String str_result = String.valueOf(x_result);
			BigDecimal bg_result = new BigDecimal(str_result);
			return bg_result.toPlainString();
			
		
		}	
}