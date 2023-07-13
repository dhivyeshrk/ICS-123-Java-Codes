import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
// import Stack.StackDemo1;
class Student{
    String name;
    double cgpa;
    Student(String name, double cgpa)
    {
        this.name = name;
        this.cgpa = cgpa;
    }
    String getName(){
        return name;
    }
}
class StudentComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2) //compare is a built in method of Comparator interface.
    {
        if(s1.cgpa < s2.cgpa) return 1;
        else if(s1.cgpa > s2.cgpa) return -1;
        return 0;
    }
}
public class PriorityQueueDemo{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Student> pq = new PriorityQueue<>(5, new StudentComparator());
        Student student1 = new Student("Name1", 4.2);
        pq.add(student1);
        Student student2 = new Student("Name2", 10.0);
        pq.add(student2);
        Student student3 = new Student("Name3", 5.3);
        pq.add(student3);
        System.out.println("Students in their priority order: ");
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll().getName());
        }   
    }
}