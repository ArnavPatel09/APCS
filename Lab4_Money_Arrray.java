package myfirstpackage;

public class Lab4_Money_Arrray {

	public static int[] createMoney(int dollars, int cents)
	{
		int[] money = new int[2]; //  this is my return value
		int totalDollars = dollars;
		int totalCents = cents;
		while (true){
			if(totalCents>100) //goes through the if statement until cents is less than 100
			{
				totalCents -=100;//takes away $1 in cents
				totalDollars +=1;//adds 1 to total Dollars
			}
			else
				break;
		}
		money[0] = totalDollars;
		money[1] = totalCents;
		return money;
	}//End createMoney
	public static int[] copyMoney(int[] money)
	{
		int [] currency = new int[2]; // this is the return value
		currency[0] = money[0];//dollars is the first entry in my array
		currency[1] = money[1];//cents is the second entry in my array
		return currency;
	}//End copyMoney
	//End task 1
	
	public static int dollars(int[]money) {
		return money[0];//returns the amount of dollars
	}//End dollars
	
	public static int cents(int[] cents) {
		return cents[1];//returns the cents
	}//End cents
	public static String moneyToText(int[] money)
	 {
	       String hundred = "";//this will be the hundreds Ex. one hundred
	       String tens = "";//this will be the tens placeholder. Ex sixty
	       String ones = "";//this is the ones place holder
	       String cents = "";// this is the tenths and hundredths
	       if (money[0] / 100 > 0)
	       {
	           if (money[0] / 100 == 1 )
	               hundred = "one hundred ";//if the hundreds place is a 1 then one hundred is what will be the text equivalent
	           if (money[0] / 100 == 2)
	               hundred = "two hundred ";
	           if (money[0] / 100 == 3)
	               hundred = "three hundred ";
	           if  (money[0] / 100 ==4)
	               hundred = "four hundred ";
	           if  (money[0] / 100 ==5)
	               hundred = "five hundred ";
	           if  (money[0] / 100 ==6)
	               hundred = "six hundred ";
	           if  (money[0] / 100 ==7)
	               hundred = "seven hundred ";
	           if  (money[0] / 100 ==8)
	               hundred = "eight hundred ";
	           if  (money[0] / 100 ==9)
	               hundred = "nine hundred ";
	       }

	       if (money[0] % 100 > 19) 
	       {
	           if (money[0] % 100 > 19 && money [0] % 100 < 29)//checks the tens place. if its anything above 20
	               tens = " twenty";
	           if (money[0] % 100 > 29 && money [0] % 100 < 39)
	        	   tens = " thirty";
	           if (money[0] % 100 > 39 && money [0] % 100 < 49)
	           tens = " forty";
	           if (money[0] % 100 > 49 && money [0] % 100 < 59)
	        	   tens = " fifty";
	           if (money[0] % 100 > 59 && money [0] % 100 < 69)
	        	   tens = " sixty";
	           if (money[0] % 100 > 69 && money [0] % 100 < 79)
	        	   tens = " seventy";
	           if (money[0] % 100 > 79 && money [0] % 100 < 89)
	        	   tens = " eighty";
	           if (money[0] % 100 > 89 && money [0] % 100 < 99)
	        	   tens = " ninety";
	       }

	       if (money[0] % 100 <= 19)//checks if the tens place is in the 'teens'
	       {
	           if (money[0] % 100 == 19)
	               tens = " nineteen";
	           if (money[0] % 100 == 18)
	               tens = " eighteen";
	           if (money[0] % 100 == 17)
	               tens = " seventeen";
	           if (money[0] % 100 == 16)
	               tens = " sixteen";
	           if (money[0] % 100 == 15)
	               tens = " fifteen";
	           if (money[0] % 100 == 14)
	               tens = " fourteen";
	           if (money[0] % 100 == 13)
	               tens = " thirteen";
	           if (money[0] % 100 == 12)
	               tens = " twelve";
	           if (money[0] % 100 == 11)
	               tens = " eleven";
	           if (money[0] % 100 == 10)
	               tens = " ten";
	       }

	       if (money[0] % 10 < 10 && tens.indexOf("n") == -1)//checks the ones place.
	       {
	           if (money[0] % 10 == 9)
	               ones = "nine ";
	           if (money[0] % 10 == 8)
	               ones = "eight ";
	           if (money[0] % 10 == 7)
	               ones = "seven ";
	           if (money[0] % 10 == 6)
	               ones = "six ";
	           if (money[0] % 10 == 5)
	               ones = "five ";
	           if (money[0] % 10 == 4)
	               ones = "four ";
	           if (money[0] % 10 == 3)
	               ones = "three ";
	           if (money[0] % 10 == 2)
	               ones = "two ";
	           if (money[0] % 10 == 1)
	               ones = "one ";
	       }

	       if (money[1] / 10 > 1)//checks the cents tenths place
	       {
	           if (money[1] / 10 == 9)
	               cents = " ninety";
	           if (money[1] / 10 == 8)
	               cents = " eighty";
	           if (money[1] / 10 == 7)
	               cents = " seventy";
	           if (money[1] / 10 == 6)
	               cents = " sixty";
	           if (money[1] / 10 == 5)
	               cents = " fifty";
	           if (money[1] / 10 == 4)
	               cents = " forty";
	           if (money[1] / 10 == 3)
	               cents = " thirty";
	           if (money[1] / 10 == 2)
	               cents = " twenty";
	       }

	       if (money[1] / 10 <=1 )//checks to see if the cents is a '-teen'
	       {
	           if (money[1] == 19)
	               cents = " nineteen";
	           if (money[1] == 18)
	               cents = " eighteen";
	           if (money[1] == 17)
	               cents = " seventeen";
	           if (money[1] == 16)
	               cents = " sixteen";
	           if (money[1] == 15)
	               cents = " fifteen";
	           if (money[1] == 14)
	               cents = " fourteen";
	           if (money[1] == 13)
	               cents = " thirteen";
	           if (money[1] == 12)
	               cents = " twelve";
	           if (money[1] == 11)
	               cents = " eleven";
	           if (money[1] == 10)
	               cents = " ten";
	       }

	       if (money[1] % 10 > 0 )//checks the hundredths place of the cents and turns it into words
	       {
	           if (money[1] % 10 == 1)
	               cents = cents + " one";
	           if (money[1] % 10 == 2)
	               cents = cents + " two";
	           if (money[1] % 10 == 3)
	               cents = cents + " three";
	           if (money[1] % 10 == 4)
	               cents = cents + " four";
	           if (money[1] % 10 == 5)
	               cents = cents + " five";
	           if (money[1] % 10 == 6)
	               cents = cents + " six";
	           if (money[1] % 10 == 7)
	               cents = cents + " seven";
	           if (money[1] % 10 == 8)
	               cents = cents + " eight";
	           if (money[1] % 10 == 9)
	               cents = cents + " nine";
	       }

	       String moneyText = "", a = "and", b = "dollars ", c = "and", d = " cents";
	       if (hundred.compareTo("hundred") < 1)
	           a = "";
	       if (money[0] % 100 == 0)
	           tens = "";
	       if (money[0] % 10 == 0)
	           ones = "";
	       if (money[0] % 100 == 0 && money[0] % 10 == 0)
	           a = "";
	       if (money[1]  == 0)
	       {
	           c = "";
	           cents = "";
	           d = "";
	       }
	       if (money[0] % 100 > 0)
	           tens = tens + "";
	       if (ones == "one ")
	           b = "dollar ";
	       moneyText = "" + hundred  + a + tens + ones + b + c + cents + d; // concatenates the string variables to create the entire string


	       return moneyText;
	   }//End moneyToText
	//End Task 2

