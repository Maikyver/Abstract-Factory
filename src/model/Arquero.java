package model;

public class Arquero extends Luchador {


	public Arquero(FabricaEquipamentoLuchador fl) {
		this.fabrica=fl;
		setear();
	}

	protected void setear() {
	this.armas=fabrica.CrearArma();
	this.armadura=fabrica.CrearArmadura();
	this.vida=10;
	// TODO Auto-generated constructor stub
	}
	public String toString(){
		return"Arquero";
	}

}
