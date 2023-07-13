class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "MyException[" + detail + "]";
    }

}
class ExceptionDemo{
    void compute(int a ) throws MyException{
        if(a<0){
            throw new MyException(-2);
        }
    }
}
public class User_Exception1{
    public static void main(String[] args)
    {
        ExceptionDemo e = new ExceptionDemo();
        try{
            e.compute(-100);
        }
        catch(MyException ex)
        {
            System.out.println("Exception encountered" + ex);
        }
    }
}
//HOMEWORK
//WRITE PROGRAM FOR ArrayIndexOutOfBounds