package com.mitocode.dao;

import java.util.List;

import com.mitocode.model.Persona;

public interface IPersonaDAO {

	void registrar(Persona per) throws Exception;
	void modificar(Persona per) throws Exception;
	List<Persona> listar() throws Exception;
}

