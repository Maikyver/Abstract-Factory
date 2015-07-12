package model;

import java.util.HashMap;


public class EstrategiaDistante implements EstrategiaAtaque {

	@Override
	public void atacar(Luchador victima,Luchador atacante) {
		Arma arma=setArma(atacante);
		if(atacante.getVida()==0){
			
		}else if(victima.getVida()>arma.getDaño()){
			victima.setVida(victima.getVida()-arma.getDaño());
		}else{
			victima.setVida(0);
		}
	}
public Arma setArma(Luchador atacante){
	return ((Arma) atacante.armas.get("ArmaDistante"));
	}
	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}
