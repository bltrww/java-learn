/**
 * Created by Kirill on 11.03.2017.
 */


//в джава любой класс можно использовать как тип объекта
//у объектных типов данных значение по умолчанию 0
//у всех примитивных типов данных есть свои классы обертки
//int->Integer
//double->Double
//char->Character
//float-Float
//long->Long

public class ObjectDataTypes {
    public static void main(String[] args) {
        Long maxValue = Long.MAX_VALUE;
        System.out.println(maxValue);

        Long result = maxValue + maxValue;
        System.out.println(result);

       //выполнять арифметические операции со строками мы не можем, но очень часто в качестве данных нам приходят строки
        //из которых нам нужно достать числа

        String numberStr = String.valueOf(Math.random()); //т.к Math.random возвращает double,
        // то чтобы сохранить сохранить его значение в строку, мы должны вызвать метод ValueOf
        System.out.println(numberStr);
        double numberMultiPly2 = Double.valueOf(numberStr)*2;
        System.out.println(numberMultiPly2);

        Byte maxByteValue = Byte.MAX_VALUE;
        System.out.println(maxByteValue);

        char[] hi = {'h','i','!'};
        String

    }

}
