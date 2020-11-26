public class Pet extends Animal{
    private String name;
    boolean isVaccinated;

    public Pet(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name=name;
        this.isVaccinated=isVaccinated;
    }

    public void voice(){
        if(!name.equals("")) {
            System.out.println("Hello, my name is " + name);
            return;
        }
        System.out.println("Hello, i am pet, but my parents didn't give me a name");
    }
}
