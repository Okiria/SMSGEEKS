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
    
    private MessageDirection messageDirection ;
    private MessageType messageType ;
    
    //this is the constructor for class Message
    public Message(MessageDirection direction, MessageType type){
        this.messageDirection = direction;
        this.messageType = type;
    }
    
    public void deleteMessages(){
        
    }
    
    public void deleteSelectedMessages(){
      
    }
    
    public String getStringMessage(String message){
        return message ;
    }
    
    public Byte getByteMessage(Byte bytemessage){
        return bytemessage;
    }
    
}
