import java.util.ArrayList;
import java.util.List;
class Producer extends Thread
{
    List<Integer> list;
    public Producer(List<Integer> list)
    {
        this.list=list;
    } 
    @Override
    public void run(){
        try{
            synchronized(list){
                while(true){
                    if(list.size()>0)
                        list.wait();
                    else 
                        produceItem();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    private void produceItem() throws InterruptedException{
        for(int i=1;i<=5;i++){
            Thread.sleep(1000);
            list.add(i);
            System.out.println("Added element in list by producer=" +i);
        }
        list.notifyAll();
        
    }
}
class Consumer extends Thread{
    List<Integer> list;
    public Consumer(List<Integer> list)
    {
        this.list=list;
    }
    public void run(){
        try{
            while(true){
                synchronized(list){
                    if(list.size()==0)
                        list.wait();
                    else
                        consume();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    private void consume() throws InterruptedException{
        while(!list.isEmpty()){
            Thread.sleep(1000);
            System.out.println("Removed element from list by consumer="+list.remove(0));
        }
        list.notifyAll();
        
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        Producer p=new Producer(list);
        Consumer c=new Consumer(list);
        p.start();
        c.start();    
    }
    
}
