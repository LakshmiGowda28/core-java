class PoliceStation{

  String caseNames[] = new String[16];
  int index;

  public boolean addCase(String caseName){
    boolean isCaseAdded = false;

    if(index < caseNames.length){
      if(caseName != null && !caseName.isEmpty()){

        caseNames[index++] = caseName;
        isCaseAdded = true;
      }
      else
        System.out.println(caseName + " is not valid");
    }
    else
      System.out.println("Case list is full");

    return isCaseAdded;
  }

  public void getCases(){
    System.out.println("Police Station Cases are:");
    for(String caseName : caseNames){
      System.out.println(caseName);
    }
  }

}