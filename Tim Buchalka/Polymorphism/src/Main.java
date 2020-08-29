
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }

}

class Avengers extends Movie {
    public Avengers() {
        super("Avengers");
    }

    @Override
    public String plot() {
        return "Earths mightiest heroes fight of space invaders";
    }
}

class IronMan extends Movie {
    public IronMan() {
        super("Iron Man");
    }

    @Override
    public String plot() {
        return "A billionaire engineer makes a flying suit and becomes superhero";
    }
}

class MissionImpossible extends Movie {
    public MissionImpossible() {
        super("Mission Impossible");
    }

    @Override
    public String plot() {
        return "An IMF agent does things that are impossible to do for the good";
    }
}

class Inception extends Movie {
    public Inception() {
        super("Inception");
    }

    @Override
    public String plot() {
        return "An architect plants an idea in someone elses mind when he's asleep";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    //No plot method
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Avengers();
            case 2:
                return new IronMan();
            case 3:
                return new MissionImpossible();
            case 4:
                return new Inception();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
