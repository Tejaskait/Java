class Voter{
    protected String vname;
    protected String vaddress;
    protected int vcontno;
    private int vadhar;

    public Voter(String vname,String vaddress,int vcontno,int vadhar){
        this.vname=vname;
        this.vaddress=vaddress;
        this.vcontno=vcontno;
        this.vadhar=vadhar;
    }
public int getadhar(){
    return vadhar;
}

}

class Mainu{
    public static void main(String args[]){
        Voter[] v=new Voter[10];
        v[0]= new Voter("Tejas","pune",7,424);

        
        try{
for(int i=0 ; i < 10 ;i++){
            System.out.println(v[i].vname);
            System.out.println(v[i].vaddress);
            System.out.println(v[i].vcontno);
            System.out.println(v[i].getadhar());
        }
        }
        catch(Exception e){
                    
        }

    }
}