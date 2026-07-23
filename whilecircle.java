//回文数
public class whilecircle{
  public static void mian(String[]args){
int x = 12345;
int temp = x;
int num = 0;
while(x != 0){
  int ge = x % 10;//从左到右获取每个数字
  x = x/10;
  num = num*10 + ge;
}
System.out.println(num);
System.out.println(x);
System.out.println(num == temp);
  }
}
