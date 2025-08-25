class A{
    String t="...";

}

class D extends A{
    String t=".";
    void show(){
        System.out.println(super.t);
    }
}

public class Main{
    public static void main(String[] args){
    D m=new D();
    m.show();
    }
   
}