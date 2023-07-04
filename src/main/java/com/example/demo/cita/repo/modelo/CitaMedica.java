package com.example.demo.cita.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cita")
@Entity
public class CitaMedica {
	@Id
	@SequenceGenerator(name = "seq_citamed", sequenceName = "seq_citamed", allocationSize = 1)
	@GeneratedValue(generator = "seq_citamed", strategy = GenerationType.SEQUENCE)
	@Column(name = "cime_id")
	private Integer id;

	@Column(name = "cime_numero_turno")
	private String numeroTurno;

	@Column(name = "cime_fecha_cita")
	private LocalDateTime fechaCita;

	@Column(name = "cime_costo")
	private BigDecimal costoCita;

	@Column(name = "cime_lugar")
	private String lugarCita;

	@Column(name = "cime_diagnostico")
	private String diagnositico;

	@Column(name = "cime_receta")
	private String receta;

	@Column(name = "cime_fecha_control")
	private LocalDateTime fechaControl;

	@ManyToOne
	@JoinColumn(name = "cita_id_doctor")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;

	// SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTurno() {
		return numeroTurno;
	}

	public void setNumeroTurno(String numeroTurno) {
		this.numeroTurno = numeroTurno;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getCostoCita() {
		return costoCita;
	}

	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}

	public String getLugarCita() {
		return lugarCita;
	}

	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}

	public String getDiagnositico() {
		return diagnositico;
	}

	public void setDiagnositico(String diagnositico) {
		this.diagnositico = diagnositico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numeroTurno=" + numeroTurno + ", fechaCita=" + fechaCita + ", costoCita="
				+ costoCita + ", lugarCita=" + lugarCita + ", diagnositico=" + diagnositico + ", receta=" + receta
				+ ", fechaControl=" + fechaControl + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}

}
