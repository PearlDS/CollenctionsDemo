import java.util.Objects;

public class Tribute {

    private String name;
    private int age;
    private char meatQuality;

    public Tribute(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tribute(String name, int age, char meatQuality) {
        this.name = name;
        this.age = age;
        this.meatQuality = meatQuality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getMeatQuality() {
        return meatQuality;
    }

    public void setMeatQuality(char meatQuality) {
        this.meatQuality = meatQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tribute)) return false;
        Tribute tribute = (Tribute) o;
        return getAge() == tribute.getAge() && getName().equals(tribute.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Tribute{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", meatQuality=" + meatQuality +
                '}';
    }

    //@Override
   // public int compareTo(Tribute o) {
        //if you want based on int
        //return this.age -o.getAge();
        //if you want based on String
     //   return -(this.name.compareTo(o.getName()));
   // }
}
