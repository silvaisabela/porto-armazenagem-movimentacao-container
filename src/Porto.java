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
	
}
