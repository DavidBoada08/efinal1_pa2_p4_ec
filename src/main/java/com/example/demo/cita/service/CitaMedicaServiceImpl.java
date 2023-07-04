package com.example.demo.cita.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.repo.ICitaMedicaRepo;
import com.example.demo.cita.repo.IDoctorRepo;
import com.example.demo.cita.repo.IPacienteRepo;
import com.example.demo.cita.repo.modelo.CitaMedica;
import com.example.demo.cita.repo.modelo.Doctor;
import com.example.demo.cita.repo.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private IDoctorRepo doctorRepo;

	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;

	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.insertar(citaMedica);
	}

	@Override
	public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal costo, String lugar, String cedulaDoctor,
			String cedulaPaciente) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroTurno(numero);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setCostoCita(costo);
		citaMedica.setLugarCita(lugar);

		Doctor doc = this.doctorRepo.buscarCedula(cedulaDoctor);
		Paciente paci = this.iPacienteRepo.buscarCedula(cedulaPaciente);
		citaMedica.setDoctor(doc);
		citaMedica.setPaciente(paci);

		this.citaMedicaRepo.insertar(citaMedica);

	}

	@Override
	public void actualizar(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica cita = this.citaMedicaRepo.buscar(numeroCita);
		cita.setDiagnositico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaControl(fechaControl);
		this.citaMedicaRepo.actualizar(cita);

	}

	@Override
	public CitaMedica buscarFecha(LocalDate fechaCita) {

		return this.citaMedicaRepo.buscarFecha(fechaCita);
	}

}
