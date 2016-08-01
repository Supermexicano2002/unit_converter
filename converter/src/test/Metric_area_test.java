package test;

import Metric_units.Metric_area;

public class Metric_area_test {
	public static void main(String[] args){
		Metric_area thing = new Metric_area();
		System.out.println(thing.x_to_x(50, "mm2", "cm2"));
		System.out.println(thing.x_to_x(500000, "km2", "m2"));
		System.out.println(thing.x_to_x(4000, "cm2", "mm2"));
		System.out.println(thing.x_to_x(3231, "mm2", "cm2"));
}
}
