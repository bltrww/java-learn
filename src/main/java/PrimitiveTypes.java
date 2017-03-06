/**
 * Created by Kirill on 06.03.2017.
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println(
                "один из примитивных типов данных в джава это символы(char)"
        );
        //при объявлении переменной в джаве сначала указывается тип переменной, затем вводится название переменной
        //затем ставиться знак присваивания (=) и пишется значение, которое присваится в объявленную переменную
        char tilda = '~';
        // в  одинарных кавычках указывается символ переменной
        System.out.println(tilda);


        //следующий тип данных это целое число (примитивный тип данных) (int)
        int postIndex = 432030;
        System.out.println(postIndex);
        //второй целочисленный тип данных - long
        long dlina = 123456;
        System.out.println(dlina);

        // в одинарных кавычках указыватся символ, в остальных случаях значения
        // в двойных кавычках указываются строки
        // следующий примитивный тип данных - дробные числа (float)
        float drob = 3.14f;
        System.out.println(drob);

        //второй дробный тип данных = double
        double dva = 9.8765;
        System.out.println(dva);


        //след. примитивный тип данных - логический (boolean)
        //принимает только два возможных значения - true и false
        boolean log = false;
        System.out.println(log);
        //есть еще два вида данных byte и short (целочисленные)
    }
}
