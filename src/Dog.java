public class Dog extends Pet{

    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public void voice(){
        System.out.println("Hello, Woof ");
    }
}
