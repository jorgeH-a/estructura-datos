package edu.udelp.queue;
import java.time.LocalDate;
public class DateNodo {
	private DateNodo enlace;
	private LocalDate prioridad;
	private Object valor;
	public DateNodo getEnlace() {
		return enlace;
	}
	public void setEnlace(DateNodo enlace) {
		this.enlace = enlace;
	}
	public LocalDate getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(LocalDate prioridad) {
		this.prioridad = prioridad;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object dato) {
		this.valor = dato;
	}
}
