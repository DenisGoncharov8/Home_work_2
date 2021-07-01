public class Home_work_2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 2;
        int b = 2;
        System.out.println(sumNumbers10and20(a, b));

        System.out.println("Задание 2");
        numberPlus(-1);

        System.out.println("Задание 3");
        minusNumbers(-3);

        System.out.println("Задание 4");
        print("QA", 10);
    }

    /*
       Задание 1
       Написать метод, принимающий на вход два целых числа и проверяющий,
       что их сумма лежит в пределах от 10 до 20 (включительно),
       если да – вернуть true, в противном случае – false.
        */
        public static boolean sumNumbers10and20(int a, int b) {
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
        }
        /*
       Задание 2
       Написать метод, которому в качестве параметра передается целое число,
       метод должен напечатать в консоль, положительное ли число передали или отрицательное.
       Замечание: ноль считаем положительным числом.
        */
    public static void numberPlus(int c) {
        if (c >=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
       /*
       Задание 3
       Написать метод, которому в качестве параметра передается целое число.
       Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
        */
       public static boolean minusNumbers(int a) {
           if (a < 0) {
               return true;
           }
           else {
               return false;
           }
       }
       /*
       Задание 4
       Написать метод, которому в качестве аргументов передается строка и число,
       метод должен отпечатать в консоль указанную строку, указанное количество раз
        */
       public static void print(String message, int count) {
           for (int i = 0; i < count; i++) {
               System.out.println(message);
           }
       }


}
