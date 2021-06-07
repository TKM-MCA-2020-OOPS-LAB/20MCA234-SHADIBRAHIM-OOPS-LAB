import Arithmetic.arithmeticoperations;
public class Operation {
    public static void main(String args[])
    {
        arithmeticoperations obj=new arithmeticoperations();
        System.out.println("ARITHMETIC OPERATIONS"+"\n"+"---------------------------");
        System.out.println("\nAddition"+"\n"+"-------------");
        obj.add();
        System.out.println("\nSubtraction"+"\n"+"-------------");
        obj.sub();
        System.out.println("\nMultiplication"+"\n"+"-------------");
        obj.mul();
        System.out.println("\nDivision"+"\n"+"-------------");
        obj.div();


    }
    
}
