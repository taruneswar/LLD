// A concrete class is a class that has an implementation for all of its methods. They cannot have any unimplemented methods.
// It can also extend an abstract class or implement an interface as long as it implements all their methods.
// It is a complete class and can be instantiated.

//Jave program to illustrate the concrete class
//public class Main {
//    static int product(int a, int b){
//        return a*b;
//    }
//    static int sum(int a, int b){
//        return a+b;
//    }
//    public static void main(String[] args) {
//        System.out.println(product(5,2));
//        System.out.println(sum(2,3));
//
//    }
//}
////////////////////////////////////////============================================//////////////////
//The code below illustrates a concrete class which extends an abstract class.
//The method product() in interface X is implemented by class Product but it does not implement method sum(), therefore it has to be abstract.
//Whereas class Main implements the unimplemented method sum(), therefore there are no unimplemented methods. Hence, it is a concrete class.
interface X{
    int product(int a, int b);
    int sum(int a, int b);
}

abstract class Product implements X{
    public int product(int a, int b){
        return a*b;
    }
}
public class Main extends Product{
    public int sum(int a ,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Main ob=new Main();
        int p=ob.product(10,5);
        int s=ob.sum(2,5);
        System.out.println(p);
        System.out.println(s);
    }
}