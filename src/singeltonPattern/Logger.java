package singeltonPattern;
/*Singilton patten, sinifin yalnız bir obyektinin yaradılmasına zəmanət verən dizayn nümunəsidir.
Bu nümunədə, sinfin konstruktorunu özəl olaraq təyin etməklə, digər nümunələrin qarşısını almaqla
sinfin yalnız bir nümunəsi yaradılır.*/
public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println(message);
    }
}
