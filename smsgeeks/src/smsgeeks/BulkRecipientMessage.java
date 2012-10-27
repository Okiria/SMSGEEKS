/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class BulkRecipientMessage extends OutBoundMessage {
    
    private int NumberOfMessagesDelivered;
    private int NumberOfMessagesNotSent;
    private int NumberOfMessagesPending;
    private ContactNumber ContactsReachedList;
    private ContactNumber ContactsPendingList;
    private ContactNumber ContactsNotReachedList;
    private ContactNumber RecipientList;
    
    
    //constructor for bulkrecipientmessage class
    public BulkRecipientMessage(int NumberOfMessagesDelivered, int NumberOfMessagesNotSent, int NumberOfMessagesPending, ContactNumber ContactsReachedList, ContactNumber ContactsPendingList, ContactNumber ContactsNotReachedList, ContactNumber RecipientList,
            MessageDirection MessageDirection, MessageType MessageType, String SenderAlias, SMSSendReport ReportOnSend, long TimeSent, long Validity, int NumberOfSentMessages, MessageStatus MessageStatus, String SendEventName){
        super(MessageDirection, MessageType, SenderAlias, ReportOnSend, TimeSent, Validity, NumberOfSentMessages, MessageStatus, SendEventName);
        
        this.ContactsNotReachedList = ContactsNotReachedList;
        this.ContactsPendingList = ContactsPendingList;
        this.ContactsReachedList = ContactsReachedList;
        this.NumberOfMessagesDelivered = NumberOfMessagesDelivered;
        this.NumberOfMessagesNotSent = NumberOfMessagesNotSent;
        this.NumberOfMessagesPending = NumberOfMessagesPending;
        this.RecipientList = RecipientList;
        
    }
    
    // methods for bulkrecipientmessage
    public void SendMessageToSelected(int number){
        
    }
    
    public void SendMessageToAll(){
        
    }
    
    public void ScheduleAll(){
        
    }
    
    public void ScheduleSelected(){
        
    }
    
    public void SetNumberOfMessagesSent(){
        
    }
    
}


