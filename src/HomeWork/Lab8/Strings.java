package HomeWork.Lab8;

import java.util.Arrays;

public class Strings {
    String polite(String name){
        return "Hello " + name + " !";
    }

    String makeWrapWord(String s, String wrap){
        String newS;
        if (wrap.length() == 4) {
            newS = wrap.substring(0,2) + s + wrap.substring(2,4);
        } else return "wrap must contain 4 chars";
        return newS;
    }

    String halfString(String s){
        String halfS = s.substring(0, s.length()/2);
        return halfS;
    }

    boolean oodStr(String s){
        if (s.substring(s.length()-3).equals("ood")) {
            return true;
        } else return false;
    }

    int charCounter(String s, char c){
        int counter = 0;
        char[] schar = s.toCharArray();
        for (char i: schar) {
            if (i == c){
                counter++;
            }
        }
        return counter;
    }

    boolean oddLength(double d){
        String s = null;
        if ((s.valueOf(d).length()) %2 == 0){
            return false;
        }
        return true;
    }

    int stringCounter(String s, String searchStr){
        int counter = 0;
        String[] arr = s.split("\\W");
        for (String i: arr) {
            if(i.equalsIgnoreCase(searchStr)){
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(s.indexOf(searchStr));
        return counter;
    }



    public static void main(String[] args) {
        Strings strings = new Strings();
        System.out.println(strings.polite("Alice"));
        System.out.println();
        System.out.println(strings.makeWrapWord("shtosh", "||||"));
        System.out.println();
        System.out.println(strings.halfString("This is a half of string"));
        System.out.println();
        System.out.println(strings.oodStr("ooooood"));
        System.out.println();
        System.out.println(strings.charCounter("rtjnnnn nnnnnj tynnn nujhnn eytj", 'n'));
        System.out.println();
        System.out.println(strings.oddLength(1.0));
        System.out.println();
        System.out.println(strings.stringCounter("Java_ bla bla bla java,,, bla bla Java!", "java"));
    }
}
