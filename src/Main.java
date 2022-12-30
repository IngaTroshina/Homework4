public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int t = -10;
        if (t <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 26;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int occupiedSeats = 5;
        int emptySeats = capacity - occupiedSeats;
        if (occupiedSeats < 60) {
            int sittingSeats = 60 - occupiedSeats;
            System.out.println("В вагоне " + emptySeats + " свободных мест, из которых скорее всего " + sittingSeats + " сидячих и 42 стоячих");
        } else if (occupiedSeats >= 60 && occupiedSeats < 102) {
            System.out.println("В вагоне " + emptySeats + " свободных мест, из которых скорее всего все стоячие");
        } else {
            System.out.println("В вагоне нет мест");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 767868;
        int two = 345356;
        int three = 533645;
        boolean threeIsTheLargest = three > two && three > one;
        boolean twoIsTheLargest = two > three && two > one;
        if (threeIsTheLargest) {
            System.out.println("Самое большое число " + three);
        } else if (twoIsTheLargest) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + one);

        }
    }
}