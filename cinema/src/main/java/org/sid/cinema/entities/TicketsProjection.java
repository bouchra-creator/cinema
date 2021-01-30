package org.sid.cinema.entities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.config.Projection;


@Projection(name="ticketProj",types=Ticket.class)
public interface TicketsProjection {
	public Long getId();
	public String getNomClient();
	public double getPrix();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
	

}