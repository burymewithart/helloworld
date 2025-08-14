import java.security.AllPermission;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxerNumberOneWeight = 78.2;
        var boxerNumberTwoWeight = 82.7;

        var totalWeight = boxerNumberOneWeight + boxerNumberTwoWeight;
        System.out.println("Общая масса бойцов - " + totalWeight + " кг");

        var diffWeight = boxerNumberTwoWeight - boxerNumberOneWeight;
        System.out.println("Разница между массами бойцов - " + diffWeight + " кг");

        System.out.println("Задание 7");
        var remainder = boxerNumberTwoWeight % boxerNumberOneWeight;
        System.out.println("Остаток от деления масс боксеров - " + remainder + " кг");

        System.out.println("Задание 8");
        var allEmployeesFullTime = 640;
        var oneEmployeeJobTime = 8;
        var totalEmployeesInTheCompany = allEmployeesFullTime / oneEmployeeJobTime;
        System.out.println("Всего работников в компании - " + totalEmployeesInTheCompany + " человек");

        totalEmployeesInTheCompany = totalEmployeesInTheCompany + 94;
        System.out.println(totalEmployeesInTheCompany);
        var totalTime = totalEmployeesInTheCompany * oneEmployeeJobTime;
        System.out.println("Если в компании работет " + totalEmployeesInTheCompany + " человек, то всего " + totalTime + " часа работы может быть поделено между сотрудниками");
    }
}