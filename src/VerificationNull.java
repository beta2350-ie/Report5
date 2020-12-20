public class VerificationNull {
    class Sample{
        public int i;
        public void print(){
            System.out.println("Hello, World!");
        }
    }
    public static void main(String[] args){
    Sample hoge=null;
    //System.out.println(hoge.i);//1
    //hoge.print();              //2
    throw null;                //3
    }
}
