package ru.dudeandrey.jsonobject;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {
    @SerializedName("ADA")
    @Expose
    private List<Ada> ada = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param ada
     */
    public Data(List<Ada> ada) {
        super();
        this.ada = ada;
    }

    public List<Ada> getAda() {
        return ada;
    }

    public void setAda(List<Ada> ada) {
        this.ada = ada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ada");
        sb.append('=');
        sb.append(((this.ada == null)?"<null>":this.ada));
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
        result = ((result* 31)+((this.ada == null)? 0 :this.ada.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((this.ada == rhs.ada)||((this.ada!= null)&&this.ada.equals(rhs.ada)));
    }
}
