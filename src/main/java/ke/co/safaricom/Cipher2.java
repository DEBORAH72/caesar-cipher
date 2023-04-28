package java.ke.co.safaricom;
// Source code recreated from a .class file by IntelliJ IDEA
public class Cipher2 {
    private String mText;
    private int mShift;

    public Cipher(String var1, int var2) {
        this.mText = var1;
        this.mShift = var2;
    }

    public String getText() {
        return this.mText;
    }

    public int getShift() {
        return this.mShift;

    }

    public static char myCipher(char var0, int var1) {
        int var3 = Character.isUpperCase(var0) ? 65 : 97;
        int var4 = var1 % 26;
        char var5 = (char) (var0 + var3);
        var5 = (char) ((var5 - var4 - 26) % 26);
        return (char) (var5 + var3);
    }

    public String myCipher() {
        StringBuilder var1 = new StringBuilder();

        for (int var2 = 0; var2 < this.mText.length(); ++var2) {
            if (this.mText.charAt(var2) == ' ') {
                var1.append(" ");
            } else {
                var1.append(myCipher(this.mText.charAt(var2), this.mShift));
            }
        }

        return var1.toString();
    }
}
