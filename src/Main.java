import org.w3c.dom.ls.LSOutput;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
}

class LordOfTheRings extends Movie{
    public LordOfTheRings(){
        super("Lord of the Rings");
    }

    @Override
    public String plot() {
        return "Hobbits deastroying ring";
    }
}
class LastSamurai extends Movie{
    public LastSamurai(){
        super("Last Samurai");
    }

    @Override
    public String plot() {
        return "A former USA soldier fights for samurai traditions";
    }
}

class WalterMitty extends Movie{
    public WalterMitty(){
        super("Walter Mitty");

    }
    public String plot(){
        return "Dumb man turns into bear grylls";
    }
}




public class Main {
    public static void main(String[] args) {


        int random = (int) (Math.random() * 5 + 1);
        System.out.println("Random number is " + random);

        public static Movie randomMovie(){
                switch (random) {
                    case 1:
                        return new LordOfTheRings();
                    case 2:
                        


                }
            }
        }
    }
