import java.sql.Driver;
import java.util.ServiceLoader;

public class SPIMain {

    public static void main(String[] args) {
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        for (Driver item: serviceLoader) {
            int majorVersion = item.getMajorVersion();
            System.out.println(majorVersion);
        }
    }
}
