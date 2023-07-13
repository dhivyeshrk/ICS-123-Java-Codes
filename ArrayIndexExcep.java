class ArrayIndexException extends Exception{
    int ind;
    int n;
    int[] arr=new int[n];
    ArrayIndexException(int ind, int n)
    {
        this.ind=ind;
        this.n=n;
    }
    public String toString(){
        return "Invalid index " + ind + " for array of length " + n;
    }
}
class ExceptionDemo{
    int compute(int arr[], int i) throws ArrayIndexException{
        if(arr.length<=i){
            throw new ArrayIndexException(i, arr.length);
        }
        else return arr[i];
    }
}
public class ArrayIndexExcep{
    public static void main(String[] args)
    {
        ExceptionDemo d = new ExceptionDemo();
        int[] arr = new int[2];
        try {
            d.compute(arr, 11);
        } catch (ArrayIndexException e) {
            System.out.println(e.toString());
        }
    }
}
