package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.cita.repo.IDoctorRepo;
import com.example.demo.cita.repo.IPacienteRepo;
import com.example.demo.cita.repo.modelo.CitaMedica;
import com.example.demo.cita.repo.modelo.Doctor;
import com.example.demo.cita.repo.modelo.Paciente;
import com.example.demo.cita.service.ICitaMedicaService;

@SpringBootApplication
public class Efinal1Pa2P4DbApplication implements CommandLineRunner {

	@Autowired
	private IDoctorRepo doctorRepo;

	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Autowired
	private ICitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Creacioneç de los 2 Doctores
		Doctor doc1 = new Doctor();
		doc1.setApellido("Boada");
		doc1.setNombre("David");
		doc1.setCedula("1720030723");
		doc1.setNumeroConsultorio("C001");
		doc1.setSalario(new BigDecimal(1350));
		doc1.setFechaNacimiento(LocalDate.of(1991, 07, 5));
		doc1.setTitulo("Pediatra");
		//this.doctorRepo.insertar(doc1);
		Doctor doc2 = new Doctor();
		doc2.setApellido("Aguacondo");
		doc2.setNombre("Fernando");
		doc2.setCedula("1720030715");
		doc2.setNumeroConsultorio("C003");
		doc2.setSalario(new BigDecimal(2550));
		doc2.setFechaNacimiento(LocalDate.of(1993, 01, 18));
		doc2.setTitulo("Pediatra");

		//this.doctorRepo.insertar(doc2);

		Paciente paci1 = new Paciente();
		paci1.setApellido("Boada");
		paci1.setNombre("Clare");
		paci1.setCedula("1720030735");
		paci1.setFechaNacimiento(LocalDate.of(2012, 12, 03));
		paci1.setPeso("16kg");
		paci1.setGenero("F");
		paci1.setEstatura("0.55");
		paci1.setCodIess("10003");
		//this.iPacienteRepo.insertar(paci1);

		Paciente paci2 = new Paciente();
		paci2.setApellido("Boada");
		paci2.setNombre("Emilia");
		paci2.setCedula("1720030789");
		paci2.setFechaNacimiento(LocalDate.of(2012, 10, 03));
		paci2.setPeso("20kg");
		paci2.setGenero("F");
		paci2.setEstatura("0.45");
		paci2.setCodIess("10004");
		//this.iPacienteRepo.insertar(paci2);

		//agendamiento de cita Medica
		/*
		this.citaMedicaService.agendarCita("2525", LocalDateTime.now(), new BigDecimal(35), "Maternidad Isidro Ayora",
				"1720030715", "1720030735");*/
		
		//actualziacion de Cita con diagnostico 
		/*
		this.citaMedicaService.actualizar("2525", "tos_con_flema", "Loratadina 100mg/80",
				LocalDateTime.of(2023, 12, 24, 18, 10));
				*/
				



		// Consultar doctor por cecula
		// Doctor docConsul1=this.doctorRepo.buscarCedula("1720030723");
		// System.out.println(docConsul1);

		// buscar citaMedica
		// this.citaMedicaService.reporteCitas(LocalDateTime.now(), new BigDecimal(25));
		
		this.citaMedicaService.buscarFecha(LocalDate.now());

	}

}
