package model;

public class Gladiador extends Luchador {
	

	public Gladiador(FabricaEquipamentoLuchador fl) {
		this.fabrica=fl;
		setear();
		System.out.println("Creo un Gladiador");
	}

	protected void setear() {
	this.arma=fabrica.CrearArma();
	this.armadura=fabrica.CrearArmadura();// TODO Auto-generated constructor stub
	
	}
}
