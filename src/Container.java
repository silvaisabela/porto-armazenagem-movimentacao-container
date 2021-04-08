
public class Container {

	private int id;
	private int contMove;
	
	public Container(int id) {
		this.id = id;
	}
	public Container(int id, int contMove) {
		this.id = id;
		this.contMove = contMove;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getContMove() {
		return contMove;
	}
	
	public void setContMove(int contMove) {
		this.contMove = contMove;
	}
	public void setContMove() {
		this.contMove ++;
	}

}
