class TestC
{
int a,b,total;
TestC(int x,int y)
{
a=x;
b=y;
}
void sum()
{
total=a+b;
System.out.println(total);
}
}

class Example1
{
public static void main(String args[])
{
TestC d=new TestC(8,9);
d.sum();

} 
}