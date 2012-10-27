/*
 * SMSGEEKS © Copyrights reserved 2012
 * 
 */
package smsgeeks;

/**
 *
 * @author Okiria Emmanuel
 */
public class Message {
    
    private MessageDirection MessageDirection ;
    private MessageType MessageType ;
    
    //this is the constructor for class Message
    public Message(MessageDirection MessageDirection, MessageType MessageType){
        this.MessageDirection = MessageDirection;
        this.MessageType = MessageType;
    }
    
    public void DeleteMessages(){
        
    }
    
    public void DeleteSelectedMessages(){
      
    }
    
    public String GetStringMessage(String message){
        return message ;
    }
    
    public Byte GetByteMessage(Byte bytemessage){
        return bytemessage;
    }
    
}
