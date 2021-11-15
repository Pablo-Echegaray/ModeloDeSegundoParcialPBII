package ar.edu.unlam.pb2;

public class Producto implements Comparable<Producto> {

	private Integer id;

	public Producto(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}

}
