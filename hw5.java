5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.);

public class homework_5 {
    public static void main(String[] args) {
        int a = (6);
        if (a >= 0) {
            System.out.println("Данное число положительное");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }

}

// 1. В предыдущем задании ты правильно сделал отдельный метод с входными параметрами, тут этого нет.
// 2. Код рабочий