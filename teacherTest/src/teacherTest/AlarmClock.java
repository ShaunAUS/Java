package teacherTest;

public class AlarmClock extends Clock {
	
	
	String alarmTime;
	
	public AlarmClock(String time) {
		super(time);
		
		
	}
	
	
	public void Alarm() {
		if(time==alarmTime) {}
		System.out.println("알림울림!");
	}
	
	public void setAlarm(String time) {
		this.alarmTime=time;
	}
	
	
}
