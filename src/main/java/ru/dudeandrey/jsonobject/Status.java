package ru.dudeandrey.jsonobject;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Status {

    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("error_code")
    @Expose
    private long errorCode;
    @SerializedName("error_message")
    @Expose
    private Object errorMessage;
    @SerializedName("elapsed")
    @Expose
    private long elapsed;
    @SerializedName("credit_count")
    @Expose
    private long creditCount;
    @SerializedName("notice")
    @Expose
    private Object notice;

    /**
     * No args constructor for use in serialization
     *
     */
    public Status() {
    }

    /**
     *
     * @param elapsed
     * @param errorMessage
     * @param errorCode
     * @param creditCount
     * @param timestamp
     * @param notice
     */
    public Status(String timestamp, long errorCode, Object errorMessage, long elapsed, long creditCount, Object notice) {
        super();
        this.timestamp = timestamp;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.elapsed = elapsed;
        this.creditCount = creditCount;
        this.notice = notice;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getElapsed() {
        return elapsed;
    }

    public void setElapsed(long elapsed) {
        this.elapsed = elapsed;
    }

    public long getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(long creditCount) {
        this.creditCount = creditCount;
    }

    public Object getNotice() {
        return notice;
    }

    public void setNotice(Object notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("errorCode");
        sb.append('=');
        sb.append(this.errorCode);
        sb.append(',');
        sb.append("errorMessage");
        sb.append('=');
        sb.append(((this.errorMessage == null)?"<null>":this.errorMessage));
        sb.append(',');
        sb.append("elapsed");
        sb.append('=');
        sb.append(this.elapsed);
        sb.append(',');
        sb.append("creditCount");
        sb.append('=');
        sb.append(this.creditCount);
        sb.append(',');
        sb.append("notice");
        sb.append('=');
        sb.append(((this.notice == null)?"<null>":this.notice));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((int)(this.elapsed^(this.elapsed >>> 32))));
        result = ((result* 31)+((this.errorMessage == null)? 0 :this.errorMessage.hashCode()));
        result = ((result* 31)+((int)(this.errorCode^(this.errorCode >>> 32))));
        result = ((result* 31)+((int)(this.creditCount^(this.creditCount >>> 32))));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.notice == null)? 0 :this.notice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return ((((((this.elapsed == rhs.elapsed)&&((this.errorMessage == rhs.errorMessage)||((this.errorMessage!= null)&&this.errorMessage.equals(rhs.errorMessage))))&&(this.errorCode == rhs.errorCode))&&(this.creditCount == rhs.creditCount))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.notice == rhs.notice)||((this.notice!= null)&&this.notice.equals(rhs.notice))));
    }
}
