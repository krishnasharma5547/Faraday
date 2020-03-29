package com.ai.faraday;

public class DelayThread extends Thread
{
  @Override
    public void run()
  {
      try {
          System.out.println("sleeping thread...");
          currentThread();
          sleep(1000000000);

      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}
