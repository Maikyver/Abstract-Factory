package model;


import java.util.HashMap;

public class FabricaEquipamentoGladiador implements FabricaEquipamentoLuchador{

	@Override
	public HashMap CrearArma() {
		HashMap Mapa;
		Mapa = new HashMap();
		Mapa.put("ArmaCerca", new Espada());
		Mapa.put("ArmaDistante", new Lanza());
		System.out.println("Creo una Espada y una Lanza");
		return Mapa;
	}

	@Override
	public Armadura CrearArmadura() {
		System.out.println("Creo una Armadura Pesada");
		return new Pesada();
	}

}
