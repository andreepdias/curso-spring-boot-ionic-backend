package com.diasandre.CursoMC.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.diasandre.CursoMC.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar ca1 = Calendar.getInstance();
		ca1.setTime(instanteDoPedido);
		ca1.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(ca1.getTime());
	}
}
