public class Porto {

	private TipoPilhaContainer pilha1;
	private TipoPilhaContainer pilha2;
	
	public Porto( ) {
		pilha1 = new TipoPilhaContainer();
		pilha2 = new TipoPilhaContainer();
	}
	
	public void inserirContainer(Container container) throws Exception {
		if (pilha1.size() <= pilha2.size()) {
			pilha1.push(container);
			System.out.println("Inserido na pilha 1");
		} else {
			pilha2.push(container);
			System.out.println("Inserido na pilha 2");
		}
	}

	public void retirarContainer(int id) {
		
		int posicao_aux = pesquisarIdConteiner(pilha1, id);
		
		if(posicao_aux == -1) {
			posicao_aux = pesquisarIdConteiner(pilha2, id);
			if(posicao_aux == -1) {
				System.out.println("ID não encontrado");
			}else {
				System.out.println("Encontrado na pilha 2");
			}
		}else {
			System.out.println("Encontrado na pilha 1");
		}
		
	}

	private int pesquisarIdConteiner(TipoPilhaContainer pilha, int id) {
		// TODO Auto-generated method stub
		int posicao_aux = -1;
		
		Container dados[] = pilha.retornaDados();
		
		for(int i=0; i < (pilha.size())-1; i++) {
			if(dados[i].getId() == id) {
				posicao_aux = i;
			}
		}
		
		return posicao_aux;
	}
	
}









