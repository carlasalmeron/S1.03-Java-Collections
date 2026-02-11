package task1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Month name cannot be null");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Month month = (Month) object;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
