import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    //Task1
    //Создайте класс очереди для работы с символьными
    //значениями. Требуется создать реализации для операций
    //над элементами:
    //■ IsEmpty — проверка очереди на пустоту;
    //■ IsFull — проверка очереди на заполнение;
    //■ Enqueue — добавление элемента в очередь;
    //■ Dequeue — удаление элемента из очереди;
    //■ Show — отображение всех элементов очереди на экран.
    //При старте приложения нужно отобразить меню с помощью
    //которого пользователь может выбрать необходимую операцию
    public static void task1() {
        Task1 task1 = new Task1();
        System.out.println("Is empty? " + task1.isEmpty());
        task1.enqueue('a');
        task1.enqueue('b');
        task1.enqueue('c');
        task1.enqueue('d');
        task1.show();
        System.out.println("Adding element");
        task1.enqueue('n');
        task1.show();
        System.out.println("Removing element");
        task1.dequeue('b');
        task1.show();

    }

    //Task2
    //Создайте класс очереди с приоритетами для работы
    //с символьными значениями.
    //Требуется создать реализации для операций над эле-
    //ментами очереди:
    //■ IsEmpty — проверка очереди на пустоту;
    //■ IsFull — проверка очереди на заполнение;
    //■ InsertWithPriority — добавление элемента c приори-
    //тетом в очередь;
    //1
    //■ PullHighestPriorityElement — удаление элемента
    //■ Peek — возврат самого большого по приоритету эле-
    //мента. Обращаем ваше внимание, что элемент не
    //удаляется из очереди;
    //■ Show — отображение всех элементов очереди на экран.
    //При показе элемента также необходимо отображать
    //приоритет.
    public static void task2(){
        Task2 task2 = new Task2();
        System.out.println("Is empty? " + task2.isEmpty());
        task2.insertWithPriority('c');
        task2.insertWithPriority('d');
        task2.insertWithPriority('a');
        task2.insertWithPriority('b');
        //удаление элемента с самым высоким приоритетом
        task2.pullHighestPriorityElement();
        System.out.println("возврат самого большого по приоритету элемента");
        System.out.println(task2.peek());
        task2.show();

    }

}