	public static boolean isGreaterThan(int[] m1, int[] m2) 
	{
		if(m1[0]>m2[0])//if money1 dollars is greater than money2 dollars
			return true;
		else if (m1[0] == m2[0])//if not, then it will check if money1 and money2 dollars are equal
		{
			if (m1[1] > m2[1])//checks to see if the money1 cents is greater than money2 cents
				return true;
			else//if not money2 is greater than money 1
				return false;
		}
		else//if not money2 is greater than money 1
			return false;
	}//End isGreaterThan
	
	public static boolean isEqual(int[] m1, int[] m2) 
	{
		if(m1[0] == m2[0] && m1[1] == m2[1]) //checks to see if the money is equal
			return true;
		else
			return false;
	}//End isEqual
	//End task 3
	
	public static void adder(int[] m1, int[] m2) 
	{
		m1[0] += m2[0];//adds the dollars of money2 to money1
		m1[1] += m2[1];//adds the cents of money2 to money1
		while (true){
			if (m1[1] >= 100) //if the cents is more than 100 it will go inside this statement
			{
				m1[1] -= 100;//decreases the cents by 100
				m1[0] += 1;//increases the dollars by 1
			}
			else
				break;
		}
		System.out.println("$" + m1[0] + "." + m1[1]);
	}//End isEqual
	 public static int[] add(int[] m1, int[] m2) 
	 {
		 int[] totalMoney = new int[2]; //creates a new array
		 totalMoney[0] = m1[0] + m2[0]; // adds both of the dollars
		 totalMoney[1] = m1[1] + m2[1]; // adds both of the cents
		 while(true) 
		 {
		 	if(totalMoney[1] >= 100) //checks to see if the cents are larger than 100
		 	{
		 		totalMoney[1] -= 100;//decreases the cents by 100
		 		totalMoney[0] += 1;//increases the dollars by 1
		 	}
		 	else
		 		break;
	 	 }
		return totalMoney;
	 }
	public static void subber(int[] m1, int[] m2) 
	{
		if (m1[0] > m2[0]) //checks to see if money1 is greater than money2
		{
			m1[0] -= m2[0];//subtracts money2 from money1
			if(m1[1] < m2[1]) //checks to see if cents1 is less than cents2
			{
				m1[0] -= 1;//if so, the dollars amount decreases by 1
				m1[1] += 100;//and the cents increases by 100
			}
			m1[1] -= m2[1];//the cents subtraction occurs
		}
		else if (m1[0] < m2[0])//checks to see if money2 is greater than money1
		{
			m1[0] -= m2[0];//if so, we subtract money2 from money1 (will give a negative number)
			if(m1[1] < m2[1]) // checks to see if cents2 is greater than cents1
			{
				m1[1] += 100;//if so, we increase the cents1 by 100
				m1[1] -= m2[1];//and we subtract cents2 from cents1
				m1[1] = 100 -m1[1];//and then we subtract that amount by 100
			}//We do this instead of subtracting cents1 and cents2 that way our cents is positive instead of negative
			if(m1[1] > m2[1]) //checks to see if cents1 is greater than cents2
			{
				m1[0] -= 1;//subtracts 1 from the dollars
				m1[1] -= m2[1];//subtracts cents1 from cents2
				m1[1] = 100 - m1[1];//subtracts the new cents1 from 100
			}
			else
				m1[1] = 0;//if it is neither cents 1 and cents2 are the same so the cents will be 0
		}
		else if (m1[0] == m2[0]) //if the dollar amounts are the same
		{
			m1[1] -= m2[1];//then we just subtract the cents
		}
		if(m1[1] >= 10)//if the cents is greater than 10
			System.out.println(m1[0] + "." + m1[1]);
		if(m1[1] < 0) //if the cents is negative(will only happen with dollars being equal)
		{
			m1[1] -=(m1[1]*2);//makes m1[1] positive
			System.out.println("- " + m1[0] + "." + m1[1]);//puts a negative at the beginning.
		}
		else//if cents is a single digit
			System.out.println(m1[0] + ".0" + m1[1]);//adds a 0 after the period
	}//end subber
	
