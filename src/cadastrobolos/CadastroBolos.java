package cadastrobolos;

public class CadastroBolos {

	public static void main(String[] args) {
		
		Bolo bolo1 = new Bolo();
		bolo1.setNome("Floresta Negra");
		bolo1.setTamanho("20 cm");
		bolo1.setPeso(2000);
		bolo1.setPreco(51.5);

		Bolo bolo2 = new Bolo();
		bolo2.setNome("Abacaxi");
		bolo2.setTamanho("20 cm");
		bolo2.setPeso(3000);
		bolo2.setPreco(45.2);	
		
		PedidosBolos cadBolos = new PedidosBolos();
		cadBolos.adicionarBolo(bolo1);
		cadBolos.adicionarBolo(bolo2);
		
		
		Bolo boloBusca = cadBolos.buscarBolo(bolo1);
		if (boloBusca != null) {
			System.out.println("Bolo:" + boloBusca.getNome());
		} else {
			System.out.println("Bolo não encontrado");
		}
		
		if (cadBolos.removerBolo(bolo1)) {
			System.out.println("Bolo removido com sucesso");
		} else {
			System.out.println("Problema ao remover bolo!");
		}
			
		
		System.out.println(cadBolos.gerarRelatorio());
		
	
		Bolo boloBuscaUpdate = cadBolos.buscarBolo(bolo1);
		boloBuscaUpdate.setNome("Abacaxi super");
		
		cadBolos.atualizarBolo(boloBuscaUpdate);
		
	}

}
