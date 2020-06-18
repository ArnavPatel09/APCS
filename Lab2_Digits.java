package myfirstpackage;

public class Lab2_Digits {
	 public static int getDigit(int a, int biggestDigit, int smallestDigit) 
	 {
		 int tenPowerBiggest = 1;
		 int tenPowerSmallest = 1;
		 int modBiggest = 0;
		 int modSmall = 0;
		 int returnValue = 0;
		 for(int zeros = 0; zeros < biggestDigit+1; zeros++)
			 tenPowerBiggest *= 10; 
		  modBiggest = a % tenPowerBiggest;
		  for(int zeros = 0; zeros < smallestDigit; zeros++)
				 tenPowerSmallest *= 10;
		  modSmall = a % tenPowerSmallest;
		  modBiggest -= modSmall;
		  returnValue = modBiggest/tenPowerSmallest;
		  return returnValue;
		  
		
	 }

	public static void main(String[] args) {
		System.out.println(getDigit(12345,3,0));

	}

}
