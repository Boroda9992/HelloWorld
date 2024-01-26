public class Main {
    public static void main(String[] args) {
        // HelloWorld

        // System.out.println("Привет мир!");
        // System.out.println("Hello world!");
        // System.out.println("Hola Mundo!");
        // System.out.println("Dia duit ar domhan!");
        // System.out.println("Ciao mondo!");

        //EndOfTask

        // VariablesDeclaration

        //Task1_Declaration
        System.out.println("Задача 1. Объявляем переменные, используя var");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task2_VariablesPlus4
        System.out.println("Задача 2. Прибавляем ко всем по 4");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

        //Task3_VariablesMinusX
        System.out.println("Задача 3. Вычитаем из каждого разное значение");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);

        //Task4_Friend
        System.out.println("Задача 4. Объявляем переменную friend. Увеличиваем на 2. Делим на 7. Последовательно выводим результаты в консоль.");

        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);

        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);

        //Task5_frog
        System.out.println("Задача 5. Объявляем переменную frog. Увеличиваем в 10 раз. Делим на 3.5. Прибавляем 4. Последовательно выводим результаты в консоль. Постигаем силу Ctrl+C/Ctrl+V");

        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);

        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);

        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);

        //Task6_boxers
        System.out.println("Задача 6. Объявляем переменные boxer1 и boxer2. Суммируем их значения. Находим разницу их значений. Последовательно выводим результаты в консоль. Постигаем силу Ctrl+C/Ctrl+V");

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        System.out.println("boxer1 weight = " + boxer1);
        System.out.println("boxer2 weight = " + boxer2);

        var totalWeight = boxer1 + boxer2;
        System.out.println("Total weight of both fighters is: " + totalWeight);

        var diffWeight = boxer2 - boxer1;
        System.out.println("Their weight difference is: " + diffWeight);

        //Task7_weightDifference
        System.out.println("Задача 7. Берем переменные boxer1 и boxer2 из кода выше. Находим разницу их значений с помощью вычитания и деления без остатка. Последовательно выводим результаты в консоль. Постигаем силу Ctrl+C/Ctrl+V");

        var weightDiff1 = boxer2 - boxer1;
        System.out.println("boxer2 - boxer1 = " + weightDiff1);

        var weightDiff2 = boxer2 % boxer1;
        System.out.println("boxer2 % boxer1 = " + weightDiff2);

        //Task8_hoursAndPersonal
        System.out.println("Задача 8. Вычисляем сколько сотрудников в кампании, если по 8 часов они нарабатывают вместе 640 за день. Вычисляем, сколько часов отработает штат на 94 человека больше. Последовательно выводим результаты в консоль. Постигаем силу Ctrl+C/Ctrl+V");

        var hours = 640;
        var emps = hours / 8;
        System.out.println("Всего работников в кампании - " + emps + " человек");

        emps = emps + 94;
        hours = emps * 8;

        System.out.println("Если в компании работает " + emps + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками ");

        //EndOfLesson

















    }
}