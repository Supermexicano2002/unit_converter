package test;

import Metric_units.Metric_mass;

public class Metric_mass_test {

	public static void main(String[] args){
			Metric_mass thing = new Metric_mass();
			System.out.println(thing.x_to_x(50, "mg", "cg"));
			System.out.println(thing.x_to_x(500000, "kg", "g"));
	}
}
	