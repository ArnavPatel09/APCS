package myfirstpackage;
public class Lab7_Poker 
{
	public static void play() 
	{
		int[] deck = new int[52];//creating deck
		int[] hand1 = new int[5], hand2 = new int[5];//creating hands
		for(int i = 0; i<52; i++)
			deck[i] = i+1;
		shuffle(deck);//randomizing the deck
		System.out.println("----------------");
		System.out.println("Welcome to Poker");
		System.out.println("----------------\n");
		System.out.println(arrayToString(deck));
		
		int j = 0;
		for(int i = 0; i<hand1.length; i++) {
			hand1[i] = deck[j];//adds a card to the hand
			hand2[i] = deck[j+1];//adds a card to the hand
			j += 2;//j increases by 2 that way the same card isn't used twice
		}
		String hand_1 = "Hand1: " + handToString(hand1);//makes the hand a string
		String hand_2 = "Hand2: " + handToString(hand2);//makes the hand a string
		System.out.println(hand_1);//prints out the hand
		System.out.println(hand_2);//prints out the hand
	}//end Play
	
	public static void shuffle(int[] deck) 
	{
		int randomIndex = 0;
		int storage = 0;
		for(int i = 0; i<52; i++) //randomizes the deck 52 times
		{
			randomIndex = (int)(Math.random()*52);//math.random gives a decimal from 0 to 1 (can include 0)
			storage = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = storage;
		}
	}//end shuffle
	
	public static String arrayToString(int[] deck) 
	{
		String rv = "Suit\tFace\n";//making the string look nice
		String suit = "";
		String face = "";
		
		for(int i = 0; i< deck.length; i++) {
			if(suit(deck[i]) == 1)//checks if the suit is equivalent to a number (1-4)
				suit = "S";//if so it will make the string suit the suit of the card
			else if(suit(deck[i]) == 2)
				suit = "H";
			else if(suit(deck[i]) == 3)
				suit = "C";
			else if(suit(deck[i]) == 4)
				suit = "D";
			
			if(face(deck[i]) == 1)//checks if the card is a face card
				face = "A";
			else if(face(deck[i]) == 11)
				face = "J";
			else if(face(deck[i]) == 12)
				face = "Q";
			else if(face(deck[i]) == 13)
				face = "K";
			else
				face = "" + face(deck[i]);
			rv += suit + "    \t" + face + "\n";//adds the suit and face to the string
		}
		return rv;//returning the face string
	}
	
	public static int face(int card) {
		if(card%13 == 0)//if the card is a king
			return 13;//it returns 13
		else
			return card%13;//gives you the integer of the face
	}
	
	public static int suit(int card) {
		int[] suit = new int[52];
		for(int i = 0; i<52; i++) {
			if(i<13)//makes each element the suit number (1-4)
				suit[i] = 1;
			else if(i<26)
				suit[i] = 2;
			else if (i<39)
				suit[i] = 3;
			else if (i<52)
				suit[i] = 4;
		}
		return suit[card-1];//returns the suit of the card given
	}
	public static String cardName(int card) 
	{
		String[] suit = new String [52];
		String rv = "";
		for(int i = 0; i<52; i++) 
		{
			if(i<13)//checks the suit of the card
				suit[i] = "S";
			else if(i<26)
				suit[i] = "H";
			else if (i<39)
				suit[i] = "C";
			else if (i<52)
				suit[i] = "D";
		}
		rv += suit[card-1];//adds the suit to the return string
		int face = face(card);
		for(int i = 1; i<11; i++)
			if(face == i) //checks the card is a number card
			{
				rv += i;//adds the card number to the string
				break;
			}
		if(face == 11)//checks if the card is a face card
			rv += "J";
		else if(face == 12)
			rv += "Q";
		else if(face == 13)
			rv += "K";
		return rv;//returns the suit + face string

	}
	
	public static String handToString(int[] hand) {
		String rv = "[";
		for(int i = 0; i<hand.length-1; i++)
			rv += " " + cardName(hand[i]);//adds the cards to a string
		rv += " " + cardName(hand[hand.length-1]) + " ]";//adds the last card and "closes" the string
		return rv;//returns the string(hand)
	}
	
	public static boolean straightFlush(int[] hand) {
		int count = 0;
		for(int i = 0; i<hand.length; i++) {
			if(suit(hand[i]) == suit(hand[i+1])){
				count ++;
			}
		}
		if(count == 4)
			return true;
		else
			return false;
	}
	
	public static boolean fourKind(int[] hand) {
		int count = 0;
		for(int i = 0; i<hand.length; i++) {
			if(face(hand[i])-1 == face(hand[i+1])) {
				count ++;
			}
		}
		if(count == 3)
			return true;
		else
			return false;
	}
	
	
	
	public static void main(String[] args) 
	{
		play();
	}
	
	
	
	
	
}
