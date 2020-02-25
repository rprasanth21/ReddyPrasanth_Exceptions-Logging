package com.epam.task4;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class HouseConstructionCostMain{
	private static final Logger log=LogManager.getLogger(HouseConstructionCostMain.class);
	static String material;
	static boolean is_automated;
	static int area;
	static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		log.info("Enter Material Type (Standard,Above,High):-");material=input.next();
		log.info("Enter Area of house in square feets :-");area=input.nextInt();
		log.info("Enter Is House should beFully automated  home or not (true,false):-");is_automated=input.nextBoolean();
		HouseConstruction_Cost obj=new HouseConstruction_Cost();
		log.info("Overall Estimation Cost for House Construction is:-"+obj.costEstimation(material,area,is_automated));

}
}
