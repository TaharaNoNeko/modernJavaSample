package monthSample;

import java.time.LocalDateTime;
import java.time.Month;

public class monthSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Month month = LocalDateTime.now().getMonth();

		switch (month) {
		case MARCH:
		case APRIL:
		case MAY:
			System.out.println(month + " is Spring");
			break;
		case JUNE:
		case JULY:
		case AUGUST:
			System.out.println(month + " is Summer");
			break;
		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER:
			System.out.println(month + " is Autumn");
			break;
		default:
			System.out.println(month + " is Winter");
			break;
		}
	}

}
