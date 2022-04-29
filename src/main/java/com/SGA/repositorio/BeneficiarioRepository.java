package com.SGA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SGA.entidades.Beneficiario;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long>{
	boolean existsByUnEstudianteNumeroDocumento(long numeroDocumento);
	Beneficiario findByUnEstudianteNumeroDocumento(long numeroDocumento);
}
