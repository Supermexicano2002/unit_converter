package test;

import Metric_units.Metric_length;

public class Metric_length_test {
	
	
	public static void main(String[] args){
		Metric_length thing = new Metric_length();
		System.out.println(thing.x_to_x(50, "mm", "cm"));
		System.out.println(thing.x_to_x(500000, "km", "m"));
}
	
	
}
