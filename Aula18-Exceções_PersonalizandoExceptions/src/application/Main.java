package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		try {			
			// cria a reserva
			System.out.print("Room number: ");
			int roomNumber = scanner.nextInt();
			System.out.print("Checkin date (dd/mm/yyyy): ");
			Date checkIn = formatoData.parse(scanner.next());
			System.out.print("Checkout date (dd/mm/yyyy): ");
			Date checkOut = formatoData.parse(scanner.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation " + reservation);
	
			// atualiza a reserva
			System.out.print("Enter date to upgrade the reservation: ");
			System.out.print("Checkin date (dd/mm/yyyy): ");
			checkIn = formatoData.parse(scanner.next());
			System.out.print("Checkout date (dd/mm/yyyy): ");
			checkOut = formatoData.parse(scanner.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation " + reservation);
		} 
		catch (ParseException e) {
			System.out.print("Invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation" + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unespected error");
		}

		scanner.close();
	}

}