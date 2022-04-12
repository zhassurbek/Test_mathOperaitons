import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Dog {

    String name;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Dog.class);

    // constructor


    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        logger.debug("Debugging makeSound()");
    }

    public void notMakeSound() {
        logger.info("Dog is quite");
    }
}