	public static int[] sub(int[] m1, int[] m2)
	{
		int[] returnValue = new int[2];
		int total;
		double totalMoney = 0;
		double centsOne = m1[1];
		double centsTwo = m2[1];
		double moneyOne = m1[0]+ (centsOne/100);
		double moneyTwo = m2[0] + (centsTwo/100);
		totalMoney = moneyOne - moneyTwo;
		totalMoney *= 100;
		total = (int) totalMoney;
		returnValue[0] = total/100;
		returnValue[1] = total%100;
		if(returnValue[0] < 0 && returnValue[1] < 0) 
		{
			returnValue[1] -= (2*returnValue[1]);
		}
		return returnValue;
	}//End sub
	//End Task 4
	
	public static int[] payWith20(int[] owe) 
	{
		double cents = owe[1];//makes cents a double (that way we can have a decimal)
		double money = owe[0] + (cents/100);//concatenates the dollars and cents( now it will be 1.11)
		double total = 20 - money;//does 20-money (gives you a double like 18.89)
		int owedMoney; //creating an int that way we can use an array
		total *=100;//multiplies the total by 100 that way there are no decimals
		owedMoney = (int)total;//casts it to a int so we can put it into an int array
		owe[0] = owedMoney/100;//makes owe[0] equal the dollars
		owe[1] = owedMoney%100;//makes owe[1] equal to the cents
		return owe;//return
	}//end payWith20
	
	public static int[] applyInterest(int[] balance, int interest) 
	{
		double cents = balance[1];//makes cents a double (that way we can have a decimal) 
		double money = balance[0] + (cents/100);//concatenates the dollars and cents( now it will be 1.11)
		int moneyAfter;//the money will be converted to an int and stored in this variable
		double interestDouble = interest;//makes the interest a double so it can be a decimal
		money *= (1+(interestDouble/100));// makes it 1.1 so we can multiply the money and interest
		money *= 100;//multiply it by 100 so there is no longer a decimal
		moneyAfter = (int)money;//casts it to an int and removes any decimal remaining
		balance[0] = moneyAfter/100; //making balance[0] equal the dollars after interest
		balance[1] = moneyAfter%100; //making balance[1] equal the cents after interest (rounded down)
		return balance;//returns the balance
	}//end applyInterest
	//End task 5
	public static void main(String[] args) 
	{
		   int[] a = createMoney(4,115);
		    System.out.println("5 15: " + a[0] + " " + a[1]);
		    int[] b = copyMoney(a);
		    a[1] = 50;
		    System.out.println("5 50: " + a[0] + " " + a[1]);
		    System.out.println("5 15: " + b[0] + " " + b[1]);
		    System.out.println("Dollars: 5: " + dollars(a));
		    System.out.println("Cents: 50: " + cents(a));
		    System.out.println("$5.50: " + moneyToText(a));
		    System.out.println("five dollars and fifty cents: " + moneyToText(a));
		    System.out.println("isGreater: true: " + isGreaterThan(a,b));
		    System.out.println("isEqual: false: " + isEqual(a,b));
		    a = createMoney(1,10);
		    b = createMoney(2,20);
		    adder(a,b);
		    System.out.println("sb $3.30: " + moneyToText(a));
		    System.out.println("sb $2.20: " + moneyToText(b));
		    b = add(a,b);
		    System.out.println("sb $3.30: " + moneyToText(a));
		    System.out.println("sb $5.50: " + moneyToText(b));

	}

}
