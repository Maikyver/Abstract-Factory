package model;


public class EstrategiaDistante implements EstrategiaAtaque {

	@Override
	public void atacar(Luchador victima,Luchador atacante) {
		if(atacante.vida==0){
			
		}else if(victima.vida>1){
			victima.setVida(victima.vida-atacante.arma.getDaño());
		}else{
			victima.setVida(0);
		}
		//return victima.vida;
	}
public void setArma(Luchador atacante){
	atacante.setArma((Arma) atacante.armas.get("ArmaDistante"));
	//atacante.setArma(armas.));
	}
	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}
