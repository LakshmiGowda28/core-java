class PoliceStation {

    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {

        boolean isCaseAdded = false;

        if (index < caseNames.length) {

            if (caseName != null && !caseName.isEmpty()) {
                caseNames[index++] = caseName;
                isCaseAdded = true;
            } else {
                System.out.println(caseName + " is not valid");
            }

        } else {
            System.out.println("Case list is full");
        }

        return isCaseAdded;
    }

    public void getCases() {

        System.out.println("Police Station Cases are:");

        for (String caseName : caseNames) {
            System.out.println(caseName);
        }
    }

    public String getCaseByName(String caseName) {

        String name = null;

        for (String c : caseNames) {
            if (c == caseName) {
                name = c;
                break;
            }
        }

        if (name == null) {
            System.out.println("Case is not found");
        }

        return name;
    }

    public boolean updateCase(String existingCase, String updatedCase) {

        boolean isUpdated = false;

        for (int i = 0; i < caseNames.length; i++) {

            if (caseNames[i] == existingCase) {
                caseNames[i] = updatedCase;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingCase + " is not found");
        }

        return isUpdated;
    }
}