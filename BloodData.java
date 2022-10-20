class BloodData{
	private String bloodType;
	private String rhFactor;
	
		
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;
		}
	public String getBloodType(){
			return bloodType;
		}
	public void setRhfactor(String rhFactor){
		this.rhFactor = rhFactor;
	}
	public String getRhFactor() {
		return rhFactor;
		
	}
	
	public void display() {
		System.out.println(bloodType+rhFactor+" is added to the blood bank.");
	}
}