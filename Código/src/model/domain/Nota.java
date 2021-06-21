package model.domain;

public class Nota {
	private Integer id;
	private Double nota_1s;
	private Double nota_2s;
	private Double nota_3s;
	private Double nota_4s;
	
	public Nota(){
	}

	public Nota(Integer id, Double nota_1s, Double nota_2s, Double nota_3s, Double nota_4s) {
		this.id = id;
		this.nota_1s = nota_1s;
		this.nota_2s = nota_2s;
		this.nota_3s = nota_3s;
		this.nota_4s = nota_4s;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNota_1s() {
		return nota_1s;
	}

	public void setNota_1s(Double nota_1s) {
		this.nota_1s = nota_1s;
	}

	public Double getNota_2s() {
		return nota_2s;
	}

	public void setNota_2s(Double nota_2s) {
		this.nota_2s = nota_2s;
	}

	public Double getNota_3s() {
		return nota_3s;
	}

	public void setNota_3s(Double nota_3s) {
		this.nota_3s = nota_3s;
	}

	public Double getNota_4s() {
		return nota_4s;
	}

	public void setNota_4s(Double nota_4s) {
		this.nota_4s = nota_4s;
	}
	
}
