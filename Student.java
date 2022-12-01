package lesson5;

public class Student {
    private String firstname;
    private String lastname;
    private int age;


    public Student(String fullname, String jobtitle, int age) {
        firstname = fullname;
        this.lastname = jobtitle;
        this.age = age;
    }

    public String getFullname() {
        return firstname;
    }

    public void setFullname(String fullname) {
        firstname = fullname;
    }

    public String getJobtitle() {
        return lastname;
    }

    public void setJobtitle(String jobtitle) {
        this.lastname = jobtitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Fullname='" + firstname + '\'' +
                ", jobtitle='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
