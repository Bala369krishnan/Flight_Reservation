package com.example.flight_reservation.util;

import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.example.flight_reservation.entities.Reservations;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGenerator {
	
	
	public void generateItinerary(Reservations reservation,String filePath) {
		Document document = new Document();
		     
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
		     document.open();
		     document.add(generateTable(reservation));
		     document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public PdfPTable generateTable(Reservations reservation) {
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("FLIGHT RESERVATION"));
		cell.setColspan(2);
		table.addCell(cell);
		
		
		cell = new PdfPCell(new Phrase("Flight Details"));
        cell.setColspan(2);
        table.addCell(cell);
		
        table.addCell("Departure City");
        table.addCell(reservation.getFlight().getDepartureCity());
        table.addCell("Arrival City");
        table.addCell(reservation.getFlight().getArrivalCity());
        table.addCell("Flight Number");
        table.addCell(reservation.getFlight().getFlightNumber());
        table.addCell("Departure Time");
        table.addCell(reservation.getFlight().getEstimatedDeptTime().toString());
        
        cell= new PdfPCell(new Phrase("Passenger Details"));
        cell.setColspan(2);
        table.addCell(cell);
        
        
        table.addCell("First Name");
        table.addCell(reservation.getPassenger().getFirstName());
        table.addCell("Last Name");
        table.addCell(reservation.getPassenger().getLastName());
        table.addCell("Email");
        table.addCell(reservation.getPassenger().getEmail());
        table.addCell("Phone");
        table.addCell(reservation.getPassenger().getPhone());
        
		return table;
	}
	
}
