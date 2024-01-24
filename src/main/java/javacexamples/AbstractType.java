package javacexamples;

import java.io.Serializable;

public abstract class AbstractType {
    <T extends Comparable> T getType(String typeName) {
        return null;
    }

    abstract <T extends Comparable> T getInfo();
}
