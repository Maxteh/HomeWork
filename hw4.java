4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;


public class homework_4 {
    public static void main (String[] args){
     boolean a = work(1, 19);
     System.out.println(a);
    }
    static boolean work(int x, int y){
     int a = x + y;
     return  10 < a && a <= 20;

    }

}

// Тут вроде всё работает. Только если один класс то его надо делать Main, а не homework_4
