package ke.co.safaricom;

public class Decode {public String decodeText;
    public int decryptionKey;
    public int decodeKey(int decryptionKey){
        if (decryptionKey < 0  ){
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (decryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
            return decryptionKey;
        }
    }

    public Decode(String decodeText, int decodeKey) {
        this.decodeText = decodeText;
        this.decryptionKey = decodeKey;
    }
    public void setDecodetext(String decodeText) {
        this.decodeText = decodeText.toUpperCase();
    }
    public String getDecodeText()
    {
        return decodeText;
    }
    public void setDecodeKey(Integer decodeKey)
    {
        this.decryptionKey = decodeKey;
    }
    public int getDecodeKey() {
        return decryptionKey;
    }
}
/*private String codedText = "";
    int decodeKey (int decryptionKey){
        if (decryptionKey < 0  ){
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else if (decryptionKey > 25) {
            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
        } else {
            return decryptionKey;
        }
    }
*/
