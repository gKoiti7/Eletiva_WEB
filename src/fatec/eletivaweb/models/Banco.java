package fatec.eletivaweb.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Curso> lista = new ArrayList<>();
	
	public void adiciona(Curso curso) {
		Banco.lista.add(curso);
	}
	
	public List<Curso> getCurso() {
		return Banco.lista;
	}
}
