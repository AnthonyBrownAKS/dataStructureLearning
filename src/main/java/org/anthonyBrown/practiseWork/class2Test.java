package org.anthonyBrown.practiseWork;

public class class2Test {
    public static void main(String[] args) {
        studentClass2 sc1 = new studentClass2("汪首正","男",22);
        studentClass2 sc2 = new studentClass2("安东尼","男",23);

        class2List cl = new class2List();
        cl.insert(sc1);
        cl.insert(sc2);

        cl.printList();


    }
}
