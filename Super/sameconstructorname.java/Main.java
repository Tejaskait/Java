class A{
    A(){
        System.out.println("A");
    }
}
class D extends A{
    D(){
        super();
        System.out.println("D");
    }
}

class Main{
    public static void main(String[] args){
        D m=new D();
    }
}