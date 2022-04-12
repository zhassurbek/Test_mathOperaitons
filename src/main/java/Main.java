import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Started the main...");
        logger.trace("This is trace from main");
        Dog dog = new Dog("Charlie");
        dog.makeSound();
        logger.error("Might be error here...");

        dog.notMakeSound();

    }

}


