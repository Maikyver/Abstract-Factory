package model;

import java.util.HashMap;

public class FabricaEquipamentoArquero implements FabricaEquipamentoLuchador {

	@Override
	public HashMap CrearArma() {
		HashMap Mapa;
		Mapa = new HashMap();
		Mapa.put("Arco", new Arco());
		System.out.println(" Creo un Arco");
		return Mapa;
	}

	@Override
	public Armadura CrearArmadura() {
		System.out.println(" Creo una Armadura Ligera");
		return new Ligera();
	}

}
