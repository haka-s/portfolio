import javax.swing.plaf.basic.BasicTreeUI;
import java.util.*;
import java.text.Normalizer;
public class main {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the text");
        String text = input.nextLine();
        System.out.println("your normalized text looks like " + normalizeText(text));
        Scanner input1 = new Scanner(System.in);
        System.out.println("input the number of shifts into the shifter");
        int shifte = input1.nextInt();
        text = normalizeText(text);
        String shifto = shiftAlphabet(shifte);
        System.out.println("your crypto key is " + shifto);
        System.out.println("your text crypted is " + caesarify(text, shifte));
        String text1 = caesarify(text, shifte);
        Scanner input2 = new Scanner(System.in);
        System.out.println("grupify");
        int grupy = input2.nextInt();
        System.out.println("normal grupify"+groupify(text,grupy));
        System.out.println("crypted grupify"+groupify(text1,grupy));


    }

    public static String normalizeText(String texto) {
        texto = texto.replaceAll("\\p{Punct}", "");
        texto = texto.toUpperCase();
        texto = texto.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(texto.length());
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        for (char c : texto.toCharArray()) {
            if (c <= '\u007F') sb.append(c);

        }
        return sb.toString();
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String caesarify(String text, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cipher = shiftAlphabet(key);
        String textEncrypted = "";

        for(int t = 0; t < text.length(); t++) {
            for (int i = 0; i < alphabet.length(); i++) {
                if(text.charAt(t) == alphabet.charAt(i)) {
                    textEncrypted += cipher.charAt(i);
                }
            }
        }
        return(textEncrypted);
        }
    public static String groupify(String text, int skey){
        String result="";
        int len =text.length();
        int s=0;
        int n=3;
        for(int x=0;x<len;++n) {
            s = s + skey;
            result = result + text.substring(x,s);
        }
        return result;
    }

        }


