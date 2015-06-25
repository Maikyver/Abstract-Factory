package model;

public class Arquero extends Luchador {

	
	public Arquero(FabricaEquipamentoLuchador fl) {
		this.fabrica=fl;
		setear();
		System.out.println("Creo un Arquero");
	}

	protected void setear() {
	this.arma=fabrica.CrearArma();
	this.armadura=fabrica.CrearArmadura();// TODO Auto-generated constructor stub
	}


}
