7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

import java.util.Scanner;
public class HomeWork_7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите Ваше Имя");
        String name = userInput.nextLine();
        userInput.close();

        System.out.println(" Привет " +  name);


    }
}

// 1. Нет метода. Это я тебе уже писал. Т.е. должен быть типа того private static String ImyaMetoda(String userName) {}
// 2. Молодец что расширил задачу и добавил возможность ввода текста через консоль.
// 3. По условию задачи у тебя вывод не коректный, не хватает запятой и восклицательного знака. У тебя выводи " Привет указанное_имя"
