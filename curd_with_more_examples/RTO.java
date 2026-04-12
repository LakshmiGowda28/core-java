class RTO{
    DrivingLicenseInfo dlos[] = new DrivingLicenseInfo[13];
    int index;
    boolean addLicenseInfo(DrivingLicenseInfo licInfo){
        boolean isInfoAdded = false;
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isAddressValid = false;
        boolean isBloodGroupValid = false;
        if (licInfo.id > 0)
            isIdValid = true;
        if (licInfo.name != null && !licInfo.name.isEmpty())
            isNameValid = true;
        if (licInfo.address != null)
            isAddressValid = true;
        if (licInfo.bloodGroup != null)
            isBloodGroupValid = true;
	    if (isIdValid && isNameValid && isAddressValid && isBloodGroupValid)
        {
            dlos[index++] = licInfo;
            isInfoAdded = true;
        }
        return isInfoAdded;
    }
	
    void getDLI(){
        for (DrivingLicenseInfo dli : dlos){
                System.out.println("The id is " + dli.id);
                System.out.println("The name is " + dli.name);
                System.out.println("The address is " + dli.address);
                System.out.println("The bloodGroup is " + dli.bloodGroup);
				System.out.println("-------------------");
        }
    }
}