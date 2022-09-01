package cct.java.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalendarDecryptListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String cipher = CalendarCryptoUI.getText2();
		String key = CalendarCryptoUI.getKeyText();
		String plain = CalendarCrypter.decrypt(cipher, key);
		CalendarCryptoUI.setText1(plain);
	}

}
