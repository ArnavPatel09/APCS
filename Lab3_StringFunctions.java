package myfirstpackage;

public class Lab3_StringFunctions 
{
	public static int spaceCount(String s)
	   {
	       boolean i = true;
	       int counter = 0;
	       String a = s;
	       while(i)
	       {
	           int indexNumber = a.indexOf(" "); //this finds the index of a space
	           if(indexNumber >= 0)//checks to see if the space actually exists
	           {
	               counter += 1;//adds 1 to the number of spaces (counter)
	           }
	           else
	               break;
	           a = a.substring(indexNumber+1);//changes substring so it takes away the space just found
	       }
	       return counter;
	   }//End Task 1
	
	public static int vowelCount(String s)
	{
		String sUpper = s.toUpperCase();
		String findVowel = sUpper;//will find all the vowels in the string
		int vowelCount = 0;//number of vowels in the string
		boolean i = true;
			if (sUpper.indexOf("A")>=0) 
			{
				findVowel = sUpper;
					while (i) {
						int indexNumber = findVowel.indexOf("A"); //this finds the index of a vowel
				           if(indexNumber >= 0)//checks to see if the vowel actually exists
				           {
				               vowelCount += 1;//adds 1 to the number of vowel (counter)
				           }
				           else
				        	   break;
				           findVowel = findVowel.substring(indexNumber+1); //changes the string so it doesn't include the vowel just found
					}
					
			}
			if (sUpper.indexOf("E")>=0) 
			{
				findVowel = sUpper;
				while (i) {
					int indexNumber = findVowel.indexOf("E"); //this finds the index of a vowel
			           if(indexNumber >= 0)//checks to see if the vowel actually exists
			           {
			               vowelCount += 1;//adds 1 to the number of vowel (counter)
			           }
			           else
			        	   break;
			           findVowel = findVowel.substring(indexNumber+1);//changes the string so it doesn't include the vowel just found
				}
			}
			if (sUpper.indexOf("I")>=0) 
			{
				findVowel = sUpper;
				while (i) {
					int indexNumber = findVowel.indexOf("I"); //this finds the index of a vowel
			           if(indexNumber >= 0)//checks to see if the vowel actually exists
			           {
			               vowelCount += 1;//adds 1 to the number of vowel (counter)
			           }
			           else
			        	   break;
			           findVowel = findVowel.substring(indexNumber+1);//changes the string so it doesn't include the vowel just found
				}
			}
			if (sUpper.indexOf("O")>=0) 
			{
				findVowel = sUpper;
				while (i) {
					int indexNumber = findVowel.indexOf("O"); //this finds the index of a vowel
			           if(indexNumber >= 0)//checks to see if the vowel actually exists
			           {
			               vowelCount += 1;//adds 1 to the number of vowels (counter)
			           }
			           else
			        	   break;
			           findVowel = findVowel.substring(indexNumber+1);//changes the string so it doesn't include the vowel just found
				}
			}
			if (sUpper.indexOf("U")>=0) 
			{
				findVowel = sUpper;
				while (i) {
					int indexNumber = findVowel.indexOf("U"); //this finds the index of a vowel
			           if(indexNumber >= 0)//checks to see if the vowel actually exists
			           {
			               vowelCount += 1;//adds 1 to the number of vowel (counter)
			           }
			           else
			        	   break;
			           findVowel = findVowel.substring(indexNumber+1);//changes the string so it doesn't include the vowel just found
				}
			}
			return vowelCount;
	}
	
