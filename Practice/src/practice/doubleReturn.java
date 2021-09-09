
package practice;

//int x,y;
class double1{
//     double1(int a,int b){
//         
//     }
    int[] Function(int a,int b){
//x=a;
//y=b;
int[] Ans = new int[2];
        Ans[0]= a+b;
        Ans[1]=a-b;
        return Ans;
   // }
}
}
public class doubleReturn {
    

    public static void main(String[] args) {
       
       double1 obj = new double1();
       int ans[]=obj.Function(10, 5);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
        
    
    //double1 obj=new double1(10,5);
       //

}