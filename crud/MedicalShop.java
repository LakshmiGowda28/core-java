class MedicalShop {

    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicine(String medicine) {

        boolean isMedicineAdded = false;

        if (index < medicineNames.length) {

            if (medicine != null && !medicine.isEmpty()) {
                medicineNames[index++] = medicine;
                isMedicineAdded = true;
            } else {
                System.out.println(medicine + " is not valid");
            }

        } else {
            System.out.println("Medicine list is full");
        }

        return isMedicineAdded;
    }

    public void getMedicines() {

        System.out.println("Medical Shop Medicines are:");

        for (String medicine : medicineNames) {
            System.out.println(medicine);
        }
    }

    public String getMedicineByName(String medicineName) {

        String name = null;

        for (String medicine : medicineNames) {
            if (medicine == medicineName) {
                name = medicine;
                break;
            }
        }

        if (name == null) {
            System.out.println("Medicine is not found");
        }

        return name;
    }

    public boolean updateMedicine(String existingMedicine, String updatedMedicine) {

        boolean isUpdated = false;

        for (int index = 0; index < medicineNames.length; index++) {

            if (medicineNames[index] == existingMedicine) {
                medicineNames[index] = updatedMedicine;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingMedicine + " is not found");
        }

        return isUpdated;
    }
	
public boolean deleteMedicine(String medicineName) {

    boolean isDeleted = false;

    for (int index = 0; index < medicineNames.length; index++) {

        if (medicineNames[index] == medicineName) {
            medicineNames[index] = null;
            isDeleted = true;
            break;
        }
    }

    if (isDeleted == false) {
        System.out.println(medicineName + " is not found");
    }

    return isDeleted;
}	
}