package Mixed_units;


// This class converts Imperial units to Standard units and vice-versa
public class Mixed_mass {
	
	// This method converts kg to lb (pounds)
	public double kg_to_lb(double kg){
		double lb;
		
		lb= kg / 0.45359237;
		return lb;
		
	}
	
	// This method converts lb (pounds) to kg
	public double lb_to_kg(double lb){
		double kg = lb * 0.45359237;
		
		return kg;
		
	}
	
	
}
