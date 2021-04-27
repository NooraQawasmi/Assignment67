
package com.example.assignment1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Bar {

    @SerializedName("type")
    private String mType;

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mType;

        public Bar.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Bar build() {
            Bar bar = new Bar();
            bar.mType = mType;
            return bar;
        }

    }

}