package javacore;

public class TopLevelClass {
    void accessMembers(OuterClass outerClass) {
        System.out.println(outerClass.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
