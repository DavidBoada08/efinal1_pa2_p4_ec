package com.example.demo.cita.repo;

import com.example.demo.cita.repo.modelo.Doctor;

public interface IDoctorRepo {

	public void insertar(Doctor doctor);

	public void actualizar(Doctor doctor);

	public Doctor buscarCedula(String cedula);

	public void eliminar(String cedula);

}
