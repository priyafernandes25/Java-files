package myPackage;
public class Fibonacci extends Thread
{
    public void run() 
    {
        int n = 10, a = 0, b = 0, c = 1;
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println("Fibonacci Series:" + a);
        }
    }
}