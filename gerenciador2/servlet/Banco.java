package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista=new ArrayList<Empresa>();
	
	static {
		Empresa empresa=new Empresa();
		Empresa empresa2=new Empresa();
		empresa.setNome("1");
		empresa2.setNome("2");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
