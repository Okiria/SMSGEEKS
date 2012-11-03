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
    
    private ContactNumber senderNumber;
    private Boolean isKeyWord;
    private long timeRecieved;
    private int totalMessageRecieved;
    private String totalMessageRevenueRecieved;
    
    
    // this is a constructor for the inbound messages class
    public InBoundMessage(MessageDirection MessageDirection, MessageType MessageType, ContactNumber SenderNumber, Boolean IsKeyWord, long TimeRecieved, int TotalMessageRecieved, String TotalMessageRevenueRecieved){
        //call the constructor of the super class
        super(MessageDirection, MessageType);
        this.isKeyWord = IsKeyWord;
        this.senderNumber = SenderNumber;
        this.timeRecieved = TimeRecieved;
        this.totalMessageRecieved = TotalMessageRecieved;
        this.totalMessageRevenueRecieved = TotalMessageRevenueRecieved;
    }
    
    public void recieveMessage(){
        
    }
}
