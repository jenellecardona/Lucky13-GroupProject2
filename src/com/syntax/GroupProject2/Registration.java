package com.syntax.GroupProject2;

public class Registration {
    private String email, userName, password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Username is required and can not be blank");
        } else if (userName.length() < 6) {
            System.out.println("Your user name does not meet the required length");
        } else {
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password is required and can not be left blank");
        } else if (password.length() < 6) {
            System.out.println("Your password does not meet the required length");
        } else if (password.contains(userName)) {
            System.out.println("Your password can not contain your username in it");
        } else {
            this.password = password;
        }
    }
}

class RegistrationTester {
    public static void main(String[] args) {
        Registration info = new Registration();
        info.setEmail("syntaxtech@yahoo.com");
        info.setUserName("syntax.student");
        info.setPassword("syntax");
        System.out.println(info.getEmail());
        System.out.println(info.getUserName());
        System.out.println(info.getPassword());
    }

}

