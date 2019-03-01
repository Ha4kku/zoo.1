public class Giraffe extends Animal{

    public Giraffe (String name){
        super(name, "leaves");
    }

    public void eat (String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)){
            super.eat("leaves");
        }else {
            System.out.println("YUCK ! ! ! " + name + " will not eat " + food);
        }
    }
}
