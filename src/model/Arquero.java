package model;

public class Arquero extends Luchador {

	
	public Arquero(FabricaEquipamentoLuchador fl) {
		this.arma=fl.CrearArma();
		this.armadura=fl.CrearArmadura();
		// TODO Auto-generated constructor stub
	}

	/*public void setear(FabricaEquipamentoLuchador fl) {
	this.arma=fl.CrearArma();
	this.armadura=fl.CrearArmadura();// TODO Auto-generated constructor stub
	}*/

}
