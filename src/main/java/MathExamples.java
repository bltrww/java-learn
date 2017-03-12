/**
 * Created by Kirill on 10.03.2017.
 */
public class MathExamples {
    public static void main(String[] args) {
        double ddd= -5.5;
        double dAbs = Math.abs(ddd);
        System.out.println(dAbs);

        Math.sqrt(144); //вызов этого метода никуда не сохранится и его можно опустить
        double twelve = Math.sqrt(144);
        System.out.println(twelve);


        double angleInRadians = Math.toRadians(30);
        double sinus = Math.sin(angleInRadians);
        System.out.println(angleInRadians);

        ClassLesson.getMyPostIndex(); //вызов этого метода никуда не сохранится и его можно опустить
        double resultOperationWithPostIndex = Math.pow(ClassLesson.getMyPostIndex(), 3);
        System.out.println(resultOperationWithPostIndex);

        double Pi = Math.PI;
        System.out.println(Pi);


        double Remainder = Math.IEEEremainder(11, 10);
        System.out.println(Remainder);

        double ValueCloserToPositiveInfinity = Math.ceil(2.3632278);
        System.out.println(ValueCloserToPositiveInfinity);

        double RoundingDown = Math.floor(3.59943232);
        System.out.println(RoundingDown);

        double Rounding = Math.round(3.23033);
        System.out.println(Rounding);

        double RootOfSumAQuadrates = Math.hypot(2,3);
        System.out.println(RootOfSumAQuadrates);


    }








}