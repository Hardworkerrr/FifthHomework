public class Animal {
    private int id;
    private int age;
    private double weight;
    private String color;

    public Animal(int id,int age,double weight,String color){
        this.id=id;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public void voice(){
        System.out.println("Hello, i am an animal !");
    }



}
