/**
 * Created by Kirill on 10.03.2017.
 */

//значение области по умолчанию
public class HomeTask {
    private static Object MyObject;

    public static void main(String args[]) {
        System.out.println("expect to see NULL " + MyObject);

        //повтор кода с обращением к другому классу
        int PostIndex = ClassLesson.getMyPostIndex();
        System.out.println(PostIndex);

    }


}


