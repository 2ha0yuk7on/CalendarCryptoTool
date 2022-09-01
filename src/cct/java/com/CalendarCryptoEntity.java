package cct.java.com;

import java.util.Calendar;

public class CalendarCryptoEntity {
	
	String weekName;
	String weekOff;
	int day;
	
	public String getWeekName() {
		return weekName;
	}
	public void setWeekName(String weekName) {
		this.weekName = weekName;
	}
	public String getWeekOff() {
		return weekOff;
	}
	public void setWeekOff(String weekOff) {
		this.weekOff = weekOff;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public CalendarCryptoEntity(String text) {
		if(text.length()==2) {
			weekName = text.substring(0,1);
			weekOff = text.substring(1);
		}else if(text.length()==3) {
			weekName = text.substring(0,2);
			weekOff = text.substring(2);
		}
	}
	
	public CalendarCryptoEntity(String weekName, String weekOff) {
		this.weekName = weekName;
		this.weekOff = weekOff;
	}
	
	public CalendarCryptoEntity(Calendar calendar) {
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		this.weekName = CalendarCryptoUtils.weekNameMap.get(dayOfWeek);
		this.weekOff = String.valueOf((int) ((dayOfMonth-1)/7)+1);
		this.day = calendar.get(Calendar.DATE);
	}
	
	@Override
	public String toString() {
		return "CalendarCryptoEntity [weekName=" + weekName + ", weekOff=" + weekOff + ", day=" + day + "]";
	}
	
	public int compare(String weekName, String weekOff) {
		if(this.weekName.equals(weekName) && this.weekOff.equals(weekOff)) {
			return this.day;
		}else {
			return 0;
		}
	}
	
}
