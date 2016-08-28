 import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Samp
{
public static void main(String args[])
{
int n1,i,fact=1;
Scanner s=new Scanner(System.in);
n1=s.nextInt();
for(i=1;i<=n1;i++)
{
    fact=i*fact;
}
System.out.println(fact);
}
}
