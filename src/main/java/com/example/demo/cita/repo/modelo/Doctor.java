package com.example.demo.cita.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "doctor")
@Entity
public class Doctor {
	@Id
	@SequenceGenerator(name = "seq_doc", sequenceName = "seq_doc", allocationSize = 1)
	@GeneratedValue(generator = "seq_doc", strategy = GenerationType.SEQUENCE)
	@Column(name = "doc_id")
	private Integer id;

	@Column(name = "doc_cedula")
	private String cedula;

	@Column(name = "doc_nombre")
	private String nombre;

	@Column(name = "doc_apellido")
	private String apellido;

	@Column(name = "doc_numero_consultorio")
	private String numeroConsultorio;

	@Column(name = "doc_nacimiento")
	private LocalDate fechaNacimiento;

	@Column(name = "doc_titulo")
	private String titulo;

	@Column(name = "doc_salario")
	private BigDecimal salario;

	@OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
	private List<CitaMedica> citas;

	// SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", numeroConsultorio=" + numeroConsultorio + ", fechaNacimiento=" + fechaNacimiento + ", titulo="
				+ titulo + ", salario=" + salario + ", citas=" + citas + "]";
	}

}
