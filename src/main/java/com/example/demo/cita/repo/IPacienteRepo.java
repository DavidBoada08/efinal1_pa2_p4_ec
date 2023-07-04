package com.example.demo.cita.repo;

import com.example.demo.cita.repo.modelo.Paciente;

public interface IPacienteRepo {

	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public Paciente buscarCedula(String cedula);

	public void eliminar(String cedula);

}
