import java.util.Stack;
public class StackDemo2 {
    public static void main(String[] args)
    {
        Stack<Character> st = new Stack<Character>();
        //push, pop, peek, empty are the only stack exclusive operations. 
        //Stack is not strictly LIFO in collections.  
        st.push('a');
        st.push('b');
        st.push('c');
        st.add(1, 's');
        st.pop();
        System.out.println("Contents of stack : "+st);
        System.out.println("peeking into the stack : " + st.peek());
        System.out.println("Is the stack empty ? " + st.empty());
        System.out.println("is 'a' present in the stack ? " + st.search('a')); //search returns the index of element from top starting with 1.
        System.out.println("Is 'z' present in the stack? " + st.search('z'));
        System.out.println(st.capacity()); //Initially, the capacity of the stack is 10
        
        Character[] arr = new Character[st.size()];
        st.copyInto(arr);
        System.out.print("Contents of duplicate stack : ");
        for(int i=0;i<st.size();i++) System.out.print(arr[i] + " ");

    }
    
}
