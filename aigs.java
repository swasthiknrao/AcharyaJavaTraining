
/* 
 Java primitive data types (range, size, default, example)

 byte    — Range: -128 to 127; Size: 1 byte (8 bits); Default: 0; Example: byte b = 10;
 short   — Range: -32,768 to 32,767; Size: 2 bytes (16 bits); Default: 0; Example: short s = 1000;
 int     — Range: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647); Size: 4 bytes (32 bits); Default: 0; Example: int i = 123456;
 long    — Range: -2^63 to 2^63-1; Size: 8 bytes (64 bits); Default: 0L; Example: long l = 123456789L;

 float   — Range: approx ±3.40282347e+38 (6–7 decimal digits precision); Size: 4 bytes (32 bits); Default: 0.0f; Example: float f = 3.14f;
 double  — Range: approx ±1.7976931348623157e+308 (15 decimal digits precision); Size: 8 bytes (64 bits); Default: 0.0d; Example: double d = 3.14159;

 char    — Range: '\u0000' (0) to '\uffff' (65,535); Size: 2 bytes (16 bits); Default: '\u0000'; Example: char c = 'A';
 boolean — Range: true or false; Size: VM dependent (commonly 1 bit); Default: false; Example: boolean bool = true;

 Common reference type:
 String  — Object type; Default: null; Example: String s = "hello";

preimintive data types 
 only store one value in the variable 


 non premitive
 can store multiple data aina variable 


--------------------------------------------------------------------------------------



 ARRAYS IN JAVA

  -arrays store multiple values of same type ,
	- we need arrays to store more than one values
	- syntax:
		datatype[] name = new datatype[length] ;
		int[] arr = new int[5]
	- store many values in teh int array




---------------------------------------------------------------------------------------------


	TYPE CASTING IN JAVA

		-Type means the data types  of a variable  or intity  and casting means  converting  the datataype of an entity


	- converting one data type to another data type
	- two types
		1. implicit type casting (widening)
			- converting smaller data type to larger data type
			byte -> short -> int -> long -> float -> double



			 example;
			 int a = 10;
			 double b = a;  // implicit type casting from int to double
			 System.out.println(b); // output: 10.0


		2. explicit type casting (narrowing)
			- converting larger data type to smaller data type
			double -> float -> long -> int -> short -> byte 



			 example:
			 double x = 10.5;
			 int y = (int) x; // explicit type casting from double to int
			 System.out.println(y); // output: 10


			 		 difference between implicit and explicit type casting
					 -----------------------------------------------------------------------
					 |   Implicit Type Casting          |    Explicit Type Casting         |
					 -----------------------------------------------------------------------
					 | 1. invlioved  changing  the      | 1. Involves changing  the        |
					 |data tyoe of a variable           |  representation   or format  of  |
					 								    	value                          | 
					 | 2. Smaller to larger data type   | 2. Larger to smaller data type   |
					 | 3. No data loss                  | 3. Possible data loss            |
                     -----------------------------------------------------------------------
					 

---------------------------------------------------------------------------------------------------------------------





OPERATORS  AND EXPRESSION IN JAVA
	an OPERATOR is a symbol that performs specific operations on one, two, or more operands and produces a result. 
	- types of operators
		1. Arithmetic operators
		2. Relational operators/
		3. Logical operators
		4. Assignment operators
		5. Bitwise operators
		6. Increment and Decrement operators
		7.Conditional operators
		8. Special operators

		ARITHMETIC OPERATORS
			- used to perform basic mathematical operations
			- types:
				1. Addition            (+)      (a+b)
				2. Subtraction         (-)		(a-b)	
				3. Multiplication      (*)		(a*b)		
				4. Division            (/)		(a/b)
				5. Modulus             (%)	    (a%b)	

				 int a = 3 ;
				 System.out.println("Addition: " + (a % 2));         // Output :1 
			
				


		 Relational OPERATORS
			- used to compare two values
			- types:
				1. Equal to                    (==)       (a==b)
				2. Not equal to                (!=)       (a!=b)
				3. Greater than                (>)        (a>b)
				4. Less than                   (<)        (a<b)
				5. Greater than or equal to    (>=)       (a>=b)
				6. Less than or equal to       (<=)       (a<=b)

					Example:
					int a = 5;
					int b = 10;
					System.out.println(a < b);     // Output: true
					System.out.println(a > b);     // Output: false
				    System.out.println(a == b);    // Output: false
					System.out.println(a != b);    // Output: true
					System.out.println(a <= b);    // Output: true
					System.out.println(a >=b);     // Output: false





// declare a variable calculate  teh HRA Basix salery TA  Other allowance  TOtal salery  10% tax Deduct  ,  net saery after tax   deduction print net salery
			double s = 50000;
			double HRA = s* 0.20;
			double TA = s * 0.10;
			double OA = s * 0.15;

			double TS = s + HRA + TA + OA;
			double TD = TS * 0.10;
			double NS = TS - TD;
			System.out.println("Net Salery after tax deduction: " + NS);


	//calculate teh area and teh perimeter of the circle
		double r = 10;
		double  a = 3.14*r*r;
		double  p = 2*3.14*r;
		System.out.println("circle : ");  
		System.out.println(" the area = "+ a +" \n the perimeter : "+p);
		// area of the rectangle
		int l =10;
		int b = 5 ;
		System.out.println("\n rectangle :");  
		System.out.println(" the area  = "+ l*b);



		 // avg of 3 marks 
		  int m1 = 90;
		  int m2 = 89;
		  int m3 = 67;
		  System.out.println(" the avg  = "+(m1+m2+m3)/3);

------------------------------------------------------------------------------------------------------------

  tersiory operatior






LOGICAL OPERATORS IN JAVA
	- used to perform logical operations on boolean values
	- types:
		1. Logical AND         (&&)      (a && b)
		2. Logical OR          (||)      (a || b)
		3. Logical NOT         (!)       (!a)

		 Example:
			boolean a = true;
			boolean b = false;
			System.out.println(a && b);    // Output: false
			System.out.println(a || b);    // Output: true
			System.out.println(!a);        // Output: false

-------------------------------------------------------------

Ternary Operator IN JAVA
	- also known as conditional operator
	- syntax:
		condition ? expression1 : expression2
	- example:
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max value: " + max); // Output: 20

-------------------------------------------------------------
Bitwse operator
	- used to perform bitwise operations on integer values
	- types:
		1. Bitwise AND         (&)      (a & b)
		2. Bitwise OR          (|)      (a | b)
		3. Bitwise XOR         (^)      (a ^ b)
		4. Left Shift          (<<)     (a << 2)
		5. Right Shift         (>>)     (a >> 2)

		 Example:
			int a = 5;      // Binary: 0101
			int b = 3;      // Binary: 0011
			System.out.println(a & b);    // Output: 1  (Binary: 0001)
			System.out.println(a | b);    // Output: 7  (Binary: 0111)
			System.out.println(a ^ b);    // Output: 6  (Binary: 0110)
			System.out.println(a << 1);   // Output: 10 (Binary: 1010)
			System.out.println(a >> 1);   // Output: 2  (Binary: 0010)

----------------------------------------------------------------------------
THE HEIRARCHY OF THE OPERATORS


  - Parentheses                    ( )
  - Unary Operators                ++  --  +  -  ~  !
  - Multiplicative Operators       *  /  %
  - Additive Operators             +  -
  - Shift Operators                <<  >>  >>>
  - Relational Operators           <  >  <=  >=  instanceof
  - Equality Operators             ==  !=
  - Bitwise AND Operator           &
  - Bitwise XOR Operator           ^
  - Bitwise OR Operator            |
  - Logical AND Operator           &&
  - Logical OR Operator            ||
  - Ternary Operator               ? :
  - Assignment Operators           =  +=  -=  *=  /=  %=  &=  ^=  |=  <<=  >>=  >>>=


  ---------------------------------------------------------------------------------


conditionl 
 operators in java

	- also known as ternary operator
	- syntax:
		condition ? expression1 : expression2
	- example:
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max value: " + max); // Output: 20




IF COnditional statement in java

	- used to execute a block of code based on a condition
	- syntax:
		if (condition) {
			// code to be executed if condition is true
		} else {
			// code to be executed if condition is false
		}
	- example:
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than or equal to a");
		}

		flow chart of if else condition
		
		

		
ELSE IF conditional statement in java

		 - used to specify a new condition if the first condition is false
		 - syntax:
		 	if (condition1) {
		 		// code to be executed if condition1 is true
		 	} else if (condition2) {
		 		// code to be executed if condition2 is true
		 	} else {
		 		// code to be executed if both conditions are false
		 	}
		 - example:
		 	int a = 10;
		 	int b = 20;
		 	if (a > b) {
		 		System.out.println("a is greater than b");
		 	} else if (a == b) {
		 		System.out.println("a is equal to b");
		 	} else {
		 		System.out.println("b is greater than a");
		 	}



IF ELSE IF LADDER IN JAVA

	- used to execute one block of code among multiple blocks based on different conditions
	- syntax:
		if (condition1) {
			// code to be executed if condition1 is true
		} else if (condition2) {
			// code to be executed if condition2 is true
		} else if (condition3) {
			// code to be executed if condition3 is true
		} else {
			// code to be executed if all conditions are false
		}
	- example:
		int a = 10;
		int b = 20;
		int c = 15;
		if (a > b && a > c) {
			System.out.println("a is the largest");
		} else if (b > a && b > c) {
			System.out.println("b is the largest");
		} else if (c > a && c > b) {
			System.out.println("c is the largest");
		} else {
			System.out.println("There is a tie for the largest value");
		}



NESTED IF STATEMENT IN JAVA

	- an if statement inside another if statement
	- syntax:
		if (condition1) {
			// code to be executed if condition1 is true
			if (condition2) {
				// code to be executed if condition2 is true
			}
		}
	- example:
		int a = 10;
		int b = 20;
		int c = 15;
		if (a > b) {
			if (a > c) {
				System.out.println("a is the largest");
			} else {
				System.out.println("c is the largest");
			}
		} else {
			if (b > c) {
				System.out.println("b is the largest");
			} else {
				System.out.println("c is the largest");
			}
		}




		SWITCH CONTIONS
		- used to execute one block of code among multiple blocks based on the value of a variable
		- syntax:
		switch (variable) {
			case value1:
				// code to be executed if variable == value1
				break;
			case value2:
				// code to be executed if variable == value2
				break;
			...
			default:
				// code to be executed if variable does not match any case
		}

		- example:
		int day = 3;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid day");
		}




--------------------------------------------------------------------------------------------------------------------


JUMPING STATEMENTS IN JAVA

	- used to transfer control to another part of the program
	- types:
		1. break statement
		2. continue statement
		3. return statement

		1. BREAK STATEMENT
			- used to exit a loop or switch statement
			- example:
				for (int i = 1; i <= 10; i++) {
					if (i == 5) {
						break; // exit the loop when i is 5
					}
					System.out.println(i);
				}

		2. CONTINUE STATEMENT
			- used to skip the current iteration of a loop and move to the next iteration
			- example:
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 0) {
						continue; // skip even numbers
					}
					System.out.println(i);
				}

		3. RETURN STATEMENT
			- used to exit a method and optionally return a value
			- example:
				public int add(int a, int b) {
					return a + b; // return the sum of a and b
				}

int[] arr = {10,20,30,40,50};
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
					
// primt



// /// find the smallest and largest number among three numbers
// 		int a = 10;
// 		int b = 20;
// 		int c = 15;

// 		int largest, smallest;

// 		// Finding the largest number
// 		if (a >= b && a >= c) {
// 			largest = a;
// 		} else if (b >= a && b >= c) {
// 			largest = b;
// 		} else {
// 			largest = c;
// 		}

// 		// Finding the smallest number
// 		if (a <= b && a <= c) {
// 			smallest = a;
// 		} else if (b <= a && b <= c) {
// 			smallest = b;
// 		} else {
// 			smallest = c;
// 		}

// 		System.out.println("Largest number: " + largest);
// 		System.out.println("Smallest number: " + smallest);










// // print a prog to write al teh char  a to z using loop
// 		for (char ch = 'a'; ch <= 'z'; ch++) {
// 			ystem.out.print(ch + " ");
// 		}S



// // wriet a proger t to find teh reh giver year s a leap year or not
// 		int year 

// 		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
// 			System.out.println("\n" + year + " is a leap year.");
// 		} else {
// 			System.out.println("\n" + year + " is not a leap year.");
// 		}


//


// // delare 4 byte variable
// 		byte b1 = 10;
// 		byte b2 = 200;
// 		byte b3 = 30;
// 		byte b4 = 400;

// 		int sum = b1 + b2 + b3 + b4;
// 		System.out.println("Sum of byte variables: " + sum);



// // declare a bloolean variable , assigne it  use if condotion  to cjeck the value and print "true " or "false"
// 		boolean flag = true;

// 		if (flag) {
// 			System.out.println("The boolean variable is true.");
// 		} else {
// 			System.out.println("The boolean variable is false.");
// 		}


// //calculate the  area of tehcircle , tae radios as a float
// 		float radius = 7.5f;
// 		float area = 3.14f * radius * radius;
// 		System.out.println("Area of the circle: " + area);




// // calculate the salery  with componnet  HRA , DA ,BASic , TAX -15%, deducate tax and print net salery
// 		double basicSalary = 50000;
// 		double HRA = basicSalary * 0.20; 
// 		double DA = basicSalary * 0.10;  
// 		double grossSalary = basicSalary + HRA + DA;
// 		double tax = grossSalary * 0.15; 
// 		double netSalary = grossSalary - tax;

// 		System.out.println("Net Salary after tax deduction: " + netSalary);

// // Integer Array of 5 elelmet  print the 3rd elemet
// 		int[] numbers = {10, 20, 30, 40, 50};
// 		System.out.println("The 3rd element in the array is: " + numbers[2]);

// declare an aarray  initaialize  with  user input  print the array elememt
  // int[] arr = new int[5];

        // System.out.println("Enter 5 numbers:");

        // for (int i = 0; i < arr.length; i++) { 
        //     arr[i] = Integer.parseInt(in.readLine());
        // }

        // System.out.println("The array elements are:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Element  : " + arr[i]);
        // }



// // use terni=ery operator to find the max number

// 		int a = 10;
// 		int b = 100;
// 		int c =300;
// 		int d =450;
// 		int e = 690;
// 		int max = (a > b) ? ( (a>c) ? ( (a>d) ? ( (a>e) ? a : e ) : ( (d>e) ? d : e ) ) : ( (c>d) ? ( (c>e) ? c : e ) : ( (d>e) ? d : e ) ) ) : ( (b>c) ? ( (b>d) ? ( (b>e) ? b : e ) : ( (d>e) ? d : e ) ) : ( (c>d) ? ( (c>e) ? c : e ) : ( (d>e) ? d : e ) ) );
// 		System.out.println("Max value: " + max);                                      // Output: Max value: 690






FOR EACH LOOP IN JAVA
	- used to iterate over elements in an array or collection

	- syntax:
		for (datatype variable : array/collection) {
			// code to be executed for each element
		}	

	- example:
    // prit 1 to 10 with for each loop
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	for(int num : arr){
		System.out.println(num);





----------------------------------------------------------------------------------------------


// // write a prog to input total amount in  a bill , if amount  is greater  than 10000 then add a discount  of 8% to the bill amount , if the ampount is greater than 2000 then add a doscount of 15% to the biill  amount ,If  the maount is less than 1000 then no discoaunt 

// 		System.out.print("Enter the total bill amount: ");
// 		double billAmount = Double.parseDouble(in.readLine());

// 		double discount = 0;

// 		if (billAmount > 2000) {
// 			discount = billAmount * 0.15; 
// 		} else if (billAmount > 1000) {
// 			discount = billAmount * 0.08; 
// 		} else {
// 			discount = 0; // No discount
// 		}

// 		double finalAmount = billAmount - discount;
// 		System.out.println("Final bill amount after discount: " + finalAmount);




// //  write a prog to input the number  of unit  of elecricity ansumed in house and calculate  the finall amount  usiing  nested if statement ,Use the below data  fo rteh calulation 
// //  unit s                cost 
// //  <30                 rs 3.50/unit 
// //  >=30 and  <50       rs 4.25/unit
// //  >=50 and <100       rs 5.25/unit
// //  >=100     	         rs 5.85/unit
// 		System.out.print("Enter the number of electricity units consumed: ");
// 		int unitsConsumed = Integer.parseInt(in.readLine());
// 		double costPerUnit;
// 		if (unitsConsumed < 30) {
// 			costPerUnit = 3.50;
// 		} else if (unitsConsumed >= 30 && unitsConsumed < 50) {
// 			costPerUnit = 4.25;
// 		} else if (unitsConsumed >= 50 && unitsConsumed < 100) {
// 			costPerUnit = 5.25;
// 		} else {
// 			costPerUnit = 5.85;
// 		}
// 			 double totalCost = unitsConsumed * costPerUnit;
// 		System.out.println("Total electricity bill amount: Rs " + totalCost);

`				//write a prog to display  teh price of a pizza  based on teh size  orderd using swich statment 
//small size 125 
//mediium size 250
// large size 300
// veryarge size 350
		System.out.print("Enter the size of the pizza (small, medium, large, verylarge): ");
		String size = in.readLine().toLowerCase();
		int price;
		switch (size) {
			case "small":
				price = 125;
				break;
			case "medium":
				price = 250;
				break;
			case "large":
				price = 300;
				break;
			case "verylarge":
				price =350;
				break;
			default:
				price = 0;
				System.out.println("Invalid size entered.");
				return;
				
			System.out .println("The price of the " + size + " pizza is: Rs " + price);





		
*/

import java.io.DataInputStream;
import java.io.IOException;

public class aigs {

	public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);

// //Pattern
// 		for(int i=1;i<10;i++){
// 			for(int j=1;j<=i;j++){
// 				System.out.print(j);
// 			}
// 		System.out.println();
// 		}	


// //sum of 10 natural numbers
// 		int sum = 0;
// 		for(int i=1;i<=10;i++){
// 			sum += i;
// 		}
// 		System.out.println("Sum of first 10 numbers: " + sum);
// 
// // factorial of a number
// 		int n = 5; 
// 		int fact = 1;
// 		for(int i=1;i<=n;i++){
// 			fact *= i;
// 		}
// 		System.out.println("Factorial of " + n + " is: " + fact);

//sum of a digits of a numnet 6784 like6+7+8+4=25
		int number = 6784;
		int sum = 0;
		while(number > 0){
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		System.out.println("Sum of digits: " + sum);
	}
}