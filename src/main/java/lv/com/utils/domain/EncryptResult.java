package lv.com.utils.domain;

/**
 * Created by LVBAOLIN on 2016/11/4.
 */
public class EncryptResult {
    private String result;
    private String type;
    private String status;

    public EncryptResult(String result, String type, String status) {
        this.result = result;
        this.type = type;
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
