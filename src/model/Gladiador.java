package model;

public class Gladiador extends Luchador {

	public Gladiador(FabricaEquipamentoLuchador fl) {
		this.arma=fl.CrearArma();
		this.armadura=fl.CrearArmadura();
	}

	/*public void setear() {
	this.arma=fl.CrearArma();
	this.armadura=fl.CrearArmadura();// TODO Auto-generated constructor stub
	}*/

}
