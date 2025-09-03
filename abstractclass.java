

abstract class Main{
       abstract void KK();

}

class abstrackintclass extends Main{

    
  int $_j,k;
        void KK(){
            $_j =k= 6;
            System.out.print($_j+k);
        }
    
}

class abstractclass{
    public static void main(String[] args){
    abstrackintclass m=new abstrackintclass();
    m.KK();
    for(int i=0;i<m.$_j;i++){
        System.out.print(m.$_j);
    }
    }
}