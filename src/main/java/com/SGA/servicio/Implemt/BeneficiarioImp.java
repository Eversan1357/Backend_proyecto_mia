package com.SGA.servicio.Implemt;

import java.util.List;
import java.util.Optional;

import com.SGA.entidades.Beneficiario;
import com.SGA.repositorio.BeneficiarioRepository;
import com.SGA.servicio.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 
@Service
public class BeneficiarioImp implements BeneficiarioService {

	@Autowired
	private BeneficiarioRepository beneficiarioRepository;


	@Override
	public List<Beneficiario> findAll() {
		return beneficiarioRepository.findAll();
	}
}
