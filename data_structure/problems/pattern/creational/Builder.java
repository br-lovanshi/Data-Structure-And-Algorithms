package data_structure.problems.pattern.creational;

class Student{
    private int id;
    private String name;
    private int rollNumber;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.rollNumber = builder.rollNumber;
    }

    @Override
    public String toString(){
       return "Student {" + 
        " name: " + this.name + 
        " id: " + this.id + 
        " roll: " + this.rollNumber 
        + " }";
    }

    public static class Builder{
        private int id;
        private String name;
        private int rollNumber;

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setRollNumber(int rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }


}

public class Builder {
    public static void main(String[] args) {
        
        Student student = new Student.Builder().setId(3).build();
        System.out.println(student.toString());
    }
}
