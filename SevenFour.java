import java.util.Scanner;

public class SevenFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the date in format (date month year)");
		String date=sc.nextLine();				//takes the user input of date
		String[] splits = date.split(",|\\s"); //this regex will the splits the date string on the bases of both space and comman '|' is used as or and \\s is used as space bar
		
		
		System.out.println("The date in format YYYY-MM-DD :"+splits[2]+"-"+splits[1]+"-"+splits[0]); //printing the output
		
	}

}
