package Interfaces;
interface printable{
    void print();
    int b=99;
    int c=90;

}

public class A6  implements printable{
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
        System.out.println(b);
        System.out.println(c);
    }
}

