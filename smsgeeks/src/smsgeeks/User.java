/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class User {
    
    private String firstName;
    private String lastName;
    private String userId;
    private String password;
    
    private User(String firstName, String lastName, String userId, String password){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userId = userId;
    }
    
}
