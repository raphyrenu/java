package Damas;

public class Student extends Person {
   private String school;
   private String combination;
   public String level;


    public Student(int id, String firstName, String lastName, int age, String school,String combination, String level) {

       super(id, firstName, lastName, age);

//        this.setId(id);
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
        this.combination=combination;
        this.level=level;
        this.school=school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", combination='" + combination + '\'' +
                ", level='" + level + '\'' +
                super.getFirstName()+" "+
                super.getLastName()+ " "+
                super.getId()+
                '}';
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
