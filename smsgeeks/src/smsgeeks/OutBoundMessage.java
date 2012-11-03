/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class OutBoundMessage extends Message {
    
    private String senderAlias;
    private SMSSendReport reportOnSend;
    private long timeSent;
    private long validity;
    private int numberOfSentMessages;
    private MessageStatus messageStatus;
    private String sendEventName;
    
    // this is the constructor for OutBoundMessages
    public OutBoundMessage(MessageDirection messageDirection, MessageType messageType, String senderAlias, SMSSendReport reportOnSend, long timeSent, long validity, int numberOfSentMessages, MessageStatus messageStatus, String sendEventName){
        super(messageDirection, messageType);
        this.senderAlias = senderAlias;
        this.reportOnSend = reportOnSend;
        this.timeSent = timeSent;
        this.validity = validity;
        this.numberOfSentMessages = numberOfSentMessages;
        this.messageStatus = messageStatus;
        this.sendEventName = sendEventName;
        
    }
    
    public void sendMessage(){
        
    }
    
    public void scheduleMessage(){
        
    }
    
    public void refreshAll(){
        
    }
    
    public void getReport(){
        
    }
    
    public MessageStatus getMessageStatus(MessageStatus status){
        return status;
    }
    
}
