package OutClassWork.Generics;
import OutClassWork.Generics.Generics.*;
import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Main {
    public static void main(String[] args) {
        Shmoption<String> present = new Shmoption<>("yes");
        Shmoption<String> absent = new Shmoption<>(null);
        System.out.println(present.getValue());
        System.out.println(present.isPresent());
        System.out.println(absent.isPresent());
        System.out.println(absent.orElse("no"));

        System.out.println();

        Shmoption<?> present1 = new Shmoption<>("yes");
        System.out.println(present1.isPresent());
        Object value = present1.getValue();
        System.out.println(value);
//      present1.setValue();  не можем ниче передать потому что не знаем тип

        System.out.println();

        Shmoption<Object> present2 = new Shmoption<>("yes");
        System.out.println(present2.isPresent());
        Object value1 = present2.getValue();
        System.out.println(value1);
        present2.setValue(123);  // сюда можем передать так как тип мы знаем, он Object

        System.out.println();

        Shmoption<? extends Number> present3 = new Shmoption<>(123);
        Number n = present3.getValue();
//      present3.setValue(123);  не можем

        System.out.println();

        NumberShmoption<?> number = new NumberShmoption<>(123);
        Number n1 = number.getValue();
//      number.setValue(124);   не можем

        IntegerShmoption integer = new IntegerShmoption(123);
        Integer i = integer.getValue();
        integer.setValue(124);

    }
}
