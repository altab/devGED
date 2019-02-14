package fr.pcohen.view.swing;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.pcohen.application.Sys;
import fr.pcohen.business.Document;
import fr.pcohen.business.Init;
import fr.pcohen.business.Search;
import fr.pcohen.business.Tag;

public class SearchResultsPan extends JPanel{
	private static final long serialVersionUID = -7085362517126330882L;
	
	private Tag tag;
	

	public SearchResultsPan(Tag tag) {
		setTag(tag);
		
		this.setLayout(new GridLayout());
		this.showResults(tag);
	}
	
	public JPanel showResults(Tag tag) {
		
		JPanel panel = new JPanel(new GridLayout());
		
		ArrayList<Document >documentsOK = new Search(new Init().documents()).byTag(new Tag(tag.getTag()));
		
		if (!documentsOK.isEmpty()) {
			for (Document document : documentsOK) {
				
				JPanel docPan = new JPanel();
				docPan.setLayout(new GridLayout(3,1));
				docPan.setSize(getMaximumSize());
				
				docPan.add(new JLabel(document.getTitle()));
				docPan.add(new JLabel(document.getDescription()));
				docPan.add(new JLabel(document.getContentURI()));
				
				panel.add(docPan);
			}
		} else {
			panel.add(new JLabel("No results found for #" + tag.getTag()));
		}
		
		return panel;
		
	}
	
	/*
	 
	 
	 
	 */

	public Tag getTag() {
		return tag;
	}

	private void setTag(Tag tag) {
		this.tag = tag;
	}

		
	

}
