class Hospital{
	Doctor doctor;
	Doctor doctors[] = new Doctor[3];
	int index;
	public boolean createDoctor(Doctor doctor){
		boolean isDoctorAdded = false;
		boolean isDocIdValid = false;
		boolean isDocNameValid = false;
		boolean isDesignationValid = false;
		boolean isSpecializationValid = false;
		boolean isExperienceValid = false;
		boolean isFeeValid = false;
		
		if(doctor.docId > 0){
			isDocIdValid = true;
		}else System.out.println(doctor.docId + " not valid");
		if(doctor.fees > 250){
			isFeeValid = true;
		}else System.out.println(doctor.fees + " not valid");		
		if(doctor.docName != null && !doctor.docName.isEmpty()){
			isDocNameValid = true;
		}else System.out.println(doctor.docName + " not valid");		
		if(doctor.designation != null && !doctor.designation.isEmpty()){
			isDesignationValid = true;
		}else System.out.println(doctor.designation + " not valid");		
		if(doctor.experience != null && !doctor.experience.isEmpty()){
			isExperienceValid = true;
		}else System.out.println(doctor.experience + " not valid");		
		if(doctor.specializations != null && doctor.specializations.length > 0){
			isSpecializationValid = true;
		}else System.out.println(doctor.specializations + " not valid");		
		if(isDocIdValid && isFeeValid && isDocNameValid && isDesignationValid && isExperienceValid && isSpecializationValid){
			doctors[index++] = doctor;
			isDoctorAdded = true;
		}		
		return isDoctorAdded;
	}	
	public void getDoctors()
	{
		for(Doctor doctor : doctors){
			System.out.println("The doc id is: " + doctor.docId);
			System.out.println("The doc name is: " + doctor.docName);
			System.out.println("The doc designation is: " + doctor.designation);
			System.out.println("The doc experience is: " + doctor.experience);
			System.out.println("The doc fees is: " + doctor.fees);
			System.out.println("The doc specialization is: " );
			for(String specialization : doctor.specializations)
			{
				System.out.println(specialization);
			}
			System.out.println();
		}
	}		
}