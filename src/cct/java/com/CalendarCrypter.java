package cct.java.com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarCrypter {
	
	public static String decrypt(String cipher,String key) {
		
		Calendar calendar = Calendar.getInstance();
		setCalendarDate(calendar, key);
		calendar.add(Calendar.DATE, -1);
		
		List<CalendarCryptoEntity> list = generateMonthEntityList(calendar);
		
		String[] ciphertext = cipher.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(String text:ciphertext) {
			String weekName = "";
			String weekOff = "";
			if(text.length() == 2) {
				weekName = text.substring(0,1);
				weekOff = text.substring(1);
			}else if(text.length()==3) {
				weekName = text.substring(0,2);
				weekOff = text.substring(2);
			}
			for(CalendarCryptoEntity e:list) {
				int day = e.compare(weekName, weekOff);
				if(day>0) {
					sb.append(CalendarCryptoUtils.wordMap.get(day));
					break;
				}
			}
		}
		
		return sb.toString();
		
	}
	
	
public static String encrypt(String plain,String key) {
		
		Calendar calendar = Calendar.getInstance();
		setCalendarDate(calendar, key);
		calendar.add(Calendar.DATE, -1);
		
		List<CalendarCryptoEntity> list = generateMonthEntityList(calendar);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<plain.length();i++) {
			char a = plain.charAt(i);
			int dayFromMap = CalendarCryptoUtils.wordReMap.get(a);
			for(CalendarCryptoEntity e:list) {
				int day = e.getDay();
				if(day == dayFromMap) {
					sb.append(e.getWeekName()+e.getWeekOff()+" ");
					break;
				}
			}
		}
		
		return sb.toString().trim();
		
	}
	
	
	private static void setCalendarDate(Calendar calendar, String key) {
		int year = Integer.parseInt(key.substring(0,4));
		int month = Integer.parseInt(key.substring(4))-1;
		calendar.set(year, month, 1);
	}

	private static List<CalendarCryptoEntity> generateMonthEntityList(Calendar calendar) {
		List<CalendarCryptoEntity> list = new ArrayList<CalendarCryptoEntity>();
		for(int i=0;i<26;i++) {
			calendar.add(Calendar.DATE, 1);
			CalendarCryptoEntity entity = new CalendarCryptoEntity(calendar);
			list.add(entity);
		}
		return list;
	}


}
