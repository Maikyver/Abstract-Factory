package model;

public abstract class EstrategiaAtaque {
	public abstract Arma setArma(Luchador atacante);
	public final void atacar(Luchador victima, Luchador atacante){
		Arma arma=setArma(atacante);
		if(victima.getVida()==0){
			
		}else if(victima.getVida()>arma.getDaño()){
			victima.setVida(victima.getVida()-arma.getDaño());
		}else{
			victima.setVida(0);
		}
	};
 public abstract void recarga();

	

}
