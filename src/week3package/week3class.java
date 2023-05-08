package week3package;

public class week3class {
	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
              String[] element= new String[6];
                        
                       element[0]= "1";
                       element[1]= "5";
                       element[2]= "2";
                       element[3]= "8";
                       element[4]= "13";
                       element[5]= "6";
		
		// 2. Print out the first element in the array
	
		for(int i=0; i<element.length;i++) {
	System.out.println(element[0]);
		// 3. Print out the last element in the array without using the number 5
	System.out.println(element.length-1);
		
		// 4. Print out the element in the array at position 6, what happens?

//	System.out.println(element[6]);
		// 5. Print out the element in the array at position -1, what happens?

//	System.out.println(element[-1]);
		// 6. Write a traditional for loop that prints out each element in the array
	System.out.println("Element "+i+ ":"+ element[i]);}
			
		// 7. Write an enhanced for loop that prints out each element in the array
         for(String elements: element) {
    System.out.println("element:"+ elements);
         
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

	int sum = 0;
	for( int i= 0; i< element.length; i++) {
		int num= Integer.parseInt(element[i]);
		sum =+ num;
	}
	System.out.println("the sum is:"+ sum);
		// 9. Create a new variable called average and assign the average value of the array to it
    double average = (double) sum/element.length;
    System.out.println("The Average is :" + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
   
    for (String num: element) {
    	int val = Integer.parseInt(num);
    
    if( val % 2 != 0) {
	   System.out.println(val
			   );
   }
    }
         }
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		
         String[] student= new String[4];
         
                student[0]= "Sam";
                student[1]=	"Sally";
                student[2]= "Thomas";
                student[3]= "Robert";
                		
                
		// 12. Calculate the sum of all the letters in the new array

		int sum = 0;
		for( String name: student) {
			sum =+ name.length();
		}
        System.out.println("the sum is :"+sum);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
			
	
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	
	}
}
