// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();//накопления
        task2();//счет
        task3();//численность населения
    }
    private static void task1(){
        System.out.println("Задача 1");
        int accumulation = 15000;
        int goal = 2459000;
        int total = 0;
        int i = 0;
        while (total < goal){
            total += accumulation;
            i++;
            String msg = String.format("Месяц %s, сумма накоплений равна %s рублей", i, total);
            System.out.println(msg);
        }
        System.out.println("Потребовалось месяцев: " + i);
    }
    private static void task2(){
        System.out.println("Задача 2");
        int i = 1;
        while ( i<=10 ){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--){
            System.out.print(j + " ");
        }
    }
    private static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthIncr = 17;
        int deathDecr = 8;
        int temp = 10;
        int year = 1;
        while (year <= temp){
            population += population * (birthIncr - deathDecr) /1000;
            System.out.println(String.format("Год %s, численность населения составляет %s", year, population));
            year ++;
        }
    }


}