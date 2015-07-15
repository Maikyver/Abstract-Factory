package model;

public class EstrategiaCerca extends EstrategiaAtaque {

	@Override
	public Arma setArma(Luchador atacante){
		return ((Arma) atacante.armas.get("ArmaCerca"));
		}

	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}