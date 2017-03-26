package com.apr.javaee.rest.apiversioning.v2.dto;

public class Cliente {

	String nombre;
	String apellido1;
	String appelido2;

	public Cliente(String nombre, String apellido1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getAppelido2() {
		return appelido2;
	}

	public void setAppelido2(String appelido2) {
		this.appelido2 = appelido2;
	}

	public String getNombreCompleto() {
		return "Nombre completo: " + this.getNombre() + " " + this.getApellido1() + " " + this.getAppelido2();
	}

}
