package desing.pattern.creational.prototype.v1;

import java.util.Base64;

public class Cocacola implements Prototype {
	
	private  String sabor;
	private  String color;
	private final String recetaSecreta;
	
	
	
	public Cocacola() {
		super();
		this.recetaSecreta = "";
	}

	public Cocacola(String sabor, String color, String recetaSecreta) {
		super();
		this.sabor = sabor;
		this.color = color;
		this.recetaSecreta = recetaSecreta;
	}

	public String getSabor() {
		return sabor;
	}

	public String getColor() {
		return color;
	}
	

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String prepararGaseosa() {
		return "Gaseosa: Color =>"+color + " Sabor => " + sabor + " Receta utilizada => " + Base64.getEncoder().encodeToString(recetaSecreta.getBytes());
	}

	@Override
	public Prototype getClone() {
		return this;
	}

}
