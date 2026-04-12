class HospitalExecutor{
	public static void main(String[] h){
	String lakshmiSpecializations[] = {"Gynacologist", "dermatologist"};
	String vinaySpecializations[] = {"general medicine", "Urologist"};
	String hemaSpecializations[] = {"surgeon", "neurologist"};
	
	Hospital hospital = new Hospital();
	
	Doctor doctor = new Doctor();
	doctor.docId = 1;
	doctor.docName = "Lakshmi";
	doctor.designation = "chairman";
	doctor.experience = "5 years";
	doctor.fees = 1500;
	doctor.specializations = lakshmiSpecializations;
	
	boolean added = hospital.createDoctor(doctor);
	System.out.println(added);
	
	Doctor doctorOne = new Doctor();
	doctorOne.docId = 3;
	doctorOne.docName = "vinay";
	doctorOne.designation = "manager";
	doctorOne.experience = "5 years";
	doctorOne.fees = 1800;
	doctorOne.specializations = vinaySpecializations;
	
	boolean addedOne = hospital.createDoctor(doctorOne);
	System.out.println(addedOne);
	
	Doctor doctorTwo = new Doctor();
	doctorTwo.docId = 3;
	doctorTwo.docName = "hema";
	doctorTwo.designation = "director";
	doctorTwo.experience = "5 years";
	doctorTwo.fees = 1000;
	doctorTwo.specializations = hemaSpecializations;
	
	boolean addedTwo = hospital.createDoctor(doctorTwo);
	System.out.println(addedTwo);
	
	hospital.getDoctors();
		
	}
}