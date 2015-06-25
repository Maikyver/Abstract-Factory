package model;

public class FabricaEquipamentoArquero implements FabricaEquipamentoLuchador {

	@Override
	public Arma CrearArma() {
		System.out.println(" Creo un Arco");
		return new Arco();
	}

	@Override
	public Armadura CrearArmadura() {
		System.out.println(" Creo una Armadura Ligera");
		return new Ligera();
	}

}
