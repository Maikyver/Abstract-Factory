package view;
import model.Arquero;
import model.Gladiador;
import model.HandlerLuchador;
import model.UtilsL;

public class Main {

	public static void main(String[] args) {
		HandlerLuchador hl = new HandlerLuchador();

		Gladiador g = (Gladiador) hl.crearLuchador(UtilsL.GLADIADOR);
		Arquero a = (Arquero) hl.crearLuchador(UtilsL.ARQUERO);
		
		while(a.getVida()!=0){
			g.Atacar(a);
			System.out.println("El "+a.toString()+" está herido. Vida: "+a.vida);
		}
		System.out.println("El "+a.toString()+" ha muerto!");
		
	}
	public String toString(){
		return"gladeador";
	}
}
