package java.ke.co.safaricom;

import java.util.Scanner;
public class App2 {

    public App() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String var2 = var1.nextLine();

        int var3;
        do {
            System.out.print("Please enter a key between 1 to 25: ");
            var3 = var1.nextInt();
            if (var3 < 1 || var3 > 25) {
                System.out.printf(" Enter the correct key.It must be between 1 and 25, you entered %d.\n", var3);
            }
        } while(var3 < 1 || var3 > 25);

        System.out.println("Password:\t" + var2);
        Cipher var4 = new Cipher(var2, var3);
        String var5 = var4.myCipher();
        System.out.println("Encrypted:\t" + var5);
        Cipher var6 = new Cipher(var5, -var3);
        System.out.println("Decrypted:\t" + var6.myCipher());
            }
        }
