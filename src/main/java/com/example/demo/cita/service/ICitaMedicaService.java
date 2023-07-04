package com.example.demo.cita.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.cita.repo.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void agregar(CitaMedica citaMedica);

	// funcionalidad 3
	public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal Costo, String lugar, String cedulaDoctor,
			String cedulaPaciente);

	// funcionalidad 4
	public void actualizar(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl);
	
	public CitaMedica buscarFecha(LocalDate fechaCita);

}
