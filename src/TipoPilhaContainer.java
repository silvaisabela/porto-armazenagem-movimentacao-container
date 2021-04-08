
public class TipoPilhaContainer {

	private static final int CAPACIDADE_MAXIMA = 100;
	private Container dados[];
	private int topo;

	public TipoPilhaContainer() {
		this.dados = new Container[CAPACIDADE_MAXIMA];
		this.topo = 0;
	}

	public void push(Container container) throws Exception {
		if (this.isFull()) {
			throw new Exception("Pilha cheia");
		}
		this.dados[this.topo] = container;
		this.topo += 1;
	}

	public Container top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		return this.dados[this.topo - 1];
	}
	
	public boolean pop() {
		if (this.isEmpty()) {
			return false;
		}
		this.dados[this.topo - 1] = null;
		this.topo -= 1;

		return true;
	}

	public boolean isEmpty() {
		return this.topo == 0;
	}

	public boolean isFull() {
		return this.topo == CAPACIDADE_MAXIMA;
	}
	
	public int size() {
		return this.topo;
	}
	
	public Container[] retornaDados() {
		return this.dados;
	}
}