	public static int letterCount(String s, String letter) 
	{
		String findLetter = s.toUpperCase();
		letter = letter.toUpperCase();
		int letterCount = 0;
		while (true) 
		{
			int indexNumber = findLetter.indexOf(letter); //this finds the index of the letter
	           if(indexNumber >= 0)//checks to see if the space actually exists
	           {
	               letterCount += 1;//adds 1 to the number of letters (counter)
	           }
	           else
	        	   break;
	           findLetter = findLetter.substring(indexNumber+1);//removes the letter just found from the string
		}
		return letterCount;
	}
	
	
	public static String duplicate(String s, String letter) 
	{
		String sCopy = s;//making a copy of our parameter
		String sDup = sCopy;//making the return value of our function
		String letterUpper = letter.toUpperCase();// making letter upper case
		
		while(true)
		{
			sCopy = sCopy.toUpperCase();//changing to upper case so we can find all uses of the letter
			int indexNumber = sCopy.indexOf(letterUpper);//finding the index number of the letter
	        if(indexNumber >= 0)//if the letter is there it will go into this statement
	        {
	        	int length = sDup.length()-sCopy.length();//because sCopy will be or is shortened we have to account for that
	        	
	            sDup = sDup.substring(0, indexNumber+1+length) + letter + sDup.substring(indexNumber+1+length);//duplicating the letter
	            sCopy = sDup.substring(indexNumber+2+ length);//updating the string so it doesn't include the letter just found
	        }
	        else//if letter is not found it will exit the while loop
	        	break;
		}
		return sDup;//returning the duplicated string
	}// End duplicate
	//End Task 4
	
	public static String beforeString(String s, String substr) 
	{
		int indexOf = s.indexOf(substr);//finding the index of the substr
		if(indexOf >= 0)//if its there go into this if statement
		{
			return s.substring(0, indexOf);//returns everything before the substr
		}
		else//if there is no instance of the substr then it will go here
			return s;//returns the full string
	}
	//End beforeString
	//End Task 5
	
	public static String afterString(String s, String substr)
	{
		int length = substr.length();//finds the length of the substr (we need this so it doesnt print out part of the substr
		int indexOf = s.indexOf(substr);//finds the index of the substr
		if(indexOf >= 0) //if its there it will go through this statement
		{
			return s.substring(indexOf+length);//this returns everything after the substr 
		}
		else
			return "";//if its not there it will return a blank string
	}//End Task 6
	
	public static String vowelCap(String s)
	{
		String rv = "";
		String letter;
		for(int i = 0; i<s.length(); i++) {
			letter = s.substring(i, i+1);
			if(letter.compareTo("a")==0 || letter.compareTo("e")==0 || letter.compareTo("i")==0||letter.compareTo("o")==0||letter.compareTo("u")==0)
				rv = rv + letter.toUpperCase();
			else
				rv= rv+ letter;
		}
		return rv;
	}//end Task 7
	
	public static String capFirstWord(String s) 
	{
		String sCopy = s; // this will be the sCopy that will change after each word is found
		String sDup = sCopy;//this will be my return string (it will capitalize the first letter)
		if(s.length() > 0) {
			String letter = s.substring(0,1);
			s = letter.toUpperCase() + s.substring(1);
			sCopy = s;
			sDup = sCopy;
		}
		while(true)
		{
			sCopy = sCopy.toUpperCase();//this makes the sCopy fully capitalized
			int indexNumber = sCopy.indexOf(".");//finds the index of the period
	        if(indexNumber >= 0)//if index is there it will go through the if statement.
	        {
	        	int length = sDup.length()-sCopy.length();//finding the length of the string that is missing from sCopy
	        	String letter = sCopy.substring(indexNumber+2, indexNumber+3);//finding the next letter 
	            sDup = sDup.substring(0, indexNumber+2+length) + letter + sDup.substring(indexNumber+3+length); // capitalizing the first letter
	            sCopy = sDup.substring(indexNumber +2+ length);//changing the string so it doesn't find the same period
	        }
	        else//if there is no periods left it will exit the while loop
	        	break;
		}
		return sDup;
	}

	public static void main(String[] args) {
		System.out.println(spaceCount("Hello World"));
		System.out.println(vowelCount("Hello World"));
		System.out.println(letterCount("Hello World", "l"));
		System.out.println(duplicate("Hello World", "l"));
		System.out.println(beforeString("Hello World!", "Wo"));
		System.out.println(afterString("Hello World!", "Hel"));
		System.out.println(vowelCap("Hello World"));
		System.out.println(capFirstWord("hello. world"));

	}

}
