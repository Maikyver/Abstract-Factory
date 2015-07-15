package model;

public class Gladiador extends Luchador {
	

	public Gladiador(FabricaEquipamentoLuchador fl) {
		this.fabrica=fl;
		setear();
	}

	protected void setear() {
	this.armas=fabrica.CrearArma();
	this.armadura=fabrica.CrearArmadura();
	this.vida=15;// TODO Auto-generated constructor stub//preguntar porq si esto no esta no me mata al arquero
	}
	public String toString(){
		return"Gladiador";
	}
}
