package model;

import java.util.Objects;
import java.util.StringJoiner;

public class Trainee implements Comparable<Trainee>{
    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Trainee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Trainee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("location='" + location + "'")
                .toString();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Trainee trainee)) return false;

        return id == trainee.id && Objects.equals(name, trainee.name) && Objects.equals(location, trainee.location);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(location);
        return result;
    }

    public int compareTo(Trainee trainee) {
        int locCom = this.location.compareTo(trainee.location);
        if (locCom != 0) {
            return locCom;
        } else {
            return this.id-trainee.id;
        }
    }
}
