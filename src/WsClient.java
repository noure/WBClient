import java.awt.List;
import java.util.Iterator;

import banque.ws.*;

public class WsClient {

	public static void main(String[] args) {
		WebSBourse service = new Bourse().getWebSBoursePort();
		// service.ajoutCotation("nour", 552);
		service.getCotation(760);
		System.out
				.print("----------------- AFFICHAGE D'UNE COTATION-------------------");
		System.out.println();
		Cotation c = service.getCotation(1);

		System.out.println(c.getCodeSociete() + "---" + c.getDateCotation()
				+ "--" + c.getValAction());
		System.out.println();

		System.out
				.print("----------------- AFFICHAGE DE TOUTE LES COTATIONS-------------------");
		System.out.println();
		Iterator it = service.getAll().iterator();
		while (it.hasNext()) {

			Cotation v = (Cotation) it.next();
			System.out.println(v.getCodeSociete() + "---" + v.getDateCotation()
					+ "--" + v.getValAction());
		}
	}

}