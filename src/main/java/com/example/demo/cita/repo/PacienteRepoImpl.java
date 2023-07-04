package com.example.demo.cita.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.repo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		// TODO Auto-generated method stub

		TypedQuery<Paciente> query = this.entityManager
				.createQuery("select e from Paciente e where e.cedula =:datoCedula", Paciente.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCedula(cedula));
	}

}
