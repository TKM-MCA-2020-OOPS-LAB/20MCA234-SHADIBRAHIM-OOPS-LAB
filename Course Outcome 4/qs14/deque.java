import java.util.*;
public class deque {
    public static void main(String[] args) {
        int choice;
        String element;
        Deque<String> deque= new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("1.INSERT THE ELEMENT AT FIRST");
            System.out.println("2.INSERT THE ELEMENT AT LAST");
            System.out.println("3.REMOVE THE ELEMENT AT FIRST");
            System.out.println("4.REMOVE THE ELEMENT AT LAST");
            System.out.println("5.DISPLAY");
            System.out.println("6.EXIT");
            System.out.println("\nENTER THE CHOICE:");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1: System.out.println("ENTER THE ELEMENT TO BE INSERTED AT FIRST:");
                        element = sc.next();
                        deque.addFirst(element);
                        break;
                case 2: System.out.println("ENTER THE ELEMENT TO BE INSERTED AT LAST:");
                        element = sc.next();
                        deque.addLast(element);
                        break;
                case 3: System.out.println("ELEMENT DELETED FROM THE FIRST POSITION");
                        deque.removeFirst();
                        break;
                case 4: System.out.println("ELEMENT DELETED FROM THE LAST POSITION");
                        deque.removeLast();
                        break;
                case 5: System.out.println("PRINT ELEMENTS:");
                        System.out.println(deque+"\n");
                        break;
                case 6: System.exit(0);
                        break;
                default:System.out.println("INVALID CHOICE");
            }
        }while(true);
    }
    
}
