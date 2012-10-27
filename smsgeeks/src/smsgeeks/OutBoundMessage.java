/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class OutBoundMessage extends Message {
    
    private String SenderAlias;
    private SMSSendReport ReportOnSend;
    private long TimeSent;
    private long Validity;
    private int NumberOfSentMessages;
    private MessageStatus MessageStatus;
    private String SendEventName;
    
    // this is the constructor for OutBoundMessages
    public OutBoundMessage(MessageDirection MessageDirection, MessageType MessageType, String SenderAlias, SMSSendReport ReportOnSend, long TimeSent, long Validity, int NumberOfSentMessages, MessageStatus MessageStatus, String SendEventName){
        super(MessageDirection, MessageType);
        this.SenderAlias = SenderAlias;
        this.ReportOnSend = ReportOnSend;
        this.TimeSent = TimeSent;
        this.Validity = Validity;
        this.NumberOfSentMessages = NumberOfSentMessages;
        this.MessageStatus = MessageStatus;
        this.SendEventName = SendEventName;
        
    }
    
    public void SendMessage(){
        
    }
    
    public void ScheduleMessage(){
        
    }
    
    public void RefreshAll(){
        
    }
    
    public MessageStatus GetMessageStatus(MessageStatus status){
        return status;
    }
    
}
