package singeltonPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();
        logger.log("Bu bir log mesajidir!");
    }
}
