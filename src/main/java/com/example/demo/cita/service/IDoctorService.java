package com.example.demo.cita.service;

import com.example.demo.cita.repo.modelo.Doctor;

public interface IDoctorService {

	public void agregar(Doctor doctor);

	public void modificar(Doctor doctor);

	public Doctor encontrarCedula(String cedula);

	public void borrar(String cedula);

}
