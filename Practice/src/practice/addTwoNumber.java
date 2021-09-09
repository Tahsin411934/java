
package practice;

class addTwoInt{
    int sum=0;
    public int addTwoInt(int a,int b){
        sum=a+b;
        return sum;
    }
     int addTwoInt(int a,int b,int c){
         sum=a+b+c;
         return sum;
     }
}


public class addTwoNumber {
    public static void main(String[] args) {
        addTwoInt obj= new addTwoInt();
       int sum1=obj.addTwoInt(10,20);
        System.out.println(sum1);
        int sum2=obj.addTwoInt(10, 20,15);
        System.out.println(sum2);
    }
}
