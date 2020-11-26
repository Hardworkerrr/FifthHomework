public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator=isPredator;
    }

    public void voice(){
        if(isPredator){
            System.out.println("Hello, i am a wild animal and i am angry");
            return;
        }
        System.out.println("Hello, i am a wild animal ");
    }
}
