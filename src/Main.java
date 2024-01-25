public class Main {
    public static void main(String[] args) {

//        Задача 1
//        Объявите переменные типа int, byte, short, long, float, double.
//
//                Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
//
//                Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».

        System.out.println("Задача_1");
        System.out.println("_______________________________________________________");

        byte sack = 127;
        short box = 32766;
        int create = 2000000000;
        long garage = 9000000000000000000L;
        float warehouse = 7.7777777f;
        double storageComplex = 1.6161616161616161;

        System.out.println("byte: " + sack);
        System.out.println("short: " + box);
        System.out.println("int: " + create);
        System.out.println("long: " + "OVER" + garage);
        System.out.println("float: " + warehouse);
        System.out.println("double: " + storageComplex);
        System.out.println("_______________________________________________________");

//        Задача 2
//        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
//
//        Значения:
//
//        27.12
//        987 678 965 549
//        2,786
//        569
//        -159
//        27897
//        67

        System.out.println("Задача_2");
        System.out.println("_______________________________________________________");

        float FLT = 27.12F;
        long LNG = 987678965549L;
        double DBL = 2.786;
        int INT = 569;
        byte BYT = (byte) -159;
        short SRT = 27897;
        byte BYT2 = 67;

        System.out.println("FLT: " + FLT);
        System.out.println("LNG: " + LNG);
        System.out.println("DBL: " + DBL);
        System.out.println("INT: " + INT);
        System.out.println("BYT: " + BYT);
        System.out.println("SRT: " + SRT);
        System.out.println("BYT2: " + BYT2);

        System.out.println("_______________________________________________________");


//        Задача 3
//        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
//
//        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
//
//                Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
//
//        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
//
//        Для объявления переменных не используйте тип var.

        System.out.println("Задача_3");
        System.out.println("_______________________________________________________");

        // byte - потому, что в классе не может быть больше 127 учеников - в нормальных условиях. Особые условия не оговаривались,
        // поэтому не вижу смысла расходовать лишнюю память.

        byte lp = 23;
        byte as = 27;
        byte ea = 30;

        // int - потому что объем закупки бумаги обычно гораздо выше 480 листов, или просто может быть любым. Особенно в образовательных учреждениях.
        // Даже, если бумагу выдают только учителям для ведения отчетности =)

        int paperPerStudent = (lp + as + ea) % 480;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        System.out.println("_______________________________________________________");


//        Задача 4
//        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
//
//        за 20 минут,
//                в сутки,
//                за 3 дня,
//                за 1 месяц?
//                Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
//
//                Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
//
//        Для объявления переменных не используйте тип var.

        System.out.println("Задача_4");
        System.out.println("_______________________________________________________");

        // Выбрал int потому, что числа в задаче могут быть любыми. В реальности, промышленные машины, изготавливающие тару
        // могут производить много больше, как я понимаю.

        int bpm = 8;

        int min20 = bpm * 20;
        int day = (bpm * 60)*24;
        int dayX3 = day * 3;
        int dayX30 = day * 30;

        // Можно было бы использовать byte и short в первых двух случаях, но из-за 5 байт памяти пострадает читаемость кода.

        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок ");
        System.out.println("За сутки машина произвела " + day + " штук бутылок ");
        System.out.println("За 3 дня машина произвела " + dayX3 + " штук бутылок ");
        System.out.println("За месяц машина произвела " + dayX30 + " штук бутылок ");
        System.out.println("_______________________________________________________");

//        Задача 5
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски.
//        Сколько банок каждой краски было куплено?
//
//        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
//
//        Для объявления переменных не используйте тип var.

        System.out.println("Задача_5");
        System.out.println("_______________________________________________________");

        // Выбрал byte отталкиваясь от реальности. Здание школы обычно не перестраивают, так что расход краски не будет сильно прыгать, а судя по
        // условиям задачи - этот расход не долджен выходить за пределы вместимости byte. Иначе - кто-то закупает краску налево ;)

        byte bpPerClassR = 4;
        byte wpPerClassR = 2;
        byte classRooms = 120 / 6;
        byte whitePaint = (byte) (classRooms * wpPerClassR);
        byte brownPaint = (byte) (classRooms * bpPerClassR);

        System.out.println("В школе, где " + classRooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println("_______________________________________________________");

//        Задача 6
//        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
//
//        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
//
//        Бананы — 5 штук (1 банан — 80 грамм).
//                Молоко — 200 мл (100 мл = 105 грамм).
//                Мороженое-пломбир — 2 брикета по 100 грамм.
//                Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
//                Смешать всё в блендере — и готово.
//
//        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
//
//                Результат в граммах и килограммах напечатайте в консоль.

        System.out.println("Задача_6");
        System.out.println("_______________________________________________________");

        // выбрал int, потому что каллории нередко считают за длительный период - за месяц или год, например. Хранение больших чисел
        // вполне может потребоваться пользователю калькулятора каллорий.

        int bananaGr = 80;
        int milkGr = 105;
        int iceCreamGr = 100;
        int eggsGr = 70;

        // решил хранить количество продуктов в отдельных переменных, это позволит рассчитывать каллории для разных рецептов.

        int bananaPcs = 5;
        int milkPcs = 2;
        int iceCrPcs = 2;
        int eggsPcs = 4;

        int sumGr = (bananaGr * bananaPcs) + (milkGr * milkPcs) + (iceCreamGr * iceCrPcs) + (eggsGr * eggsPcs);
        float sumKg =  sumGr / 1000f;
        // решил, что доли килограмм будут не лишними в итоговом результатае.


        System.out.println("Общая массе рецепта в граммах: " + sumGr);
        System.out.println("Общая массе рецепта в граммах: " + sumKg);

        //Странно, что спортсмены считают граммы, а не каллории. По-моему, тут логичнее считать расход продуктов и планировать семейный бюджет.
        //И с числами работать удобно и пример поход на жизненный чуть больше =)
        System.out.println("_______________________________________________________");

//        Задача 7
//        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так,
//        чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//
//                Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть
//                на 500 грамм.
//
//                Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//
//                Результаты всех подсчетов выведите в консоль.

        System.out.println("Задача_7");
        System.out.println("_______________________________________________________");
        //Опять не экономлю память в угоду читаемости. При этом, вес спортсмена логично вычислять с точностью до грамма. Тип short позволит нам рассчитывать
        //в граммах вес спортсменов не превышающий примерно 32кг. Полагаю, что это не лучшее ограничение для спортивных взвешиваний и расчетов.

        int lwMin = 250;
        int lwMax = 500;
        int weight = 7;

        //Подумал, что значения могут быть самыми разными и не всегда получится целочисленный ответ.

        float lwMinDays = (float) (weight * 1000) / lwMin;
        float lwMaxDays = (float) (weight * 1000) / lwMax;

        float lwAwerage = lwMinDays / 2f + lwMaxDays / 2f;

        System.out.println("Если терять в день " + lwMin + " грамм, то сбросить " + weight + " килограмм получится через " + lwMinDays + " дней.");
        System.out.println("Если терять в день " + lwMax + " грамм, то сбросить " + weight + " килограмм получится через " + lwMaxDays + " дней.");
        System.out.println("В среднем, чтобы сбросить " + weight + " килограмм, потребуется " + lwAwerage + " дней.");

        System.out.println("_______________________________________________________");

//        Задача 8
//        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило:
//        чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет,
//        получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
//
//        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//
//                Маша получает 67 760 рублей в месяц.
//                Денис получает 83 690 рублей в месяц.
//                Кристина получает 76 230 рублей в месяц.

//        Каждому нужно увеличить зарплату на 10% от текущей месячной.
//
//        Дополнительно руководитель попросил посчитать разницу между годовым
//        доходом с нынешней зарплатой и после повышения.
//
//        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//
//                Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

        System.out.println("Задача_8");
        System.out.println("_______________________________________________________");

        int salMasha = 67760;
        int salDenis = 83690;
        int salKristina = 76230;

        int bonus = 10;

        int bSalMasha = salMasha + (salMasha / 100) * bonus;
        int bSalDenis = salDenis + (salDenis / 100) * bonus;
        int bSalKristina = salKristina + (salKristina / 100) * bonus;

        System.out.println("После повышения зарплаты, Маша будет получать " + bSalMasha + " рублей в месяц");
        System.out.println("После повышения зарплаты, Денис будет получать " + bSalDenis + " рублей в месяц");
        System.out.println("После повышения зарплаты, Кристина будет получать " + bSalKristina + " рублей в месяц");
        System.out.println(".....................................................................................");


        int yearSalMasha = salMasha * 12;
        int yearSalDenis = salDenis * 12;
        int yearSalKristina = salKristina * 12;

        System.out.println("До повышения, Маша получала в год " + yearSalMasha + " рублей");
        System.out.println("До повышения, Денис получал в год " + yearSalDenis + " рублей");
        System.out.println("До повышения, Кристина получала в год " + yearSalKristina + " рублей");
        System.out.println(".....................................................................................");


        int bYearSalMasha = bSalMasha * 12;
        int bYearSalDenis = bSalDenis * 12;
        int bYearSalKristina = bSalKristina * 12;

        System.out.println("После повышения, Маша получит за год " + yearSalMasha + " рублей");
        System.out.println("После повышения, Денис получит за год " + yearSalDenis + " рублей");
        System.out.println("После повышения, Кристина получит за год " + yearSalKristina + " рублей");
        System.out.println(".....................................................................................");

        int YearSalDiffMasha = bYearSalMasha - yearSalMasha;
        int YearSalDiffDenis = bYearSalDenis - yearSalDenis;
        int YearSalDiffKristina = bYearSalKristina - yearSalKristina;

        System.out.println("Разница между годовыми доходами до и после повышения, для Маши составит " + YearSalDiffMasha + " рублей");
        System.out.println("Разница между годовыми доходами до и после повышения, для Дениса составит " + YearSalDiffDenis + " рублей");
        System.out.println("Разница между годовыми доходами до и после повышения, для Кристины составит " + YearSalDiffKristina + " рублей");





        System.out.println("_______________________________________________________");

















    }
}