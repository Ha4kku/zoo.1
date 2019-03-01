public class Zookeeper {
    private String name;
    private String food;

    public Zookeeper (String name){
        this.name = name;
        this.food = food;

    }


    public void feedAnimals(Animal[] animals, String food){
        System.out.println(name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " total animals." );
        for (int x = 0; x < animals.length; x ++){
            animals[x].eat(food);
        }
    }
    
//    public void feedAnimals2 (String [] animals, String food){
//        System.out.println(name + " is feeding " + food + " to " + animals.length + " animals");
//        for (String i  : animals) {
//            animals[i].eat(food);
//        }
//    }
    // This method is an attempt at another solution to our eat problem
    // Make sure that you are dealing with integers when dealing with
    // string[variable].eat(food);

}
