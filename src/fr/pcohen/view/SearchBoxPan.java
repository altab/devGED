package fr.pcohen.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SearchBoxPan extends JPanel {

	JLabel label = new JLabel("Search # ");
	JTextField searchField = new JTextField(20);
	JButton buttonSearch = new JButton("Search");
	
	public SearchBoxPan() {
		
		this.setLayout(new BorderLayout());
		
		this.setBackground(new Color(51,51,51));
		
		label.setForeground(Color.GRAY);
		
		this.add(label, BorderLayout.WEST);
		this.add(searchField, BorderLayout.CENTER);
		this.add(buttonSearch, BorderLayout.EAST);


	}

}
