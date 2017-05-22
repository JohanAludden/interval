package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public interface Endpoint {

    int getValue();

    String getBoundedLowerString();
    String getBoundedUpperString();

    boolean isBoundedLower(int value);

    boolean isBoundedUpper(int value);
}
