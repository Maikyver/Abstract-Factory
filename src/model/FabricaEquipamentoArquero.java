package model;

public class FabricaEquipamentoArquero implements FabricaEquipamentoLuchador {

	@Override
	public Arma CrearArma() {
		// TODO Auto-generated method stub
		return new Arco();
	}

	@Override
	public Armadura CrearArmadura() {
		// TODO Auto-generated method stub
		return new Ligera();
	}

}
