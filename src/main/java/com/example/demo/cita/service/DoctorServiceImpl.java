package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.repo.IDoctorRepo;
import com.example.demo.cita.repo.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void agregar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.insertar(doctor);
	}

	@Override
	public void modificar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.actualizar(doctor);
	}

	@Override
	public Doctor encontrarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.doctorRepo.eliminar(cedula);
	}

}
