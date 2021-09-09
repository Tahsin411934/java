
package practice;

class NotMain{
    int[] fun(int a,int b){
        int ans[]=new int[3];
        ans[0]=a-b;
        ans[1]=a+b;
        ans[2]=a*b;
       return ans;
    }
}

public class ReturnThree {
    public static void main(String[] args) {
        NotMain obj= new NotMain();
        int c[]=obj.fun(10,5);
        System.out.println(c[1]);
        System.out.println(c[0]);
        System.out.println(c[2]);
    }
}
