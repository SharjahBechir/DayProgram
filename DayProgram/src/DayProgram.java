/**
 * @(#)DayProgram.java
 *
 * DayProgram application
 *
 * @author
 * @version 1.00 2018/10/1
 */
import java.util.Scanner;
public class DayProgram
{
	public static void main(String[] args)
		{
		int day=0;
		Scanner num = new Scanner(System.in);
		System.out.println("Input number from 1-7;");
		String in=" ";
		in = num.next();
		day = Integer.parseInt(in);

		switch(day)
		{
			case 1: System.out.println("That day is a Monday!");
				break;
			case 2: System.out.println("That day is a Tuesday!");
				break;
			case 3: System.out.println("That day is a Wednesday!");
				break;
			case 4: System.out.println("That day is a Thursday!");
				break;
			case 5: System.out.println("That day is a Friday!");
				break;
			case 6: System.out.println("That day is a Saturday!");
				break;
			case 7: System.out.println("That day is a Sunday!");
				break;
			default: System.out.println("Invalid input try again");
				break;
		}

		}

}
