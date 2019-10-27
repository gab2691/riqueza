package com.riquezinha.testes;

import com.riquezinha.model.Comissionado;
import com.riquezinha.model.Diarista;
import com.riquezinha.model.Mensalista;

public class teste {
	
	public static void main(String[] args) {
		Diarista diarista = new Diarista("Maria silva", "827398472987342");
		Mensalista mensalista = new Mensalista("João Silva", "897234872342");
		Comissionado comissionado = new Comissionado("Ricardo Silva", "723674263462");
		
		diarista.setDias(22);
		diarista.setValorDia(100);
		diarista.calculaSalario();
		
		
		mensalista.setSalario(2000);
		mensalista.setDiasFaltosos(3);
		mensalista.calculaSalario();
		
		
		
		
		comissionado.setValorComissao(200);
		comissionado.calculaSalario(mensalista.getSalario(), comissionado.getValorComissao());
		
		diarista.imprimirDados();
		mensalista.imprimirDados();
		comissionado.imprimirDados();
	}
}
