import java.util.Random;

public class ServerNameGenerator {
    //public static string 20 adjectives

    public static String[] adjectives = { "amazing", "beautiful", "clean", "drab", "elegant", "fancy", "glamorous", "handsome", "long", "magnificent", "old-fashioned", "plain", "quaint", "sparkling", "ugliest", "unsightly", "angry", "bewildered", "clumsy", "defeated", "embarrassed", "fierce", "grumpy", "helpless", "itchy", "jealous", "lazy", "mysterious", "nervous", "obnoxious", "panicky", "repulsive", "scary", "thoughtless", "uptight", "worried" };

    //public static string 20 nouns
    public static String[] nouns = {"   "
    };

    public static String generate() {
        Random rand = new Random();
        int rand1 = rand.nextInt(adjectives.length);
        int rand2 = rand.nextInt(nouns.length);
        return adjectives[rand1] + "-" + nouns[rand2];
    }
}



