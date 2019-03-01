import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Zoo {
//    // global variable
//    private String favoriteFood = "bacon";
//
//    // sleep function
//    private void sleep(String name){
//        System.out.println(name + " sleeps for 8 hours");
//
//    }
//    // eat function
//    private void eat(String name, String food){
//        System.out.println(name + " eats " + food);
//
//        if(food.equals(favoriteFood)){
//            System.out.println("YUM! ! ! " + name + " wants more " + food);
//        }else {
//            sleep(name);
//        }
//
//    }
    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger" );
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear ("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        stinger.sleep();
        Zookeeper zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        zoebot.feedAnimals(animals, "pasta");

        }

}


//    // runner and tester
//    public static void main (String[] args){
//        Zoo z = new Zoo();
//
//        z.eat("Tigger" , "meat");
//        z.eat("Tigger" , "bacon");
//    }



