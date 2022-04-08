package ru.dudeandrey.jsonobject;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Quote {
    @SerializedName("RUB")
    @Expose
    private Rub rub;

    /**
     * No args constructor for use in serialization
     *
     */
    public Quote() {
    }

    /**
     *
     * @param rub
     */
    public Quote(Rub rub) {
        super();
        this.rub = rub;
    }

    public Rub getRub() {
        return rub;
    }

    public void setRub(Rub rub) {
        this.rub = rub;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Quote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rub");
        sb.append('=');
        sb.append(((this.rub == null)?"<null>":this.rub));
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
        result = ((result* 31)+((this.rub == null)? 0 :this.rub.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quote) == false) {
            return false;
        }
        Quote rhs = ((Quote) other);
        return ((this.rub == rhs.rub)||((this.rub!= null)&&this.rub.equals(rhs.rub)));
    }
}
