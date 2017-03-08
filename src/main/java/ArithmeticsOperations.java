/**
 * Created by Kirill on 07.03.2017.
 */
public class ArithmeticsOperations {
    public static void main(String[] args) {
        //со всеми целочисленными и дробными типами данных можно проводить арифметические операции
        //сложение(+), вычитание(-), деление(/), остаток от деления(%), умножение(*)

//умножение и сложение int
        int a, b, c, x;
        a = 1;
        b = 2;
        c = 3;
        x = (c * b) + a;
        System.out.println(x);


        int d;
        float f, e;
        d = 10;
        f = 2.5f;
        e = d / f;
        System.out.println(e);


        int a1, b1, c1;
        double d1, e1, h1; //его же пробовал с float, значение выводил менее точное
        a1 = 10;
        b1 = 15;
        c1 = 5;
        d1 = 1.2;
        e1 = 2.1;
        h1 = a1 * d1 + b1 / e1 - c1;
        System.out.println(h1);


        int z1, y1, x1;
        z1 = 1000;
        y1 = 13;

        x1=(z1 % y1);
        System.out.println("остаток от деления "+x1); //ответ 12????



        double pi = 3.14;
        int abc;
//        double result = pi/abc;


    }
}