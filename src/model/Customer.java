package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    private static final String emailPattern = "^(.+)@(.+).(.+)$";
    private static final Pattern pattern = Pattern.compile(emailPattern);
    public static boolean isValid(final String email){
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        if (!isValid(email)){
            throw new IllegalArgumentException("This email is invalid");
        }
        this.email = email;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
