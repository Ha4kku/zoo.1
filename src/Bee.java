public class Bee extends Animal{
    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            super.eat("pollen");
        }else {
            System.out.println("YUCK ! ! ! " + name + " will not eat " + food);
        }
    }

    public void sleep (){
        System.out.println(name + " never sleeps ");
    }
}
