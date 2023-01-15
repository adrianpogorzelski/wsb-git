package devices;

import java.sql.SQLOutput;
import java.util.List;

public class Phone extends Device {
    public Double screenSize;
    public Boolean isAndroid;
    private static final Double DEFAULT_APP_VERSION = 1.0;
    private static final String DEFAULT_APP_SERVER = "https://randomappserver.com/";

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }

    public void installAnApp(String name, Double version, String server) {
        System.out.println("Sprawdzanie płatności...");
        System.out.println("Sprawdzanie kontroli rodzicielskiej...");
        System.out.println("Sprawdzanie dostępnego miejsca w pamięci...");
        System.out.println("Łączenie z serwerem " + server + "...");
        System.out.println("Sprawdzanie dostępności wersji " + version + "...");
        System.out.println("Instalowanie aplikacji " + name + "...");
        System.out.println("Gotowe!");
    }

    public void installAnApp(String name, Double version) {
        installAnApp(name, version, DEFAULT_APP_SERVER);
    }

    public void installAnApp(String name) {
        installAnApp(name, DEFAULT_APP_VERSION, DEFAULT_APP_SERVER);
    }

    public void installAnApp(List<String> names) {
        for(String appName : names) {
            this.installAnApp(appName);
        }
    }
}
