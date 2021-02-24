/*
#########################################################
## File Name: NumToRoman.java                          ##
## Description: Converting Positive Integer To 		   ##
##              Equivalent Roman Number Between 1-500  ##
## Programmed By: FARHAN KHAN						   ##
#########################################################
*/

import java.util.*;

class NumToRoman{
	
	//Class Variable Declaration
	String[] romans = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D"}; 
	int[] integers = new int[]	  {  1,	  4,  5,   9, 10,  40, 50,  90,100, 400,500};
	int size = integers.length-1;
	
	//Method Responsible To Convert Positive Integer To Roman Number 
	void Convert(int numtorom)
	{
		int temp = 0;
		String roman = "";
		
		while(numtorom>0){																				
				temp = numtorom/integers[size];  
				numtorom %= integers[size];
				while(temp>0){
					roman += romans[size];
					temp--;
				}
				size--;
		}
		
		System.out.println(roman);
	}
	
//	Main() Method Responsible To Call Convert Method
	public static void main(String[] args){
		int numtorom = 0;
		String ch = "y";
		
//  Creating Objects
		Scanner sc = new Scanner(System.in);
		NumToRoman obj = new NumToRoman();
		
		System.out.println("Enter A Positive Integer Between 1 To 500");
		numtorom = sc.nextInt();
		
//Taking Desition Either Go For Conversion Or Throw A Error Message 
		if(numtorom>0 && numtorom<501)
			obj.Convert(numtorom);
		else
			System.out.println("Please, Enter a Valid Input!");
				
	}
}