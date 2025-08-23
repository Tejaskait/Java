class SUPER{
    public void a(){

    }
}

class D extends SUPER{
           public void a(){
                super.a();
             }
}

public class Main{  
    public static void main(String[] args){
        D m = new D();
        m.a();
    }
}