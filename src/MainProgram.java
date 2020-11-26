public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Обычное животное : ");
        Animal animal = new Animal(412,10,60.0,"Orange");
        animal.voice();
        System.out.println("Кот : ");
        Cat cat = new Cat(152,54,4.0,"Black","Jeffry",true);
        cat.voice();
        System.out.println("Собака : ");
        Dog dog = new Dog(621,4,8.0,"Black","George",true);
        dog.voice();
        System.out.println("Крокодил : ");
        Crocodile crocodile= new Crocodile(51,2,21.0,"Green",true);
        crocodile.voice();
        System.out.println("Рыба : ");
        Fish fish = new Fish(10,1,0.5,"Blue",false);
        fish.voice();
        System.out.println("Жираф : ");
        Giraffe giraffe= new Giraffe(2213,4,120.5,"Orange",false);
        giraffe.voice();
        System.out.println("Собака-поводырь : ");
        GuideDog guideDog= new GuideDog(213,5,15,"White","Gogy",true,true);
        guideDog.voice();
        guideDog.getHome();
        System.out.println("Хомяк : ");
        Hamster hamster= new Hamster(31,2,1,"Black","Sunny",false);
        hamster.voice();
        System.out.println("Лев : ");
        Lion lion=new Lion(52,12,74.0,"Orange",true);
        lion.voice();
        System.out.println("Домашнее животное : ");
        Pet pet = new Pet(5234,2,63.0,"Blue","Gogy",false);
        pet.voice();
        System.out.println("Дикое животное : ");
        Wild wild = new Wild(21,3,12.0,"Red",true);
        wild.voice();
        System.out.println("Волк : ");
        Wolf wolf= new Wolf(2512,4,25.0,"Dark",true);
        wolf.voice();
    }
}
