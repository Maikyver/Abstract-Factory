package model;

import java.util.HashMap;

public class FabricaEquipamentoArquero implements FabricaEquipamentoLuchador {

	@Override
	public HashMap CrearArma() {
		HashMap Mapa;
		Mapa = new HashMap();
		Mapa.put("Arco", new Arco());
		return Mapa;
	}

	@Override
	public Armadura CrearArmadura() {
		return new Ligera();
	}

}
