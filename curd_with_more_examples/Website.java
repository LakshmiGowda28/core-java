class Website{
    UserAccount ua[] = new UserAccount[15];
    int index;
    void addAccount(UserAccount u){
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;

        if (u.id > 0)
            isIdValid = true;
        if (u.name != null && !u.name.isEmpty())
            isNameValid = true;
        if (u.email != null && !u.email.isEmpty())
            isEmailValid = true;
        if (u.password != null && !u.password.isEmpty())
            isPasswordValid = true;
        if (isIdValid && isNameValid && isEmailValid && isPasswordValid)
        {
            ua[index++] = u;
        }
    }
    void getAccount(){
        for (UserAccount u : ua){
                System.out.println("The user id is " + u.id);
                System.out.println("The user name is " + u.name);
                System.out.println("The user email is " + u.email);
                System.out.println("The user password is " + u.password);
				System.out.println("-------------------");
        }
    }
}