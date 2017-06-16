/**
 * 
 */
package com.cts.ipm.devops.sample;
import java.util.Date;
/**
 * @author 481535
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		System.out.println("Current Date is "+currentDate);
		System.out.println("Welcome to HelloWorld Application!");
		String fahrenheitTemp = "102";
		System.out.println(fahrenheitTemp +" Fahrenheit Temperature in Celsius is "+ getCelsiusTemperature(fahrenheitTemp));
	}
	private static String getCelsiusTemperature(String fahrenheitTemp){
		String celsiusTemp = "";
		try{
			Double celsius = 0.0;
			if(fahrenheitTemp != ""){
				Double fahrenheit = new Double(fahrenheitTemp);
				celsius = ((fahrenheit - 32)*5)/9;
				System.out.println("Celsius Temperature "+celsius);
				celsiusTemp = celsius.toString();
			}
		} catch (NumberFormatException nfe) {
			System.err.println("Error : Invalid Temperature! "+nfe);
		}
		return celsiusTemp;
	}

}
