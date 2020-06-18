package myfirstpackage;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>(5);
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		for(int i = primes.size()-1; i>=0; i--) {
			System.out.println(primes.get(i));
		}
		ArrayList<String> alist = new ArrayList<String>();

		alist.add("1");

		alist.add("2");

		alist.remove(1);

		alist.add(1, "3");

		alist.set(1, "4");

		alist.add("5");
		
		alist.add(alist.size(), "1111");
		
		alist.add("1111");

		System.out.println(alist);
		
	}

}
