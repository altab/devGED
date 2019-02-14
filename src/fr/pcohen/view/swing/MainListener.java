package fr.pcohen.view.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.pcohen.application.Config;
import fr.pcohen.application.Sys;
import fr.pcohen.business.Document;
import fr.pcohen.business.Init;
import fr.pcohen.business.Search;
import fr.pcohen.business.Tag;

public class MainListener implements ActionListener {
	
	private Window window;
	private SearchBoxPan searchBoxPan;
	
	public MainListener(SearchBoxPan searchBoxPan, Window window ) {
		super();
		this.window = window;
		this.searchBoxPan = searchBoxPan;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (searchBoxPan instanceof SearchBoxPan) {
			
			Tag tag = new Tag(searchBoxPan.getSearchField().getText());
			
			JPanel center = new JPanel();
			center.setBackground(Config.BG_COLOR);
			
			JLabel label = new JLabel("#"+tag.getTag());
			JPanel searchResultsPan = new SearchResultsPan(tag).showResults(tag);
			
			
			label.setOpaque(true);
			label.setBackground(Config.BG_COLOR);
			label.setForeground(Color.LIGHT_GRAY);
//			center.add(label);
			center.add(searchResultsPan);
			
			window.deleteAndReplace(center);
            
		}

	}

}
