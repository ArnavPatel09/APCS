package myfirstpackage;

public class Lab8_2dArrays {

	public static String arrayToString(int[] n) {
		if(n == null)
			return "null";
		String rv = "{" + n[0];//start of the array
		for(int i = 1; i<n.length; i++)
			rv += ", " + n[i];//adds the elements of the array
		rv += "}";//ends array
		return rv;//returns array in a string
	}//End arrayToString
	
	public static String arrayToString(int[][] n) {
		if(n == null)
			return "null";
		String rv = "{";//starts the larger S=tring
		for(int r = 0; r<n.length-1; r++) 
		{
			rv +="{" + n[r][0];// starts the smaller array and adds the first element
			for(int c = 1; c<n[r].length; c++)
				rv += ", " + n[r][c];// adds the rest of the elements in the array
			rv += "},\n ";//ends the smaller array
		}
		for(int r = n.length-1; r<n.length; r++) //adds last smaller array
		{
			rv += "{" + n[r][0];
			for(int c = 1; c<n[r].length; c++)
				rv += ", " + n[r][c];
			rv += "}";
		}
		rv += "}";//ends the larger array
		return rv;
	}//End arrayToString
	
	public static boolean ticTacToe(int[][] a)
	{
		if(a[0][0]==a[0][1] && a[0][0] == a[0][2] && a[0][0] != 0)//top horizontal
			return true;
		else if(a[1][0]==a[1][1] && a[1][0]==a[1][2] && a[1][0] != 0)//middle horizontal
			return true;
		else if(a[2][0]==a[2][1]&&a[2][0]==a[2][2]&& a[2][0] != 0)//bottom horizontal
			return true;
		else if(a[0][0]==a[1][1] && a[0][0]==a[2][2]&& a[0][0] != 0)//major diagonal
			return true;
		else if(a[0][2]==a[1][1] && a[0][2]==a[2][0]&& a[1][1] != 0)//minor diagonal
			return true;
		else if(a[0][0]==a[1][0]&&a[0][0]==a[2][0]&& a[1][0] != 0)//left vertical
			return true;
		else if(a[1][1]==a[1][1] && a[1][1]==a[2][1]&& a[1][1] != 0)//middle vertical
			return true;
		else if(a[0][2]==a[1][2] && a[0][0]==a[2][2]&& a[0][0] != 0)//right vertical
			return true;
		else//if none of the above work
			return false;//there is no winner
	}//End ticTacToe
	
	
	public static int sum(int[][] a) 
	{
		int rv = 0;
		for(int r = 0; r<a.length; r++)
			for(int c = 0; c<a[r].length; c++)//goes through every element
				rv += a[r][c];//adds it to the return value
		return rv;//returns the added elements
	}//End sum
	

	public static int sumMajor(int[][]a) {
		int minor = 0;//the column
		int rv = 0;
		for(int r = 0; r<a.length; r++) {
			rv += a[r][minor];//adds the major diagonal
			minor++;//increases the column by 1
		}
		return rv;
	}//End sumMajor
	
	public static int sumMinor(int[][]a) {
		int minor = a[0].length-1;//makes the column
		int rv = 0;
		for(int r = 0; r<a.length; r++) {
			rv += a[r][minor];//adds the minor diagonal
			minor --;//decreases the column
		}
		return rv;//return the sum
	}//End sumMinor
	
	public static int min(int[] a) {
		int rv = Integer.MAX_VALUE;//makes rv the largest possible number
		for(int i = 0; i<a.length; i++)
			if(a[i]<rv)//checks if the element is smaller than the previous minimum
				rv = a[i];
		return rv;//returns the minimum
	}//End min
	
	public static int min(int[][]a) {
		int rv = Integer.MAX_VALUE;//makes rv the largest possible number
		for(int r = 0; r <a.length; r++)//goes each smaller element a[r]
			if(min(a[r])<rv)//uses the min function to find the smallest element, then checks that to the previous rv
				rv = min(a[r]);
		return rv;//returns the smallest element
	}//End min
	
	public static int min2(int[][]a) {
		int rv = Integer.MAX_VALUE;//makes rv the largest possible number
		for(int r = 0; r<a.length; r++)
			for(int c = 0; c<a[r].length; c++)//goes through every element in every array
				if(a[r][c]<rv)//checks to see if it is less than the previous smallest number
					rv = a[r][c];
		return rv;//returns the smallest number
	}//End min2
	
