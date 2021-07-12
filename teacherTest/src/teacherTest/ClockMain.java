package teacherTest;

public class ClockMain {

	public static void main(String[] args) {
		
		
		
		 Clock clock = new Clock("10:30");
		 clock.showTime();
		 
		 AlarmClock alarmClock = new AlarmClock("14:30");    //time= 14:30
		 alarmClock.showTime();								//time 14:30입니다 출력
		 
		 alarmClock.setAlarm("14:00");						//alarmtime 14:00 설정
		 alarmClock.Alarm();								//time 하고 alarmtime 비교//다름
		 
		 alarmClock.setAlarm("14:30");						//알람 14:30분 설정
		 alarmClock.Alarm ();								//비교 // 같음 // 알림울림 발생

	}

}
