package lesson3.peoples;

public class CollegeStudent extends Student {
    private String major;

    public CollegeStudent(String name, int age, String school, String major) {
        super(name, age, school);
        this.setMajor(major);
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("我是大學生" + super.getName() + "，今年" + 
            super.getAge() +"歲，就讀於" + super.getSchool() + "，主修" + this.getMajor() + "。");
    }
}