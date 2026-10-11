package javacore;

public class OuterClass {
    String outerField = "outerField";
    static String staticOuterField = "staticOuterField";
    class InnerClass{
        void accessMember(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
    static class StaticInnerClass{
        void accessMember(OuterClass outerClass){
            System.out.println(outerClass.outerField);
            System.out.println(outerClass.staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("INNER CLASS");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMember();

        System.out.println("\nStatic Nested class");
        System.out.println("------------------");
        StaticInnerClass staticInnerObject = new StaticInnerClass();
        staticInnerObject.accessMember(outerObject);

        System.out.println("\nTTop-Level class");
        System.out.println("------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);

    }
}
