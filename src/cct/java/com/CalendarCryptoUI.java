package cct.java.com;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalendarCryptoUI {
	
	private static JFrame frame;
	private static JTextArea text1;
	private static JTextArea text2;
	private static JTextField keyText;
	
	public static void initCalendarCryptoLayout() {
		
		frame = new JFrame("日历密码加解密       by 2ha0yuk7on.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagLayout mainBag = new GridBagLayout();
        GridBagConstraints c = null;
        JPanel panel = new JPanel(mainBag);
        JLabel label = new JLabel("密钥：");
        keyText = new JTextField();
        keyText.setColumns(6);
        JButton button1 = new JButton("加密");
        JButton button2 = new JButton("解密");
        GridBagLayout buttonBag = new GridBagLayout();
        GridBagConstraints ic = null;
        JPanel buttonPanel = new JPanel(buttonBag);
        ic = new GridBagConstraints();
        ic.insets = new Insets(0, 10, 0, 10);
        buttonBag.addLayoutComponent(button1, ic);
        buttonBag.addLayoutComponent(button2, ic);
        button1.addActionListener(new CalendarEncryptListener());
        button2.addActionListener(new CalendarDecryptListener());
        buttonPanel.add(label);
        buttonPanel.add(keyText);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
     
        text1 = new JTextArea("明文");
        text2 = new JTextArea("密文");

        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(2, 10, 2, 10);
        c.gridwidth = GridBagConstraints.REMAINDER;
        mainBag.addLayoutComponent(buttonPanel, c);
        
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(2, 10, 2, 10);
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        mainBag.addLayoutComponent(text1, c);
        mainBag.addLayoutComponent(text2, c);
        
        panel.add(text1);
        panel.add(buttonPanel);
        panel.add(text2);
        
        frame.setContentPane(panel);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
	}
	
	public static String getText1() {
		return text1.getText();
	}

	public static void setText1(String text) {
		text1.setText(text);;
	}
	
	public static String getText2() {
		return text2.getText();
	}

	public static void setText2(String text) {
		text2.setText(text);;
	}
	
	public static String getKeyText() {
		return keyText.getText();
	}

	public static void setKeyText(String key) {
		keyText.setText(key);;
	}

}
