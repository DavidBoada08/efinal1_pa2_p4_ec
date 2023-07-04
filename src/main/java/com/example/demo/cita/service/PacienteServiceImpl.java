package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.repo.IPacienteRepo;
import com.example.demo.cita.repo.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Override
	public void agregar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.insertar(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.actualizar(paciente);
	}

	@Override
	public Paciente encontrarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepo.buscarCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.eliminar(cedula);
	}

}
