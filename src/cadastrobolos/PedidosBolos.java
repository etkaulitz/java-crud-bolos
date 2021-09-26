package cadastrobolos;

import java.util.ArrayList;

public class PedidosBolos {
	
	ArrayList<Bolo> listaDeBolos = new ArrayList<>();
	

	public void adicionarBolo(Bolo bolo) {
		listaDeBolos.add(bolo);
	}
	
	
	public Bolo buscarBolo(Bolo bolo) {
		for(Bolo b:listaDeBolos) {
			if  (b == bolo) {
				return b;
			}
		}
		return null;
	}
	
	
	public boolean removerBolo(Bolo bolo) {
		Bolo b = buscarBolo(bolo);
		if (b != null) {
			listaDeBolos.remove(b);
			return true;
		}
		return false;
	}
	
	
	public boolean atualizarBolo(Bolo bolo) {
		Bolo b = buscarBolo(bolo);
		if (b != null) {
		b.setNome(bolo.getNome());
		b.setPeso(bolo.getPeso());
		b.setPreco(bolo.getPreco());
		b.setTamanho(bolo.getTamanho());
		return true;
	}
	return false;
}
	
	public String gerarRelatorio() {
		
		String relatorio = "";
		
		for (Bolo b:listaDeBolos) {
			relatorio += "Nome: " + b.getNome() + "\n";
			relatorio += "Tamanho: " + b.getTamanho() + "\n";
			relatorio += "Peso: " + b.getPeso() + "\n";
			relatorio += "Preco: " + b.getPreco() + "\n";
			relatorio += "========== \n";
		}
		return relatorio;
	}

}
