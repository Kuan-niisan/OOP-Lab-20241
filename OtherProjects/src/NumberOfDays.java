import java.util.Scanner;
public class NumberOfDays {
	public static void main(String arg[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of a month:");
		String month = keyboard.nextLine();
		System.out.println("Enter the year:");
		int years = keyboard.nextInt();
		
		boolean valid = false;
		
		int number_of_days = 0;
		switch (month) {
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				month = "January";
				number_of_days = 31;
				valid = true;
				break;
			case "February":
			case "Feb.":
			case "Feb":
			case "2":
				month = "February";
				number_of_days = (years % 4 == 0 && (years % 100 != 0 || years % 400 == 0)) ? 29 : 28;
				valid = true;
				break;
			case "March":
			case "Mar.":
			case "Mar":
			case "3":
				month = "March";
				number_of_days = 31;
				valid = true;
				break;
			case "April":
			case "Apr.":
			case "Apr":
			case "4":
				month = "April";
				number_of_days = 30;
				valid = true;
				break;
			case "May":
			case "5":
				month = "May";
				number_of_days = 31;
				valid = true;
				break;
			case "June":
			case "Jun":
			case "6":
				month = "June";
				number_of_days = 30;
				valid = true;
				break;
			case "July":
			case "Jul":
			case "7":
				month = "July";
				number_of_days = 31;
				valid = true;
				break;
			case "August":
			case "Aug.":
			case "Aug":
			case "8":
				month = "August";
				number_of_days = 31;
				valid = true;
				break;
			case "September":
			case "Sept.":
			case "Sep":
			case "9":
				month = "September";
				number_of_days = 30;
				valid = true;
				break;
			case "October":
			case "Oct.":
			case "Oct":
			case "10":
				month = "October";
				number_of_days = 31;
				valid = true;
				break;
			case "November":
			case "Nov.":
			case "Nov":
			case "11":
				month = "November";
				number_of_days = 30;
				valid = true;
				break;
			case "December":
			case "Dec.":
			case "Dec":
			case "12":
				month = "December";
				number_of_days = 31;
				valid = true;
				break;
		}
		if (valid != true || years < 0) {
			System.out.println("Enter again!");
			
			
		}
		else {
			System.out.println(month + " in the year " + years + " has " + number_of_days + " days");
			}
	}
		
}