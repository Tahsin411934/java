
// Name:Abrar Fahim
//Id:1903710201853

package university_assignment_01;


import java.util.Scanner;


class Area{
    
    float length,breadth;
    
    void SetDim(float le,float br){
        length=le;
        breadth=br;
    }
   float getArea(){
       return length*breadth;
   }
    
}

public class Main {
    public static void main(String[] args) {
        Area object=new Area();
        float length,breadth;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert your leangth");
        length = input.nextFloat();
        System.out.println("Insert your breadth");
        breadth=input.nextFloat();
        object.length=length;
        object.breadth=breadth;
        
        System.out.println("The area of a rectangle  :  "+object.getArea());
                
    }
}


