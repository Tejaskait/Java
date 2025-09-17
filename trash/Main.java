import java.util.Scanner;

class Person{
    public static String personname;

    public Person(String p_name){
        this.personname = p_name;
    }
    public void details(String adhar,String gender,int dob,String city,int annualincome){
System.out.println("name is"+personname);

    }
}

class Main{
    public static void main(String[] args){
        Person p = new Person("tejas");
        Scanner sc= new Scanner(System.in);
        p.details("242342432","M",120904,"pune",80000);
    }
}