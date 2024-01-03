public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

        // Задача 3
        var dogFloat = dog - 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog - 3.5 = " + dogFloat);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);

        // Задача 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend + 2 = " + friend);
        var friendFloat = friend / 7;
        System.out.println("friend / 7 = " + friendFloat);

        // Задача 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // Задача 6
        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        System.out.println("Общая масса бойцов = " + (massBoxer1 + massBoxer2));
        System.out.println("Разница между массами бойцов = " + (massBoxer2 - massBoxer1));

        // Задача 7
        System.out.println("Вычитание из большей массы меньшей = " + (massBoxer2 - massBoxer1));
        var gapMass = massBoxer2 % massBoxer1;
        System.out.println("Разница. Остаток от деления = " + gapMass);

        // Задача 8
        var countHours = 640;
        var perDay = 8;
        var countEmployees = countHours / perDay;
        System.out.println("Всего работников в компании - " + countEmployees + " человек");
        countEmployees += 94;
        countHours = countEmployees * perDay;
        System.out.println("Если в компании работает " + countEmployees
                + " человек, то всего " + countHours
                + " часов работы может быть поделено между сотрудниками");
    }
}