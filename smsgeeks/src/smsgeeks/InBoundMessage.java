/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class InBoundMessage extends Message {
    
    private ContactNumber SenderNumber;
    private Boolean IsKeyWord;
    private long TimeRecieved;
    private int TotalMessageRecieved;
    private String TotalMessageRevenueRecieved;
    
    
    // this is a constructor for the inbound messages class
    public InBoundMessage(MessageDirection MessageDirection, MessageType MessageType, ContactNumber SenderNumber, Boolean IsKeyWord, long TimeRecieved, int TotalMessageRecieved, String TotalMessageRevenueRecieved){
        //call the constructor of the super class
        super(MessageDirection, MessageType);
        this.IsKeyWord = IsKeyWord;
        this.SenderNumber = SenderNumber;
        this.TimeRecieved = TimeRecieved;
        this.TotalMessageRecieved = TotalMessageRecieved;
        this.TotalMessageRevenueRecieved = TotalMessageRevenueRecieved;
    }
    
    public void RecieveMessage(){
        
    }
}
