package com.example.demo.cita.service;

import com.example.demo.cita.repo.modelo.Paciente;

public interface IPacienteService {

	public void agregar(Paciente paciente);

	public void modificar(Paciente paciente);

	public Paciente encontrarCedula(String cedula);

	public void borrar(String cedula);

}
