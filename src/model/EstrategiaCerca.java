package model;

public class EstrategiaCerca implements EstrategiaAtaque {

	@Override
	public void atacar(Luchador victima,Luchador atacante) {
		Arma arma=setArma(atacante);
		if(victima.getVida()==0){
			
		}else if(victima.getVida()>arma.getDa�o()){
			victima.setVida(victima.getVida()-arma.getDa�o());
		}else{
			victima.setVida(0);
		}
	}
	public Arma setArma(Luchador atacante){
		return ((Arma) atacante.armas.get("ArmaCerca"));
		}
	@Override
	public void recarga() {
		// TODO Auto-generated method stub
		
	}

}