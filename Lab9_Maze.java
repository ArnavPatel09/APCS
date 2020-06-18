package myfirstpackage;
import java.util.Random;

//using nextInt from random class
//goes from 0 to the parameter given (not including)
public class Lab9_Maze 
{
	public static int[][] createMap(int r, int c)
	{
		int[][] map = new int[c][];//creates a map with the number of rows
		for(int i = 0; i<map.length; i++)
			map[i] = new int[r];//goes through each "larger" array and gives
		//the length of rows
		return map;
	}//end createMap
	
	public static int[][] createMap() {
		Random random = new Random();
		return createMap(random.nextInt(15));//creates a map with 15 randomly placed walls
	}//end createMap
	
	
	
	public static int[][] createMap(int walls) {
		Random random = new Random();
		int index = 0;
		int[][] map = createMap(10,10);//creates a map
		index = random.nextInt(100);//gives a random integer
		//first integer is the column, second is the row
		map[index/10][index%10] = 1;//Start
		index = random.nextInt(100);
		map[index/10][index%10] = 2;//Finish
		while(walls > 0) {
			index = random.nextInt(100);
			if(map[index/10][index%10] == 0) {
				map[index/10][index%10] = 3;
				walls -= 1;//subtracts 1 from the walls
			}
			
		}
		return map;//returns the map with the limited walls
	}//end createMap
	
	public static String getSymbol(int value) {
		if(value == 0)//checks what the value is
			return "-";//returns the corresponding string
		else if(value == 1)
			return "Y";
		else if(value == 2)
			return "F";
		else if(value == 3)
			return "*";
		else
			return null;//if not there returns null
	}//end getSymbol
	
	public static void printMap(int[][] m) {
		for(int r = 0; r<m.length; r++) {
			for(int c = 0; c<m[r].length; c++) 
			{//goes through each element
				System.out.print("  " + getSymbol(m[r][c]));//prints out the element
			}
			System.out.println();//starts the next row
		}
	}//end printMap
	
	public static String mapToString(int[][]m) {
		String rv = "";
		for(int r = 0; r<m.length; r++) {
			for(int c = 0; c<m[r].length; c++) 
			{//goes through each element
				rv += "  " + getSymbol(m[r][c]);//adds each the element to the string
			}
			rv += "\n";//starts a new row
		}
		return rv;
	}//end mapToString
	
	
	
	public static int[] find(int [][] m, int value) {
		int[] rv = new int[2];//creates the rv with 2 spots (column and row)
		for(int r = 0; r<m.length; r++) {
			for(int c = 0; c<m[r].length; c++) 
			{
				if(m[r][c] == value) {//checks each element starting with (0,0)
					rv[0] = r;
					rv[1] = c;
					return rv;//first one it finds it returns
				}
			}
		}
		return null;//if none is found returns null
	}//end find
	
	public static boolean canGoN(int[][]m) {
		int[][] north = new int[1][1];//creates a 2d array with 1 spot
		int[] you = find(m, 1);//finds the start
		north[0][0] = m[you[0]-1][you[1]];//makes north the element north of start(y)
		if(find(north, 0)== null)//checks if north has no value
			return false;//returns false if the statement is true
		else {
			return true;//returns true
		}
	}
	
	public static boolean canGoS(int[][]m) {
		int[][] south = new int[1][1];//same as canGoN
		int[] you = find(m, 1);//but checks the element south of start
		south[0][0] = m[you[0]+1][you[1]];
		if(find(south, 0) == null)
			return false;
		else {
			m[you[0]+1][you[1]] = 1;
			m[you[0]][you[1]] = 0;
			return true;
		}
	}
	
	public static boolean canGoW(int[][]m) {
		int[][] west = new int[1][1];//same as canGoN
		int[] you = find(m, 1);//but checks the element to the west of start("Y")
		west[0][0] = m[you[0]][you[1]-1];
		if(find(west, 0) == null)
			return false;
		else {
			m[you[0]][you[1]-1] = 1;
			m[you[0]][you[1]] = 0;
			return true;
		}
	}
	
	public static boolean canGoE(int[][]m) {
		int[][] east = new int[1][1];//same as canGoW
		int[] you = find(m, 1);//but checks the element to the east of start("Y")
		east[0][0] = m[you[0]][you[1]+1];
		if(find(east, 0) == null)
			return false;
		else {
			m[you[0]][you[1]+1] = 1;
			m[you[0]][you[1]] = 0;
			return true;
		}
	}
	
	
	public static int minPath(int[][]m, int count) {
		//this function should use the recursive function
		//because the recursive function continues going until it stops
		//if there are other paths, the function should be called again
		//the function should be called again when another path can be taken
		//map needs another variable to fill the areas its already gone to prevent
		//an infinite loop
		if(canGoN(m) == true || canGoW(m) == true || canGoE(m)==true|| canGoS(m)==true) 
		{
			int[] coordinate = find(m, 2);
			if(getSymbol(coordinate[1])==getSymbol(2))//checks for the Finish
				return count;//returns the count
		}
		else
			return minPath(m, count);
		return 1;
		
	}//end minPath
	
	
	public static void main(String[] args) 
	{	
		System.out.println("Empty Map");
		printMap(createMap(10,10));
		System.out.println();
		System.out.println("Map with walls");
		printMap(createMap());
		System.out.println();
		System.out.println("Map with limited walls");
		int[][] map = createMap(25);
		printMap(map);
		System.out.println();
		System.out.println("checking if you can go NSEW");
		System.out.println("CAN GO EAST - " + canGoE(map));
		System.out.println("CAN GO WEST - " + canGoW(map));
		System.out.println("CAN GO SOUTH - " + canGoS(map));
		System.out.println("CAN GO NORTH - " + canGoN(map));
		System.out.println(mapToString(map));
		System.out.println("Finding coordinates of Y");
		int[] coordinates = find(map, 1);
		System.out.println("(" + coordinates[0] + "," + coordinates[1] + ")");
		System.out.println(getSymbol(1));
		
		
	}
}