	public static void rotate(int[][]a)
	{
		int storage;
		int c = 0;//this will represent the columns
		int i = 0;//this will represent the columns for the 2nd step
		for(int r = 0; r<a.length; r++) {//first step
			c = r;
			i = 0;
			while(c<a[r].length) {
				storage = a[r][c];//changes the numbers with rows and columns
				a[r][c] = a[c][r];
				a[c][r] = storage;
				c++;
				/* gives
				 * 147
				 * 258
				 * 369
				 */
			}
			for(int l = 0; l<a[r].length/2; l++)
			{
				storage = a[r][a[r].length-1-i];//flips the elements so it is in the correct order
				a[r][a[r].length-1-i] = a[r][i];
				a[r][i] = storage;
				i++;
				/*gives
				 * 741
				 * 852
				 * 963
				 */
			}
		}
	}//End rotate
	
	public static int[][] expand(int[][]a){
		int[][]rv = new int[a.length*2][];//creates double the arrays
		for(int i = 0; i<a.length; i++) 
		{
			rv[i*2] = new int [a[i].length *2];//creates double the spaces in the smaller array
			rv[i*2+1] = new int [a[i].length *2];
		}
		for(int i = 0; i<a.length; i++) {
			for(int c = 0; c<a[i].length; c++) {
				rv[i*2][c*2] = a[i][c];//adds the element to the first array and first element
				rv[i*2][c*2+1] = a[i][c];//adds the element to the first array and the second element
				rv[i*2+1][c*2] = a[i][c];//adds the element to the second array and the first element
				rv[i*2+1][c*2+1] = a[i][c];//adds the element to the second array and the second element
			}
		}
		return rv;//returns the expanded array
	}//end expand
	
	public static String twelveA()
	{
		String rv = "";
		int f = 0;
		for(int i = 1; i<6; i++) {//how many rows
			f = 1;//resets the element to 1
			for(int x = 0; x<i; x++) {//how many columns per row
				rv += "" + f;//adds the element
				f++;//increases the element
			}
			rv += "" + "\n";//adds a new line after each row
		}
		return rv;//returns the string
	}//End twelveA
	
	public static String twelveB() {
		String rv = "";
		int f = 5;//this will be the number in the rows
		for(int i = 6; i>1; i--) {//the length of the row
			f = 5-(6-i);//decreases the number for the next row
			for(int x = 1; x<i; x++) {//the number of the column in the row
				rv += "" + f;
				f--;//decreases for the next number
			}
			rv += "" +"\n";//adds a new line after the row is completed
		}
		return rv;
	}//end twelveB
	
	public static String twelveC() {
		String rv = "";
		int f = 5;//the number in the row
		for(int i = 1; i<6; i++) {//number of rows
			for(int x = 0; x<i; x++) {//number of columns per row
				rv += "" + f;//adds the corresponding number
			}
			rv += "\n";//creates a new line after the row is completed
			f--;//decreases the number after the row is finished
		}
		return rv;
	}//End twelveC
	
