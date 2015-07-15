package model;


import java.util.HashMap;

public class FabricaEquipamentoGladiador implements FabricaEquipamentoLuchador{

	@Override
	public HashMap CrearArma() {
		HashMap Mapa;
		Mapa = new HashMap();
		Mapa.put("ArmaCerca", new Espada());
		Mapa.put("ArmaDistante", new Lanza());
		return Mapa;
	}

	@Override
	public Armadura CrearArmadura() {
		return new Pesada();
	}

}
