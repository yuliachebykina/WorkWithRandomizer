package info.sjd.model;

public class Numbers {

    private Long timeMilliseconds;
    private Integer sessionID;
    private String clientIP;

    public Long getTimeMilliseconds() {
        return timeMilliseconds;
    }

    public void setTimeMilliseconds(Long timeMilliseconds) {
        this.timeMilliseconds = timeMilliseconds;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public Numbers(Long timeMilliseconds, Integer sessionID, String clientIP) {
        this.timeMilliseconds = timeMilliseconds;
        this.sessionID = sessionID;
        this.clientIP = clientIP;
    }

    public Numbers() {
    }

    @Override
    public String toString() {
        return timeMilliseconds+sessionID+clientIP;
    }
}
