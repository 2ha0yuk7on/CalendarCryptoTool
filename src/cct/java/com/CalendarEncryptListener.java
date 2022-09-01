package cct.java.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalendarEncryptListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String plain = CalendarCryptoUI.getText1().trim().toLowerCase();
		CalendarCryptoUI.setText1(plain);
		String key = CalendarCryptoUI.getKeyText();
		String cipher = CalendarCrypter.encrypt(plain, key);
		CalendarCryptoUI.setText2(cipher);
	}

}
