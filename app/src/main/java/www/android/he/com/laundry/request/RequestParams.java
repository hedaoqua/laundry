package www.android.he.com.laundry.request;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 16/3/24 下午2:13.
 *
 * @author binwin20
 */
public class RequestParams extends HashMap<String, String>{

    private RequestParams() {

    }

    public void putParam(String key, String val) {
        if (val != null) {
            this.put(key, val);
        }
    }

    public void putParam(String key, double val) {
        this.put(key, String.valueOf(val));
    }

    public void putParam(String key, long val) {
        this.put(key, String.valueOf(val));
    }

    public static class Builder {
        RequestParams mParams;

        public Builder(Map params) {
            mParams = new RequestParams();
            mParams.putAll(params);
        }

        public Builder(RequestParams params) {
            mParams = new RequestParams();
            mParams.putAll(params);
        }

        public Builder() {
            mParams = new RequestParams();
            Collections.synchronizedMap(mParams);
        }

        public Builder putParam(String key, String val) {
            if (val != null) {
                mParams.put(key, val);
            }
            return this;
        }

        public Builder putParam(String key, double val) {
            mParams.put(key, String.valueOf(val));
            return this;
        }

        public Builder putParam(String key, long val) {
            mParams.put(key, String.valueOf(val));
            return this;
        }

        public RequestParams build() {
            return mParams;
        }
    }
}
