package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//	Main Class which is implementing the Generic Hash Map 
public class EmpGenericHashMap {
	//	Main Method to store the employee information like Employee Name and Employee Code by taking the input from the User. 
	//	Further providing the option to display the entered Employee names by iterating the hash Map entry object
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);					//	Scanner object to get the user input from the console
		Map<String, String> employeeMap = new HashMap<>();			//	Generic Hash Map to store the user entered values.

		String employeeCode = "";									//	Variable to store the Employee code from the user
		String employeeName = "";									//	Variable to store the Employee Name from the user

		int choice = 0;												//	Variable to store the user entered choice

		System.out.println("Enter the Employee details To store in Map -> ");

		while (true) {												//	Infinite Loop to take the input from the user until it is interrupted by the user

			System.out.print("Enter 1. Add Empployee 2. Display Employee List 3. Exit : ");
			choice = userInput.nextInt();							// Taking the choice from the user	

			if (choice == 1) {										// If the choice is 1 the user can enter the details to store in the hash map
				System.out.print("Enter Employee Code : ");

				userInput.nextLine();								
				employeeCode = userInput.nextLine();				// Taking the employee code from the user
				
				System.out.print("Enter Employee Name : ");
				
				employeeName = userInput.nextLine();				// Taking the employee name from the user

				employeeMap.put(employeeCode, employeeName);		//	Adding it to the hash map using put function.
			} else if (choice == 2) {								//	If the choice is 2 user can display the already entered employee names
				System.out.println("Entered Employee Names till now .... ");
				
				for(Map.Entry<String, String> entry : employeeMap.entrySet()){		//	Loop iterate over the map entry set
					System.out.println(entry.getValue());							//	Getting the value from the entry object and displaying it
				}
			} else if (choice == 3) {												//	If the choice is 3 then it will break the loop and exits.
				System.out.println("Exiting ...... ");
				System.out.println("Exited");
				break;
			} else {												//	If any other number is entered then it will come here and displays the error message
				System.out.println("Entered invalid choice Please try again .....");
				continue;
			}
		}
		
		userInput.close();											// Closing the scanner stream to avoid memory leaks.
	}
}