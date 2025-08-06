package lab3;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class third
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
		String s = sc.nextLine();

		LocalDateTime e = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		LocalDateTime n = LocalDateTime.now();

		if (e.isBefore(n)) {
			System.out.println("The event  passed.");
			
		}

		Duration d = Duration.between(n, e);
		long m = d.toMinutes();

		System.out.println("Time remaining ");
		System.out.println((m / 1440) + " days, " + (m % 1440) / 60 + " hours, and " + (m % 60) + " minutes");
	}
}
