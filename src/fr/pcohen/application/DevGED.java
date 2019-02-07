package fr.pcohen.application;

import java.util.ArrayList;

import fr.pcohen.business.Document;
import fr.pcohen.business.Tag;
import fr.pcohen.view.swing.MainWindow;

public class DevGED {

	public static void main(String[] args) {

		/*
		 * BLOC DE TEST
		 */
		
		Tag tag = new Tag("mon tag");
		System.out.println(tag);
		
		
		ArrayList<Tag> tags =  new ArrayList<Tag>();
		tags.add(tag);
		tags.add(new Tag("tag2"));
		tags.add(new Tag("tag3"));
		
		Document doc = new Document("mon Tire", "Ma description", "pdf", "http://wwww.pcohen.fr",tags);
		System.out.println(doc);
		
		MainWindow window = new MainWindow();

	}

}
