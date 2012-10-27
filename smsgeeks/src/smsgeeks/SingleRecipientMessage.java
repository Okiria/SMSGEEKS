/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class SingleRecipientMessage extends OutBoundMessage {
    
    private ContactNumber RecieverNumber;
    
    private SingleRecipientMessage(MessageDirection MessageDirection, MessageType MessageType, String SenderAlias, SMSSendReport ReportOnSend, long TimeSent, long Validity, int NumberOfSentMessages, MessageStatus MessageStatus, String SendEventName, ContactNumber RecieverNumber){
        super(MessageDirection, MessageType, SenderAlias, ReportOnSend, TimeSent, Validity, NumberOfSentMessages, MessageStatus, SendEventName);
        
        this.RecieverNumber = RecieverNumber;
    }
    
    
}