	public static int[][] pascalsTriangle(int n){
		int[][] a = new int[n][];//creates the number of rows
		for(int i = 0; i<n; i++)//creates the number of spaces
			a[i] = new int[i+1];//for each row
		for(int i = 0; i<a.length; i++) {
			a[i][0] = 1;//makes the first element 1
			a[i][a[i].length-1]= 1; //makes the last element 1
			for(int x = 1; x<a[i].length-1; x++) {
				if(i != 0 || i != 1) {//if the row is not the first or second
					a[i][x] = a[i-1][x] + a[i-1][x-1];//it will add the number above and to the 
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) 
	{
		/*int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(a);
		System.out.println(arrayToString(pascalTri(5)));
		*/
		int[] a = {1,2,3,4,5};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        String s="", t="";
        System.out.println("Task 1&2\nTesting arrayToString():");
        try{
            s = "{1, 2, 3, 4, 5}";
            t = arrayToString(a);
            if(s.compareTo(t)!=0)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println(s + "\t" + t + "\t");    
            
            s = "null";
            a = null;
            t = arrayToString(a);
            if(s.compareTo(t)!=0)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println(s + "\t" + t + "\t");

            s = "{{1, 2, 3},\n {4, 5, 6},\n {7, 8, 9}}";
            t = arrayToString(b);
            if(s.compareTo(t)!=0)
                System.out.println("FAIL\t");
            else
                System.out.println("PASS\t");
            System.out.print(s + "\n" + t);
                
        }
        catch (Exception e){
            System.out.println("\nFAIL arrayToString().\n");
        }
        System.out.println();
        int[][] z = {{1,1,1},{0,0,0},{0,0,0}};
        if(ticTacToe(z))
        	System.out.println("TICTACTOE PASS");
        else
        	System.out.println("\nCan't test TicTacToe, function interface wasn't given.\n");

        int[][] c = {{10,10,10},{20,20},{30,30,30,30}};
        int sumValue=0;
        int[][] d = {{1,2,3,4,5},{6,7,8,9,1},{2,3,4,5,6},{7,8,9,1,2},{3,4,5,6,7}};
        System.out.println("Task 4-6\nTesting sum functions:");
        try{
            sumValue = sum(c);
            if(sumValue != 190)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("sum(): 190\t" + sumValue + "\t");    
            
            sumValue = sumMajor(d);
            if(sumValue != 20)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("sumMajor(): 20\t" + sumValue + "\t");
            sumValue = sumMinor(d);
            if(sumValue != 29)
            	 System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("sumMajor(): 29\t" + sumValue + "\t");
        }
        catch (Exception e){
            System.out.println("\nFAIL sum(), sumMajor(), sumMinor().\n");
        }

        int[] e1 = {-5,-7,-3,-2,-9,-5,-1};
        int minValue=0;
        int[][] f = {{10,2,3,4,5},{6,7,8,9,10},{2,3,4,5,6},{7,8,9,10,2},{3,4,5,6,7}};
        System.out.println("Task 7-9\nTesting min functions:");
        try{
            minValue = min(e1);
            if(minValue != -9)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("min(): -9\t" + minValue + "\t");    
            
            minValue = min(f);
            if(minValue != 2)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("min(): 2\t" + minValue + "\t");
            minValue = min2(f);
            if(minValue != 2)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("min(): 2\t" + minValue + "\t");
        }
        catch (Exception e){
            System.out.println("\nFAIL min(), min2().\n");
        }

        int[][] g = {{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5},{6,7,8,9,0},{1,2,3,4,5}};
        int[][] h = {{1,6,1,6,1},{2,7,2,7,2},{3,8,3,8,3},{4,9,4,9,4},{5,0,5,0,5}};
        String u = "", v = "";
        System.out.println("Task 10\nTesting rotate():");
        try{
            rotate(g);
            u = arrayToString(g);
            v = arrayToString(h);
            if(s.compareTo(t)!=0)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("rotate():\n" + u + "\n\n" + v);       //////////     
        }
        catch (Exception e){
            System.out.println("\nFAIL rotate().\n");
        }

        int[][] k = {{1,2,3,4,5},{6,7},{1,2,3},{6},{6,5,4,3,2,1}};
        int[][] m = {{1,1,2,2,3,3,4,4,5,5},{1,1,2,2,3,3,4,4,5,5},{6,6,7,7},
                     {6,6,7,7},{1,1,2,2,3,3},{1,1,2,2,3,3},{6,6},{6,6},
                     {6,6,5,5,4,4,3,3,2,2,1,1},{6,6,5,5,4,4,3,3,2,2,1,1}};
        String w = "", x="";
        System.out.println("Task 10\nTesting expand():");
        try{
            w = arrayToString(expand(k));
            x = arrayToString(m);
            if(w.compareTo(x)!=0)
                System.out.print("FAIL\t");
            else
                System.out.print("PASS\t");
            System.out.println("expand():\n" + w + "\n" + x);        ///////////
        }
        catch (Exception e){
            System.out.println("\nFAIL expand().\n");
        }

        System.out.println("\nThese are your triangles. Just make sure they match the spec sheet.");
        try{
            //printPatterns();
            System.out.println(arrayToString(pascalsTriangle(5)));
        }
        catch (Exception e){
            System.out.println("\nFAIL printPatterns() and pascalsTriangle().\n");
        }


	}

}
