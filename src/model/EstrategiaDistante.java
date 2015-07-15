package model;
import java.util.HashMap;

public class EstrategiaDistante extends EstrategiaAtaque {

	@Override
public Arma setArma(Luchador atacante){
	return ((Arma) atacante.armas.get("ArmaDistante"));

	}
	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}
