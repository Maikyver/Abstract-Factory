package model;

public class Arquero extends Luchador {


	public Arquero(FabricaEquipamentoLuchador fl) {
		this.fabrica=fl;
		setear();
		System.out.println("Creo un Arquero");
	}

	protected void setear() {
	this.armas=fabrica.CrearArma();
	this.armadura=fabrica.CrearArmadura();
	this.vida=10;
	// TODO Auto-generated constructor stub
	System.out.println("Arquero seteado");
	}


}
