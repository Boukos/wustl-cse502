package hello;

import java.time.Duration;
import java.time.Instant;

//
// If you have red flags on this file
//    you probably do not have Java 8
//    If so, then install Java 8 and change eclipse to use it
//    See the videos on the course web page
//
public class Hello {

   public static void main(String[] args) throws InterruptedException {
      System.out.println("Hello world");
      Instant start = Instant.now();
      Thread.sleep(1500);   // sleep for 1.5 seconds
      Instant end = Instant.now();
      
      Duration between = Duration.between(start, end);
      System.out.println("Time spent was " + between);
   }
}
