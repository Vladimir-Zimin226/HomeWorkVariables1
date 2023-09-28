public class Main {
    public static void main(String[] args) {

        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Task 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerWeight = boxerOne + boxerTwo;
        var boxerWeightDifference = boxerTwo - boxerOne;
        System.out.println("Общая масса боксеров " + boxerWeight + " кг.");
        System.out.println("Разница в весе " + boxerWeightDifference + " кг.");

        //Task 7
        var boxerWeightDifference1 = boxerTwo - boxerOne;
        var boxerWeightDifference2 = boxerTwo % boxerOne;
        System.out.println("Разница в весе боксеров " + boxerWeightDifference1 + " кг.");
        System.out.println("Разница в весе боксеров " + boxerWeightDifference2 + " кг.");

        //Task 8
        var totalHours = 640;
        var workingDay = 8;
        var employees = totalHours / workingDay;
        System.out.println("Всего работников в компании — " + employees + " человек.");
        employees = employees + 94;
        workingDay = totalHours / employees;
        System.out.println("Если в компании работает " + employees + " человека, то всего " + workingDay + " часа работы может быть поделено между сотрудниками");

    }
}

