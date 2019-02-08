package fr.pcohen.view.swing;

import javax.swing.JPanel;

public class MainWindow extends Window {
	private static final long serialVersionUID = 1170636203017224784L;
	

	public MainWindow() {
		super();
		SearchBoxPan searchBoxPan = new SearchBoxPan(this);		
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
