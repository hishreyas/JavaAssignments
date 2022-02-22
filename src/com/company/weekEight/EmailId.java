package com.company.weekEight;

import java.util.regex.Pattern;

public class EmailId {
    public String userName;
    private String password;


    public EmailId(String userName, String password) throws InvalidUserNameException,InvalidPasswordException {

        //regular expression to validate username

        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        if (userName.isEmpty() || !p.matcher(userName).matches()) {
            throw new InvalidUserNameException();
        } else  if (password.isEmpty() || !(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new InvalidPasswordException();
        }
        this.userName = userName;
        this.password = password;


    }

    @Override
    public String toString() {
        return "EmailId{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static class InvalidUserNameException extends Exception{
        public InvalidUserNameException(){
            super(InvalidUserNameException.class.getSimpleName());
        }
    }
    static class InvalidPasswordException extends Exception{
        public InvalidPasswordException(){
            super(InvalidPasswordException.class.getSimpleName());
        }
    }

    public  static void main(String args[]){
        if(args.length==2){
            try {
                EmailId emailId = new EmailId(args[0], args[1]);
                System.out.println(emailId);
            } catch (InvalidUserNameException | InvalidPasswordException e){
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("Invalid UserName and Password");
        }
    }
}
