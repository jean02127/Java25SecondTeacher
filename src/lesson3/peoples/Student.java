package lesson3.peoples;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.setSchool(school);
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void introduce() {
        System.out.println("我是學生" + super.getName() + "，今年" + super.getAge() +"歲，就讀於" + this.getSchool() + "。");

        // 由於沒覆寫getName()、getAge()，所以可用this.getName()、this.getAge()
        // System.out.println("我是學生" + this.getName() + "，今年" + this.getAge() +"歲，就讀於" + this.getSchool() + "。");
    }
}