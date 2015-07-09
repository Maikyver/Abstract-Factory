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
		
		while(a.vida!=0){
			System.out.println(g.Atacar(a));
			System.out.println("El "+g+" está herido. Vida: "+a.vida);
		}
		
		/*System.out.println(g.Atacar(a));
		System.out.println("El "+a.getClass()+" está herido. Vida: "+a.vida);
		System.out.println(g.Atacar(a));;System.out.println("El "+a.getClass()+" está herido. Vida: "+a.vida);
		System.out.println(g.Atacar(a));;System.out.println("El "+a.getClass()+" está herido. Vida: "+a.vida);
		System.out.println(g.Atacar(a));;System.out.println("El "+g.getClass()+" está herido. Vida: "+g.vida);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);
		g.Atacar(a);*/
		
	}
	public String toString(){
		return"gladeador";
	}
}
