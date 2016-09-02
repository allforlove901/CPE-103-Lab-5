import java.util.*;

public class AQueueClient{
   public static void main (String[] args){
      AQueue<Double> queue = new AQueue<Double>(5);
      Scanner s = new Scanner(System.in);

      while(s.hasNext()){
         try{
            queue.enqueue(Double.parseDouble(s.next()));
         }
         catch(NumberFormatException n){
            continue;
         }
         catch(NoSuchElementException ns){
            queue.printArray();
         }
      }
   }
}
