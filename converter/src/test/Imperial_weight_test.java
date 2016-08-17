package test;

import Imperial_unit.Imperial_weight;

public class Imperial_weight_test {
	public static void main(String[] args){
		Imperial_weight thing = new Imperial_weight();
		System.out.println(thing.x_to_x(50, "oz", "lb"));
		System.out.println(thing.x_to_x(500000, "st", "ut"));
		System.out.println(thing.x_to_x(4000, "ut", "gr"));
		System.out.println(thing.x_to_x(3231, "dr", "qtr"));
}
}
