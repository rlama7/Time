/**
* Time.java   --A program to calculate time taken to run an operation
* @author       Ratna Lama
* @version      1.0
* @since        07/11/2017
*/

class Time {
   public static void main(String[] args) {


        long startTime, endTime;
        long totalTime = 0;

      //Stopwatch timer = new Stopwatch().start();
      startTime = System.nanoTime();

      long total = 0;
      for (int i = 0; i < 1000000000; i++) {
         total += i;
      }

      //timer.stop();
      endTime = System.nanoTime();
      totalTime = endTime - startTime;
      //System.out.println(timer.getElapsedTime());
      System.out.println("The time taken is: " + totalTime);
   }
}
