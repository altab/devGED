package fr.pcohen.business;
import java.util.ArrayList;

import fr.pcohen.business.Tag;

public class Init {

	public ArrayList<Document> documents() {
		
		ArrayList<Tag> tags1 =  new ArrayList<Tag>()
		{{	add(new Tag("tag1"));
			add(new Tag("tag2"));
			add(new Tag("tag3")); }};
		
		Document doc1 = new Document("Document1", "Ma description", "pdf", "http://wwww.pcohen.fr",tags1);
		
		ArrayList<Tag> tags2 =  new ArrayList<Tag>()
		{{	add(new Tag("tag4"));
			add(new Tag("tag2"));
			add(new Tag("tag5")); }};
		
		Document doc2 = new Document("Document2", "Ma description", "pdf", "http://wwww.pcohen.fr",tags2);
		
		ArrayList<Tag> tags3 =  new ArrayList<Tag>()
		{{	add(new Tag("tag6"));
			add(new Tag("tag7"));
			add(new Tag("tag8")); }};
		
		Document doc3 = new Document("Document3", "Ma description", "pdf", "http://wwww.pcohen.fr",tags3);
		
		ArrayList<Document> documents =new ArrayList<>();
		documents.add(doc1);
		documents.add(doc2);
		documents.add(doc3);
		
		return documents;
	
	}

}
