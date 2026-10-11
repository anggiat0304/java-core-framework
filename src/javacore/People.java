package javacore;

public class People {
    private int id;
    private String name;
    private int age;
    private String gender;
    private int height;

    private static int numberOfPeople = 0 ;
    public People(String fieldName,
                  int fielddAge,
                  String fieldGender,
                  int fieldHeight) {
        name = fieldName;
        age = fielddAge;
        gender = fieldGender;
        height = fieldHeight;
        id = ++numberOfPeople;
    }
    public int getId() {
        return id;
    }
    public static int getNumberOfPeople() {
        return numberOfPeople;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
