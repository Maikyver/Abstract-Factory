package model;

public class FabricaEquipamentoGladiador implements FabricaEquipamentoLuchador{

	@Override
	public Arma CrearArma() {
		
		return new Espada();
	}

	@Override
	public Armadura CrearArmadura() {
		// TODO Auto-generated method stub
		return new Pesada();
	}

}
