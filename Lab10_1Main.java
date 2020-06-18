package myfirstpackage;

public class Lab10_1Main {
	
	public static String moneyToString(Lab10_Money m) {
		String rv = "$";
		while(m.cents > 100) {//if cents is greater than 100
			m.cents -= 100;
			m.dollars += 1;//convert it to dollars
		}
		rv += m.dollars + "." + m.cents;//returning the string with dollars and cents
		return rv;
	}//end moneyToString
	
	public static Lab10_Money add(Lab10_Money m1, Lab10_Money m2) {
		Lab10_Money sum = new Lab10_Money(m1.dollars+m2.dollars, m1.cents+m2.cents);
		// adds the 2 money values together
		// Money constructor makes sure cents is less than 100
		return sum;//returns the added money
	}//end add
	
	public static Lab10_Money payWith20(Lab10_Money m) {
		Lab10_Money rv = new Lab10_Money(20, 0);
		while(rv.cents < m.cents) {//checking if the cents is greater than 0
			rv.cents += 100;//if so we are going to add 100 cents to rv
			rv.dollars -=1;//and subtract a dollar from rv
		}
		
		rv.dollars -= m.dollars;//then you do the subtraction
		rv.cents -= m.cents;
		return rv;//and return the results
	}//end payWith20
	
	public static Lab10_Money applyInterest(Lab10_Money m, double interestRate) {
		int money = m.dollars*100 + m.cents;//makes it so the money is an integer
		double total = money *(1+interestRate);//multiply the interest rate (it can give a decimal)
		return new Lab10_Money((int)total/100, (int)total%100);//then create the new object
		// you have to cast it as an int because it is a double
		//you divide the first one by 100 to get dollars, and the second is modular division because we need just the cents
	}//end applyInterest
	
	public static Lab10_Money arraySum() {
		Lab10_Money[] a = new Lab10_Money[100];//creates an array with 100 spaces
		Lab10_Money sum = new Lab10_Money();//creates a money object that will be the return value
		for(int j = 0; j<a.length;j++) {
			a[j] = new Lab10_Money(0,j+1);//adding the cents to the array
			sum.cents += a[j].cents;//adding the cents to the sum
		}
		while(sum.cents>100) {
			sum.cents -= 100;//making sure the cents isn't over 100
			sum.dollars += 1;
		}
		return sum;//returns the sum of the array
	}//end arraySum
	
	public static Lab10_Money tenADay() {
		Lab10_Money money = new Lab10_Money();//this will be the return value (money in the bank)
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//this will check for every month
		for(int i = 0; i<month.length; i++) {
			for(int j = 0; j<month[i]; j++) {//double for loop to account for each day of every month
				money.dollars += 10;//adding 10 dollars for every day in the month
			}
			money = applyInterest(money, 0.01);//applying interest at the end of every month
		}
		return money;//returning the money in the bank after the year
	}//end tenADay
	
	public static Lab10_Money purchase() {
		int dollars = 2+2+5+3+2;// cheese slices, milk, eggs
		int cents =95+69+69+49+99;//bagel spread, eggo waffles
		Lab10_Money price = new Lab10_Money(dollars,cents);
		price = applyInterest(price, 0.0825);//takes the total price and adds the sales tax
		return payWith20(price);//then use payWith20 to calculate your change
	}//end purchase
	
	public static String pointToString(Lab10_Point p) {
		return "(" + p.x + "," + p.y + ")";//returning point p as a nice string coordinate
	}//end pointToString
	
	public static Lab10_Point midpoint(Lab10_Point p1, Lab10_Point p2) {
		
		Lab10_Point mid = new Lab10_Point((p2.x+p1.x)/2, (p2.y+p2.x)/2);//creates a new object at the midpoint
		return mid;//returns the midpoint
	}//end midpoint
	
	public static boolean isEqual(Lab10_Point p1, Lab10_Point p2) {
		if(p1.x == p2.x && p1.y == p2.y)//checks if the points are the same
			return true;
		else
			return false;
	}//end isEqual
	
	
	
	public static int quadrant(Lab10_Point p) {
		if(p.x>0 && p.y>0)//checks if the point is in the top right
			return 1;
		else if(p.x<0 && p.y>0)//checks if the point is in the top left
			return 2;
		else if(p.x<0 && p.y<0)//checks if the point is in the bottom left
			return 3;
		else if(p.x>0 && p.y<0)//checks if the point is in the bottom right
			return 4;
		else//if none of them
			return 0;//the point lies on one either the y or x axis
	}//end quadrant
	
	public static void verticalStretch(Lab10_Point p, double a) {
		p.y = p.y * a;//multiplies the y coordinate of the point by a
	}//end verticalStretch
	
	public static void horizontalStretch(Lab10_Point p, double a) {
		p.x *= a;//multiplies the x coordinate of the point by a
	}//end horizontalStrech
	
	public static void verticalShift(Lab10_Point p, double a) {
		p.y += a;//adds a to the y coordinate of the point
	}//end verticalShift
	
	public static void horizontalShift(Lab10_Point p, double a) {
		p.x += a;//adds a to the x coordinate of the point
	}//end horizontalShift
	
	public static void testcodePoint() {
		Lab10_Point [] a = new Lab10_Point[5];//5 element array
		int x = 2;//the domain integers
		for(int i = 0; i<a.length; i++) {
			a[i] = new Lab10_Point(x, (x*2)+3);
			x+=2;
		}
		System.out.println("Before\t\tAfterB\t\tAfterC\\t\\tAfterD\\t\\tAfterF");//creating a nice table
		for(int i = 0; i<a.length; i++) {
			verticalStretch(a[i], 3);
			//vertical stretching each element
			System.out.print(a[i] +"\t");
			horizontalStretch(a[i], 2);
		}
		
		
		
		Lab10_Point[] sine = new Lab10_Point[5];//creating an array
		sine[0] = new Lab10_Point(0,0);//with the points
		sine[1] = new Lab10_Point(1.57,1);
		sine[2] = new Lab10_Point(3.14,0);
		sine[3] = new Lab10_Point(4.71,-1);
		sine[4] = new Lab10_Point(6.28,0);
		System.out.println("Before\t\tAfterG\t\tAfterH");//creating a nice table
		for(int i = 0; i<sine.length; i++) {
			System.out.print(pointToString(sine[i])+"\t");
			//doing letter G
			verticalShift(sine[i], 2);//doing the shift by 2
			verticalStretch(sine[i], 2);//then the stretch by 2
			System.out.print(pointToString(sine[i]) +"\t");
			//doing letter H
			verticalStretch(sine[i], 2);//doing the stretch
			verticalShift(sine[i], 2);//then doing the shift
			System.out.println(pointToString(sine[i]));
		}
	}//end sine
	
	public static void main(String[] args) {
		//Lab10_Money money = tenADay();
		//System.out.print(moneyToString(money));
		//System.out.print(moneyToString(arraySum()));
	}
	

}
