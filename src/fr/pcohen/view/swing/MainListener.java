package fr.pcohen.view.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
			center.setBackground(new Color(51,51,51));
			JLabel label = new JLabel("#"+tag.getTag());
			
			label.setOpaque(true);
			label.setBackground(new Color(51,51,51));
			label.setForeground(Color.LIGHT_GRAY);
			center.add(label);
			
			window.deleteAndReplace(center);
            
		}

	}

}
