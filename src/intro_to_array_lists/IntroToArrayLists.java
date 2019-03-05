package intro_to_array_lists;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		String[] bob= new String[7];
		//2. Add five Strings to your list
		bob[2]= "bob";
		bob[3]= "bobb";
		bob[4]= "bobbb";
		bob[5]= "bobbbb";
		bob[6]= "bobbbbb";
		//3. Print all the Strings using a standard for-loop
		for(int i=2; i<bob.length; i++) {
		System.out.println(bob[i]);
		}
		//4. Print all the Strings using a for-each loop
		for(int i=2; i<bob.length; i++) {
		System.out.println(bob[i]);
		}	
		//5. Print only the even numbered elements in the list.
		for(int i=2; i<bob.length; i++) {
			if(i%2==0) {
		System.out.println(bob[i]);
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i=6; i>2; i--) {
		System.out.println(bob[i]);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=2; i<bob.length; i++) {
		System.out.println(bob[i]);
		}
	}
}
