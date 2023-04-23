package WileyProject;

public class EnumExample {
	enum WeekDay{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDay day = WeekDay.SUNDAY;
		//System.out.println(day);
		for(WeekDay wd:WeekDay.values()) {
			System.out.println(wd);
		}
		 
	}

}
