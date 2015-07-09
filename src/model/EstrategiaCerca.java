package model;

public class EstrategiaCerca implements EstrategiaAtaque {

	@Override
	public void atacar(Luchador victima,Luchador atacante) {
		
		if(atacante.vida==0){
			
		}else if(victima.vida>2){
			victima.setVida(victima.vida-atacante.getArma().daño);
		}else{
			victima.setVida(0);
		}
		//return victima.vida;
	}
	public void setArma(Luchador atacante){
		atacante.setArma( (Arma) atacante.armas.get("ArmaDistante"));
	}
	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}