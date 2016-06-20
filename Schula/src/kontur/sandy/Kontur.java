package kontur.sandy;

import java.util.Hashtable;

import javax.swing.*;

public class Kontur {

	public Kontur() {
		// TODO Auto-generated constructor stub
	}
	private String logonticket = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Frame
		JFrame konturApplication = new JFrame("Kontur");
		konturApplication.setSize(820, 640);
		konturApplication.setLocationRelativeTo(null);
		konturApplication.setVisible(true);

		//oeffne Beta Disclaimer, schliesse Anwendung, sofern nicht einverstanden.
		if (JOptionPane.showOptionDialog(konturApplication,
				"<html>Please note: This product has not yet been disclosed for safe use and may not be functional. <br/>Use for developmental purposes, only.<br/><br/></html>",
				"Beta Stage Notice", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE, null, null, 2) == 2) {
			System.exit(0);
		};
		
		initialisiere(logonticket);
		logon(username);
		
	}
	//Logon liefert ein Logonticket als Zeichenkette zurück
	public String Logon(String uname, String pwd) {
		//prüfe Authorisierungsinfo gegen Logontabelle
		//?1 generiere und hinterlege Logonticket in Profiltabelle -> Profil ueber Username, Profil während Lauf nur über Ticket abgeprüft.
		
		//?0 generiere 
	}
	public static void initialisiere(String logonticket){
		//bereite die Anwendung vor mit Home Screen und Funktionen
		//suche nach existierender Logontabelle
		//lade Lagerdaten, wenn vorhanden.
		//öffne 
	}
	private Hashtable<String, String> credentials(){};
}
