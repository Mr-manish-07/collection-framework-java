package Practice.Map.HashMap;

import java.util.Objects;

public class classHashMap {

    private String name;
    private int id;

    public classHashMap(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        classHashMap other = (classHashMap) obj;
        return other.getId() == this.id && Objects.equals(this.name, other.name);
    };

    @Override
    public String toString() {
        return "Name is ->" + this.name + " :: id is -> " + this.id ;
    }
}
