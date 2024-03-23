package BuilderDesignPattern;

public class Student {
    int id;
    int age;
    int gradYear;
    String name;

    private Student(Builder b){
        this.id = b.id;
        this.age = b.age;
        this.gradYear = b.gradYear;
        this.name = b.name;
    }

    static Builder getInstance(){
        return new Builder();
    }

    static class Builder{

        int id;
        int age;
        int gradYear;
        String name;

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            if( this.age < 0 ){
                throw new RuntimeException("Invalid Age");
            }
            return new Student(this);
        }

    }

}
