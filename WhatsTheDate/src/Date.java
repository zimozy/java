import java.util.Scanner; // Import the Scanner class for user input
public class Date {// Describe Date class
	public static void main(String[] args) {// Main function used when initializing		
		String[] monthArray = {"January","February","March","April","May","June","July",
				"August","September","October","November","December"};// Put each month in an array
		Scanner scan = new Scanner(System.in); // Initialize a scanner object called scan
		System.out.println("Enter date, with forward slashes:"); // Prompt the user to enter the date
		String dateString = scan.nextLine(); // put user input in string
		scan.close(); // closer scanner object
		String[] dateArray = dateString.split("/");  // split the string into an array by the slashes
		
		String day = dateArray[1]; // the second item is the day
		String daySuffix; // name a suffix string
		if (day.equals("1") || day.equals("21") || day.equals("31")) { // if the suffix should be "st"
			daySuffix = "st"; // set suffix
		} else if (day.equals("2") || day.equals("22")) { // if the suffix should be "nd"
			daySuffix = "nd"; // set the suffix
		} else if (day.equals("3") || day.equals("23")) { // if the suffix should be "rd"
			daySuffix = "rd"; // set the suffix
		} else { // if the suffix should be regular a "th"
			daySuffix = "th"; // set the suffix
		}
		
		String month = dateArray[0]; // the month was the first array item typed
		int monthInt = Integer.parseInt(month); // convert month string number to integer
		month = monthArray[monthInt - 1]; // get the name of that month based on the integer. subtract 1 since the array starts at 0 
		
		String year = dateArray[2]; // year is the third item in the array
		
		System.out.println("In a sentence, that means:\n " + month + " " + day + daySuffix +  ", " + year); // tell the user the date in sentence format
	}
}