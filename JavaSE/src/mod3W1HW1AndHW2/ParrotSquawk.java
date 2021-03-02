package mod3W1HW1AndHW2;

public class ParrotSquawk {
	static boolean invalidEntry;
	static boolean notSquawkingStatus;
	
	public static boolean getUp(boolean squawking, int currentHour) {
		if(squawking == true) {
			if(currentHour>0 && currentHour<24) {
				if(currentHour < 6 || currentHour >22) {
					return true;
				}
				else  {
					return false;
				}
			}
			else {
				invalidEntry = true;
				return false;
				
			}
			
		}else {
			notSquawkingStatus = true;
			return false;
		}
	}
	public static void main(String[] args) {
		
		boolean IsSquawking = true;
		int currentHour = 5;
		boolean callGetUp = ParrotSquawk.getUp(IsSquawking, currentHour);
		if(callGetUp) {
			System.out.println("GotUp!");

	    }
		else {
		
			if(invalidEntry)
				System.out.println("Enter Valid Format of Hours, Please!");
			if(notSquawkingStatus)
				System.out.println("Don't Disturb me, please!");
		}
		

}
}