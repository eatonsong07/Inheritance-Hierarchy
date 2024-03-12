
public class Main {
    public static void main(String[] args) {
        Person eaton= new Student("eaton", 17, 11, "Brooklyn Tech" );
        Student justin=new Student("Justin", 17, 11, "Brooklyn Tech");
        System.out.println(eaton.toString());
        School s=new School();
        s.enroll(justin);

        Person[] list=new Person[2];
        list[0]=eaton;
        list[1]=justin;
        for(Person a:list){
            System.out.println(a);
        }
    }
}
