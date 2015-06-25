package model;

public class FabricaEquipamentoGladiador implements FabricaEquipamentoLuchador{

	@Override
	public Arma CrearArma() {
		System.out.println("Creo una Espada");
		return new Espada();
	}

	@Override
	public Armadura CrearArmadura() {
		System.out.println("Creo una Armadura Pesada");
		return new Pesada();
	}

}
