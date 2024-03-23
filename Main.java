package BuilderDesignPattern;

public class Main {
    public static void main(String[] args){
        Student s1 = Student.getInstance()
                    .setId(13)
                    .setAge(26)
                    .setGradYear(2018)
                    .setName("Vijay")
                    .build();

        System.out.println("Debug");

    }
}
