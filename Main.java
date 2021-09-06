import java.util.Scanner;



public class Main{
    public static void main(String[] args) {

        
        System.out.println("Please enter a number of days:");
     Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
        int hours,minutes,seconds;

        hours= days * 24;
        minutes = hours * 60;
        seconds =minutes * 60;

        System.out.println(seconds);
        scanner.close();
    }
}