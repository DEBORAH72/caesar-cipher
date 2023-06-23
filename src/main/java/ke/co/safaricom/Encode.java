package ke.co.safaricom;

public class Encode { public int encryptionKey;
    public String encodeText;

    public int encodeKey(int encryptionKey){
        if (encryptionKey < 0  ){
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (encryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
            return encryptionKey;
        }
    }

    public Encode(String encodeText, int encodeKey) {
        this.encodeText = encodeText;
        this.encryptionKey = encodeKey;
    }
    public void setEncodetext(String encodeText) {
        this.encodeText = encodeText.toUpperCase();
    }
    public String getEncodeText()
    {
        return encodeText;
    }
    public void setEncodeKey(Integer encodeKey)
    {
        this.encryptionKey = encodeKey;
    }
    public int getEncodeKey() {
        return encryptionKey;
    }
}


    /*public void setEncodetext(String encodeText) {
        this.encodeText = encodeText.toUpperCase();
    }
    public void setEncodeKey(Integer encodeKey) {
        this.encodeKey = encodeKey;
    }*/
}
