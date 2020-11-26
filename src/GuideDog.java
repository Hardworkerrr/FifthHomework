public class GuideDog extends Pet {
    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void voice() {
        System.out.println("Hello, I can take you home.");
    }

    public void getHome(){
        System.out.println("I am your guide dog, let's come home together");
    }
}
