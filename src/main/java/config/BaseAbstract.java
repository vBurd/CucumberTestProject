package config;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;



public abstract class BaseAbstract {
    protected static Logger logger;
    protected static Properties properties;

    private static String baseUrl;
    public BaseAbstract() {
        logger  = LogManager.getLogger(this.getClass());

//        properties = new Properties();
//        try {
//            properties.load(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(
//                    System.getProperty("test.env") + ".properties")));
//            properties.putAll(System.getProperties());
//            baseUrl = properties.getProperty("wf.url");
//        } catch (IOException e) {
//            logger.error(e.getMessage());
//        }
    }
}
