/**
 * Created by Kirill on 08.03.2017.
 */
public class TryUseMethod {
    public static void main(String[] args) {

        //пример вызова статичного метода класса, который возращает значение int

        int postIndex = ClassLesson.getMyPostIndex();
        System.out.println(postIndex);

        int nine = ClassLesson.calculateSquare(3);
        System.out.println(nine);



        //для вызова нестатичных методов классов необходимо создать экземпляр класса через конструктор
        //пример объявления класса с конструктором по умолчанию
        ClassLesson classLesson = new ClassLesson();
        int defualtValue = classLesson.returnDefaultIntValue();
        System.out.println(defualtValue);
    }
}
