package org.anthonyBrown.practiseWork;

public class studentClass2 {
    // 数据结构实训
    private String name;
    private String gender;
    private int age;

    public studentClass2() {
    }

    public studentClass2(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // 比较
    public boolean equals(studentClass2 studentClass2) {
        if (this.name.equals(studentClass2.name) && this.gender.equals(studentClass2.gender) && this.age == studentClass2.age){
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return "studentClass2{name = " + name + ", gender = " + gender + ", age = " + age + "}";
    }
}
