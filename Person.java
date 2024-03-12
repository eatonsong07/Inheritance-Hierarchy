public class Person {
    private int age;
    private String name;
    private boolean school;

    public Person(String a, int b){
        name=a;
        age=b;
        System.out.println("Person");
    }

    public String toString(){
        if(school){
            return "My name is " + name + ". I am " +age +". I go to school!";
        }
        return "My name is " + name + ". I am " +age +".";
    }

}
