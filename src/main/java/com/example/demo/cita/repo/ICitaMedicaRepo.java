package com.example.demo.cita.repo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.cita.repo.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void insertar(CitaMedica citaMedica);

	public void actualizar(CitaMedica citaMedica);

	public CitaMedica buscar(String numeroCita);

	public void eliminar(String numeroCita);
	
	public CitaMedica buscarFecha(LocalDate fechaCita);

}
