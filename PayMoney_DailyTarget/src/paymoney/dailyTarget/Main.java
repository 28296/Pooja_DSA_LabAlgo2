package paymoney.dailyTarget;

public class Main {

	public static void main(String[] args) {
		// Example-01
		// { 20, 21, 31 }
		// 21

		// Example-02
		// { 20, 12, 31 }
		// 19

		// Example-03
		// { 23, 38, 45 }
		// 65

		// Example-04
		// { 25, 32, 42 }
		// 99

		// Example-05
		// { 25, 22, 40 }
		// 500
		
		// Example-06
		// { 12, 14, 33, 11, 15 }
		// 86
		DailyTargetDeterminator determinator
		= new DailyTargetDeterminator();
	
	determinator.collectTransactionValues();
	determinator.collectDailyTarget();
	determinator.determine();
	}

}
