/**
 * Created by Kirill on 08.03.2017.
 */
public class TryUseMethod {
    public static void main(String[] args) {

        //пример вызова статичного метода класса, который возращает значение int

        int postIndex = ClassLesson.getMyPostIndex();
        System.out.println(postIndex);

        int nine = ClassLesson.calculateSquare(4);
        System.out.println(nine);




        //для вызова нестатичных методов классов необходимо создать экземпляр класса через конструктор
        //пример объявления класса с конструктором по умолчанию
        ClassLesson classLesson = new ClassLesson();
        int defualtValue = classLesson.returnDefaultIntValue();
        System.out.println(defualtValue);
    }
}


class Measurements {
    float density;
            float volume;
}

    class Example {
        public static void main(String[] args) {
            Measurements Measurement1 = new Measurements();
            Measurements Measurement2 = new Measurements();
            float weight;

            Measurement1.density = 3;
            Measurement1.volume = 5;

            Measurement2.density = 7;
            Measurement2.volume = 9;

            weight=Measurement1.density * Measurement1.volume;
            System.out.println(weight);

            weight=Measurement2.density * Measurement2.volume;
            System.out.println(weight);

        }
    }
