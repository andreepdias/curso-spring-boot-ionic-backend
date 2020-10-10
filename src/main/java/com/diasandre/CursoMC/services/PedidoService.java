package com.diasandre.CursoMC.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diasandre.CursoMC.domain.Pedido;
import com.diasandre.CursoMC.repositories.PedidoRepository;
import com.diasandre.CursoMC.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Pedido.class.getName()));
	}
}
