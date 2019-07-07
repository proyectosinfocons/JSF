package com.mitocode.dao.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@Named
@ViewScoped
public class PersonaBean implements Serializable {

	@Inject
	private IPersonaService service;
	private List<Persona> lstPersonas;

	@PostConstruct
	public void init(){
		this.listar();
	}
	
	public void pruebaCDI() throws Exception {
		Persona per = new Persona();
		per.setIdPersona(4);
		per.setNombres("Jaime");
		per.setApellidos("Medina");
		service.registrar(per);
	}

	public void listar() {
		try {
			lstPersonas = service.listar();
		} catch (Exception e) {

		}

	}

	public List<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(List<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

}
