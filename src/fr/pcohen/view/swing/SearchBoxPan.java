package fr.pcohen.view.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SearchBoxPan extends JPanel {

	private JLabel label = new JLabel("Search # ");
	private JTextField searchField = new JTextField(20);
	private JButton buttonSearch = new JButton("Search");
	
	public SearchBoxPan(Window window) {
		
		this.setLayout(new BorderLayout());
		
		this.setBackground(new Color(51,51,51));
		
		label.setForeground(Color.GRAY);
		
		buttonSearch.addActionListener(new MainListener(this, window));
		
		this.add(label, BorderLayout.WEST);
		this.add(searchField, BorderLayout.CENTER);
		this.add(buttonSearch, BorderLayout.EAST);
		
	}
	
	
	public JButton getButtonSearch() {
		return buttonSearch;
	}

	public JTextField getSearchField() {
		return searchField;
	}


	private void setSearchField(JTextField searchField) {
		this.searchField = searchField;
	}


	private void setButtonSearch(JButton buttonSearch) {
		this.buttonSearch = buttonSearch;
	}


}
