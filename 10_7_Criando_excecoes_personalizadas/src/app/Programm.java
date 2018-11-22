package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Programm {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();

		System.out.print("Check-IN date (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to upadate the reservation");

			System.out.print("check-in date dd/mm/yyyy");
			checkIn = sdf.parse(sc.next());

			System.out.print("check-out date dd/mm/yyyy");
			checkOut = sdf.parse(sc.next());

			String error = reservation.updateDates(checkIn, checkOut);
			
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reservation);
			}

		}

	}
}
