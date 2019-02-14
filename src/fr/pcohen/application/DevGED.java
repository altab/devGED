package fr.pcohen.application;

import java.util.ArrayList;

import fr.pcohen.business.Document;
import fr.pcohen.business.Init;
import fr.pcohen.business.Search;
import fr.pcohen.business.Tag;
import fr.pcohen.view.swing.MainWindow;

public class DevGED {

	public static void main(String[] args) {

		/*
		 * BLOC DE TEST
		 */
		
		// Création d'une recherche
		//Init init = new Init();
//		ArrayList<Document >documents = new Init().documents();
		
//		ArrayList<Document >documentsOK = new Search(new Init().documents()).byTag(new Tag("tag2"));
//		
//		for (Document document : documentsOK) {
//			Sys.out(document.getTitle()+ " OK");
//		}
		
		
		MainWindow MainWindow = new MainWindow();

	}

}
