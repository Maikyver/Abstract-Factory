package model;

import java.util.HashMap;
import java.util.Random;

public abstract class Luchador {
	public int vida;

	HashMap armas;
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
	
	public UtilsE Visualizar(){
		
		return UtilsE.values()[new Random().nextInt(UtilsE.values().length)];
	}
	
	public void CambiarEstrategia( UtilsE obj){
		switch(obj){
		case CERCANO:
			estrategia = new EstrategiaCerca();
			break;
		case DISTANTE:
			estrategia = new EstrategiaDistante();
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
