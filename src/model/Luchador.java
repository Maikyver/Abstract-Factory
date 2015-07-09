package model;

import java.util.HashMap;
import java.util.Random;

public abstract class Luchador {
	public int vida;
	HashMap armas;
	Arma arma;
	

	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	EstrategiaAtaque estrategia;
	Armadura armadura;
	FabricaEquipamentoLuchador fabrica;
	
	abstract void setear();
	//public abstract void setArma(Luchador l);
	public EstrategiaAtaque Atacar(Luchador a){
		CambiarEstrategia(Visualizar());
		estrategia.recarga();
		estrategia.atacar(a,this);
		return estrategia;
	}
	
	public UtilsA Visualizar(){
		
		return UtilsA.values()[new Random().nextInt(UtilsA.values().length)];
	}
	
	public void CambiarEstrategia( UtilsA obj){
		switch(obj){
		case CERCANO:
			estrategia = new EstrategiaCerca();
			estrategia.setArma(this);
			break;
		case DISTANTE:
			estrategia = new EstrategiaDistante();
			estrategia.setArma(this);
			break;
		default:
			break;
		}
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	
	}
