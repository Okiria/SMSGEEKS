/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */

 /**
 
 * imports
 */

import sms.*;


public class BulkRecipientMessage extends OutBoundMessage {
    
    private int numberOfMessagesDelivered;
    private int numberOfMessagesNotSent;
    private int numberOfMessagesPending;
    private ContactNumber contactsReachedList;
    private ContactNumber contactsPendingList;
    private ContactNumber contactsNotReachedList;
    private ContactNumber recipientList;
    
    
    //constructor for bulkrecipientmessage class
    public BulkRecipientMessage(int numberOfMessagesDelivered, int numberOfMessagesNotSent, int numberOfMessagesPending, ContactNumber contactsReachedList, ContactNumber contactsPendingList, ContactNumber contactsNotReachedList, ContactNumber recipientList,
            MessageDirection messageDirection, MessageType messageType, String senderAlias, SMSSendReport reportOnSend, long timeSent, long validity, int numberOfSentMessages, MessageStatus messageStatus, String sendEventName){
        super(messageDirection, messageType, senderAlias, reportOnSend, timeSent, validity, numberOfSentMessages, messageStatus, sendEventName);
        
        this.contactsNotReachedList = contactsNotReachedList;
        this.contactsPendingList = contactsPendingList;
        this.contactsReachedList = contactsReachedList;
        this.numberOfMessagesDelivered = numberOfMessagesDelivered;
        this.numberOfMessagesNotSent = numberOfMessagesNotSent;
        this.numberOfMessagesPending = numberOfMessagesPending;
        this.recipientList = recipientList;
        
    }
    
    // methods for bulkrecipientmessage
    public void sendMessageToSelected(int number){
        
    }
    
    public void sendMessageToAll(){
        
    }
    
    public void scheduleAll(){
        
    }
    
    public void scheduleSelected(){
        
    }
    
    public void setNumberOfMessagesSent(){
        
    }
    
}


