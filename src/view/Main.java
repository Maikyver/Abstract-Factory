package view;

import model.Gladiador;
import model.HandlerLuchador;
import model.Utils;

public class Main {

	HandlerLuchador hl = new HandlerLuchador();

	Gladiador g = (Gladiador) hl.crearLuchador(Utils.GLADIADOR);

}
