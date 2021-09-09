
package practice;

class abrar{
    
    int a,b;
    public abrar(int x,int y){
     a=x;
     b=y;
     
 }
    void Tahsin(abrar obj){
        obj.a=30;
        obj.b=50;
    }
 
}

public class changeTheValue {
    public static void main(String[] args) {
        
    
    abrar object=new abrar(10,5);
  
        System.out.println("Value of a : "+object.a +"Value of b is "+object.b);
        
    object.Tahsin(object);
            System.out.println("Value of a : "+object.a +"Value of b is "+object.b);
    } 
}
