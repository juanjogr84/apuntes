package modelo.javabeans;

public class Producto {
	private int idProducto;
	private String descripcion;
	private double  PrecioUnitario;
	private Familia familia;
	


	public Producto(int idProducto, String descripcion, double precioUnitario, Familia familia) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		PrecioUnitario = precioUnitario;
		this.familia = familia;
	}

	public Producto() {
		super();
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return PrecioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", PrecioUnitario="
				+ PrecioUnitario + ", familia=" + familia + "]";
	}

}
