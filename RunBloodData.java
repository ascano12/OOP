import java.util.Scanner;
public class RunBloodData {
	
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		String input1,input2;
		String data;
		BloodData bd = new BloodData();
		System.out.print("Enter blood type of patient:");
		input1 = SC.nextLine();
		bd.setBloodType(input1);
		System.out.print("Enter the Rhesus factor (+ or -):");
		input2 = SC.nextLine();
		bd.setRhfactor(input2);
		data = input1 + input2;
		if(data.isEmpty()){
			bd = new BloodData();
			bd.display();
			
			}
			else if(data.equals("A+") || data.equals("A-") || data.equals("B+") || data.equals("B-") || data.equals("AB+") || data.equals("AB-") || data.equals("O+") || data.equals("O-")){

System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the bloodbank.");
}
else{
	
	
	System.out.println("Invalid input!");
}
}
}


