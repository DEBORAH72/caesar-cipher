package ke.co.safaricom;

import com.Decode;
import com.Encode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            out.println("Hi! Welcome to my encoding application. Please choose: 1 (Encode), 2 (Decode) or 3 (Exit)");

            while (true) {
                try {
                    String navigationChoice = bufferedReader.readLine();

                    if (navigationChoice.equals("1")) {
                        out.println("Enter the text you want to encode here: ");
                        String stringEncodeText = bufferedReader.readLine();

                        out.println("Enter your encryption key (between 0-25): ");
                        String stringEncodeKey = bufferedReader.readLine();
                        int intEncodeKey = Integer.parseInt(stringEncodeKey);
                        if (intEncodeKey < 0 ){
                            out.println("Enter encryption key between 0 - 25");
                        } else if (intEncodeKey > 25) {
                            out.println("Enter encryption key between 0 - 25");
                        }else {

                            Encode encode = new Encode(stringEncodeText, intEncodeKey);

                            char[] encryptChars = encode.getEncodeText().toCharArray();
                            for (char c : encryptChars) {
                                c += encode.getEncodeKey();
                                out.print(c);
                            }
                        }
                    } else if (navigationChoice.equals("2")) {
                        out.println("Enter the text you want to decode here: ");
                        String stringDecodeText = bufferedReader.readLine();

                        out.println("Enter your decryption key (between 0-25): ");
                        String stringDecryptionKey = bufferedReader.readLine();
                        int intDecodeKey = Integer.parseInt(stringDecryptionKey);

                        if (intDecodeKey < 0 ){
                            out.println("Enter encryption key between 0 - 25");
                        } else if (intDecodeKey > 25) {
                            out.println("Enter encryption key between 0 - 25");
                        }else {

                            Decode decode = new Decode(stringDecodeText, intDecodeKey);

                            char[] encryptChars = decode.getDecodeText().toCharArray();
                            for (char c : encryptChars) {
                                c += decode.getDecodeKey();
                                out.print(c);
                            }
                        }
                    }
                    out.println("\r\n"  + "Please choose: " + "1 (Encode), 2 (Decode) or 3 (Exit)");
                    if (navigationChoice.equals("3")) {
                        out.println("Goodbye!");
                        programRunning = false;
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}