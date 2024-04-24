public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    static {
        var dog = 8.0;
        var cat =3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2; //kg
        var secondBoxer = 82.7; //kg
        var totalWeight = firstBoxer + secondBoxer;
        var deltaWeight = Math.abs(firstBoxer - secondBoxer);
        System.out.println(totalWeight);
        System.out.println(deltaWeight);

        var remOfDiv = secondBoxer % firstBoxer;
        System.out.println(remOfDiv);

        var totalTime = 640; //часов
        var oneTime = 8; //часов
        var numberOfEmploy = totalTime / oneTime;
        System.out.println("Всего роаботников в компании — " + numberOfEmploy + " человек");

        numberOfEmploy = numberOfEmploy + 94;
        totalTime = numberOfEmploy * 8;
        System.out.println("Если в компании работает " + numberOfEmploy + " человек, то всего " +totalTime + " часов работы может быть поделено между сотрудниками.");
    }
}