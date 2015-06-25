package model;

public class HandlerLuchador {
public Luchador crearLuchador(UtilsL tipo){
	Luchador l = null;
	FabricaEquipamentoLuchador fl=null;
	switch(tipo)
	{
	case GLADIADOR:
		fl=new FabricaEquipamentoGladiador();
		l= new Gladiador(fl);
		break;
	case ARQUERO:
		fl=new FabricaEquipamentoArquero();
		l= new Arquero(fl);
		
	}
	return l;
}
}
