import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        int vklad = 0;
        int a = 0;
        while (vklad <= 2459000) {
            a = a + 1;
            vklad = vklad + 15000;
            System.out.println("Месяц " + a + " сумма накоплений равна " + vklad + " рублей.");
        }
    }
    public static void task2() {
        System.out.println("Задача № 2.");
        int b = 0;
        while (b <= 9) {
            b = b + 1;
            System.out.print(" " + b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(" " + c + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача № 3.");
        int Ns = 12000000;
        byte Rn = 17;
        byte Sn = 8;
        int Dns = Rn - Sn; // Динмика численности населения за год.
        int Year = 0;
        while (Year < 10) {
            Year = Year + 1;
            //Расчёт динамики населения страны за указанный период.
            Ns += (Ns * Dns) / 1000; // += оператор добавления эквивалентно Ns = Ns + (Ns * Dns) / 1000  ;
            System.out.println("Год " + Year + " численность на селения будет составлять. " + Ns);
        }
    }
    public static void task4() {
        System.out.println("Задача № 4.");
        int VkladBegin = 15000;
        int d = 0;
        while (VkladBegin < 12_000_000) {
            int VkladProzent = VkladBegin / 100 * 7;
            VkladBegin = VkladBegin + VkladProzent;
            d = d + 1;
            System.out.println("За " + d + " месяц, сумма накоплений составит " + VkladBegin);
        }
    }
    public static void task5() {
        System.out.println("Задача № 5.");
        int VkladBegin2 = 15000;
        int e = 0;
        while (VkladBegin2 < 12_000_000) {
            int VkladProzent = VkladBegin2 / 100 * 7;
            VkladBegin2 = VkladBegin2 + VkladProzent;
            e = e + 1;
            if (e % 6 == 0) {
                System.out.println("За " + e + " месяцев, сумма накоплений составит " + VkladBegin2);
            }
        }
    }
    public static void task6() {
        System.out.println("Задаача № 6.");
        int VkladBegin3 = 15000;
        byte f = 0 ;
        while (f <= 108) {
            int VkladProzent = VkladBegin3 / 100 * 7;
            VkladBegin3 = VkladBegin3 + VkladProzent;
                f++;
                if (f % 6 == 0) {
                System.out.println("За " + f + " месяцев, сумма накоплений составит " + VkladBegin3);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача № 7.") ;
        int DayMonth = 1;
        int fraiday  = DayMonth + 7 ; // счёечик пятниц в месяце. Рассчитанный день до следующей пятницы.
        //Цикл дней месяца, если день месяца равен рсссчитаному дню до следующей пятницы,
        // значит скгодня отчётный день.
        for (DayMonth = 1; DayMonth <= 31 ; DayMonth++   ) {
            if (DayMonth == fraiday) {
                fraiday = DayMonth + 7;
                System.out.println("Сегодня пятница, отчётный день " + DayMonth + " е число," +
                    "нужно подготовить отчёт.");
            }
        }
     }
     public static void task8(){
        System.out.println("Задача № 8.") ;
        short Yar = 2023 ;
        byte Period = 79 ;
        int TimePrilet = 0 ;
        //Расчёт времнени прилёта кометы за последние 200 летот тнкущего года.
        while (TimePrilet <= Yar + 100 - Period) {
            TimePrilet = Period + TimePrilet ;
            // Расчёт времкни следующего прилёта кометы (2054 год.)
            if (Yar - 200 < TimePrilet) {
                System.out.println("Год прилета кометы -  " + TimePrilet);
            }
        }
     }
}



