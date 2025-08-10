import java.io.*;
import java.util.*;
class multiplication Table
{
public static void main(String args[])
int m,n;
Scanner s=new scanner(System.in);
System.out.println("enter m value");
m=s.nextint();
System.out.println("enter n value");
n=s.nextint();
do
{
for(int i=1;i<=10;i++)
System.out.println("m+"*"+ i+"="+(m*i));
m++;
}
while(m<n);
}
}