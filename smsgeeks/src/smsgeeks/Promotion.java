/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class Promotion {
    
    private String promotionName;
    private String shortCode;
    private String companyName;
    
    private Promotion (String promotionName, String shortCode, String companyName){
        
        this.promotionName = promotionName;
        this.companyName = companyName;
        this.shortCode = shortCode;
    }
    
}
