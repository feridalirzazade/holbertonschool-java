public class Message {
    private String text;
    private MessageType messageType;

    public Message(String text, MessageType messageType) {
        this.text = text;
        this.messageType = messageType;
    }

    public MessageType getMessageType(){
        return messageType;
    }
    public String getText(){
        return text;
    }
}
