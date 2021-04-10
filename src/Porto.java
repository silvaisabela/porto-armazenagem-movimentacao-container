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
		} else {
			pilha2.push(container);

		}

	}

	public void retirarContainer(int id) throws Exception {
	
		int posicao_aux = pesquisarIdConteiner(pilha1, id);
		
		if(posicao_aux == -1) {
			
			posicao_aux = pesquisarIdConteiner(pilha2, id);
			
			if(posicao_aux == -1) {
				
				System.out.println("ID não encontrado");
				
			}else {
				System.out.println("--------------------    CONTAINER ENCONTRADO NA PILHA 2   --------------------");
				movimentarContainers(pilha2, posicao_aux);
			}
		}else {
			System.out.println("--------------------    CONTAINER ENCONTRADO NA PILHA 1   --------------------");
			movimentarContainers(pilha1, posicao_aux);

		}
		
	}

	private int pesquisarIdConteiner(TipoPilhaContainer pilha, int id) {
		// TODO Auto-generated method stub
		int posicao_aux = -1;
		
		Container dados[] = pilha.retornaDados();
		
		for(int i=0; i < pilha.size(); i++) {
			if(dados[i].getId() == id) {
				posicao_aux = i;
			}
		}
		
		return posicao_aux;
	}
	
	private void movimentarContainers(TipoPilhaContainer pilha, int posicao_aux) throws Exception {
		
		System.out.println("Posição: "+posicao_aux);
		System.out.println("------------------    MOVIMENTANDO CONTAINERS   -------------------");
		TipoPilhaContainer pilha_aux = new TipoPilhaContainer();
		
		Container container_aux;
		
		for(int i = (pilha.size()-1); i > posicao_aux; i--){
			 container_aux = pilha.top();
			 container_aux.setContMove();
			 
			 System.out.println("--> Movimentando container "+container_aux.getId());
			 System.out.println("Container "+container_aux.getId()+" possui "+container_aux.getContMove()+" movimento(s)");
			 
			 pilha_aux.push(container_aux);
			 
			 pilha.pop();
		}
		 System.out.println();
		 System.out.println("Container "+ pilha.top().getId()+" saindo para seu destino final.");
		 pilha.pop();
		 System.out.println("------------------------------------------------------------------");
		 System.out.println();
		 System.out.println("----------------- VOLTANDO CONTAINERS A PILHA   ----------------");
		 for(int i = (pilha_aux.size()-1); i >= 0; i--) {
			 container_aux = pilha_aux.top();
			 container_aux.setContMove();
			 System.out.println("Container "+container_aux.getId()+" possui "+container_aux.getContMove()+" movimento(s).");
			 pilha.push(container_aux);
			 pilha_aux.pop();
		 }
		 System.out.println("------------------------------------------------------------------");
		 System.out.println();
	}
	
	public void apresentarPlanilha() {
		Container dados1[] = pilha1.retornaDados();
		System.out.println("***** Planilha de containers (Pilha 1) *****");
		for(int i=0; i < pilha1.size(); i++) {
			System.out.println(dados1[i].getId());
		}
		System.out.println();
		System.out.println();
		
		System.out.println("***** Planilha de containers (Pilha 2) *****");
		Container dados2[] = pilha2.retornaDados();
		for(int i=0; i < pilha2.size(); i++) {
			System.out.println(dados2[i].getId());
		}
		System.out.println();
		System.out.println();
	}
}









