package model;

import java.util.Random;

public abstract class Luchador {
	
	Arma arma;
	EstrategiaAtaque estrategia;
	Armadura armadura;
	FabricaEquipamentoLuchador fabrica;
	
	abstract void setear();
	
	public void Atacar(){
		CambiarEstrategia(Visualizar());
		estrategia.Recarga();
		estrategia.Atacar();
	}
	
	public UtilsA Visualizar(){
		
		return UtilsA.values()[new Random().nextInt(UtilsA.values().length)];
	}
	
	public void CambiarEstrategia( UtilsA obj){
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
	}
