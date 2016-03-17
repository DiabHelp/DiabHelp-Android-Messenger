package fr.diabhelp.messenger.ChatView;

/**
 * Created by naqued on 14/03/16.
 */
public class ChatMessage {
    private long id;
    private boolean isMe;
    private String message;
    private Long userId;
    private String dateTime;
    private String chan;
    private boolean isPrivate;

    public boolean getisPrivate() {
        return isPrivate;
    }

    public void setisPrivate(boolean _isPrivate) {
        isPrivate = _isPrivate;
    }

    public String getChan() {
        return chan;

    }
    public void setChan(String _chan) {
        chan = _chan;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public boolean getIsme() {
        return isMe;
    }
    public void setMe(boolean isMe) {
        this.isMe = isMe;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return dateTime;
    }

    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }
}
