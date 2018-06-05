import java.util.Scanner; // Import the Scanner class for user input
public class Birthday { // Describe Birthday class
	public static void main(String[] args) { // Main function used when initialising
		String[] monthArray = {"January","February","March","April","May","June","July",
				"August","September","October","November","December"}; // Put each month in an array
		
		Scanner scan = new Scanner(System.in); // Initialize a scanner object called scan
		System.out.println("Type your birthday, with forward slashes (m/d/yyyy):"); // Prompt the user to 
			// type their birthday
		String date = scan.nextLine(); // Sets the string "date" to the next line typed
		scan.close(); // close the scanner object
		String[] dateArray = date.split("/"); // split what the user types into an array by the slashes
		
		String day = dateArray[1]; // select the 2nd item in the array (array starts at 0)
		String daySuffix; // name a suffix string to be used
		// the use of suffixes for numbers is irregular, so this section sorts that out
		if (day.equals("1") || day.equals("21") || day.equals("31")) { // if the day needs an "st" after the number
			daySuffix = "st"; // set the suffix string
		} else if (day.equals("2") || day.equals("22")) { // if the day needs a "nd" after the number
			daySuffix = "nd";// set the suffix string
		} else if (day.equals("3") || day.equals("23")) { // if the day needs a "rd" after the number
			daySuffix = "rd"; //set the suffix
		} else { // if the number is regular (no irregular)
			daySuffix = "th"; // regular suffix
		}	
		String month = dateArray[0]; // the month is the first item in the array
		int monthInt = Integer.parseInt(month); // turn the user-input string into an int
		month = monthArray[monthInt - 1]; // the user will type the "real" month number, while the array starts
			// at zero
		String year = dateArray[2]; // the year is the third item in the array
		
		System.out.println("You were born on the " + day + daySuffix +  " day of " + month + ", " + year + ".");
		// Prompt the user with a sentence with their birthdya in it
	}

}