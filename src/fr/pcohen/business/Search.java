package fr.pcohen.business;

import java.util.ArrayList;

import fr.pcohen.application.Sys;

public class Search {
	
	ArrayList<Document> documents;

	public Search(ArrayList<Document> documents) {
		setDocuments(documents);
	}
	
	public ArrayList<Document> byTag(Tag tag) {
		
		ArrayList<Document> ListDocuments = new ArrayList<>();
		
		//Lookup into each document of the array
		for (Document document :  documents) {
			Sys.out("On est dans la boucle des documents");
			ArrayList<Tag> tags = document.getListTags();
			
			//compare our tag whit each tag of the document
			for(Tag compareTag : tags) {
				if (tag.getTag().equals(compareTag.getTag())) ListDocuments.add(document);
			}
			
			
		}
		
		return ListDocuments;
		
		
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

}
