package HomeWork.Lab14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionBox {


    public static String concatAndUpStrings(String s1, String s2) throws NullPointerException {
        return s1.toUpperCase() + s2.toUpperCase() + "\n";
    }


    public static String readFile(String path) {
        FileInputStream file=null;
        String s = "";                  //s с null поменял на "" т.к. в s читает из файла начиная с null
        //открыли файл
        try { file=new FileInputStream(path);
            //прочитали по символьно
            int i;
            while (((i = file.read()) != -1)) {
                s += (char) i;
            }
            //закрыли
            file.close();
        } catch (IOException e) {
            System.out.println("\nsmthng goes wrong");
            return "";
        }
        return s;
    }

    public static void main(String[] arr) {
        //(1) гарантируйте в методе main, что бы при вызове указанном ниже, программа не завершалась аварийно:

        try {
            System.out.println(concatAndUpStrings(null,""));
        } catch (NullPointerException e) {
            System.out.println("null is happend\n");
        } finally {
            System.out.println(readFile("1.txt"));
            System.out.println(readFile("system32.exe").length());
        }


//        Раскомментируте метод public static String readFile(String path)
//		допишите его так, что бы программа компилировалась и безопасно выполнялась. Если указаного файла несуществует или к нему нет доступа,
//		или произошла ошибка во время выполнения, функция должна вернуть пустую строку (""):


    }
}
