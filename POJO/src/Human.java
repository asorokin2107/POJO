public final class Human {
    private final String name;
    private final int age;
    private final String getName;


    public Human(String name, int age, String getName) {
        this.name = name;
        this.age = age;
        this.getName = getName;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getGetName() {
        return getName;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", getName='" + getName + '\'' +
                '}';
    }
}
