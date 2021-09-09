
package practice;
 class Scope{
     int x=5,y=10;
     int method(int a,int b){
         this.x=100;
         //System.out.println(x);
         return x;
     }
 }

public class ScopeVariable {
    public static void main(String[] args) {
        Scope t=new Scope();
        
        System.out.println(t.method(0, 0));
    }
}
