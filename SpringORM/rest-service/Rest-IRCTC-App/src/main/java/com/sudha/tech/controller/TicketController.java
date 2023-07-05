package com.sudha.tech.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudha.tech.binding.PassengerInfo;
import com.sudha.tech.binding.TicketInfo;

@RestController
public class TicketController {
	
	@GetMapping(value = "/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable Integer ticketId) {
		TicketInfo info = new TicketInfo();
		info.setTicketId(7464747);
		info.setPnr("JDJD43533");
		info.setTicketStatus("Confirmed");
		return new ResponseEntity<TicketInfo>(info, HttpStatus.OK);
	}

	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request) {
		System.out.println(request);
		TicketInfo info = new TicketInfo();
		info.setTicketId(7464747);
		info.setPnr("JDJD43533");
		info.setTicketStatus("Confirmed");
		return new ResponseEntity<TicketInfo>(info, HttpStatus.CREATED);
	}

	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request) {
		System.out.println(request);
		return new ResponseEntity<String>("Ticket Update", HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId) {
		return new ResponseEntity<String>("Ticket Deleted", HttpStatus.OK);
	}
}
