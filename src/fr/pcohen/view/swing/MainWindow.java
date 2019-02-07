package fr.pcohen.view.swing;

import javax.swing.JPanel;

public class MainWindow extends Window {

	public MainWindow() {
		super();
		
		SearchBoxPan searchBoxPan = new SearchBoxPan();
		searchBoxPan.getButtonSearch().addActionListener(new MainListener("searchBox", this));
		
		
		
	}
	
	@Override
	/**
	 * Efface le panel central pour le remplacer par un nouveau que l'on passe � la methode en parametre
	 * @param nouveauPanel (JPanel)
	 */
	public void deleteAndReplace(JPanel newPanel) {
				
		this.getMainPan().removeAll();
		this.getMainPan().add(newPanel);
		this.getFullPan().repaint();
		this.getFullPan().revalidate();
	}

}
