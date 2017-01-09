
package designpattern1;
import designpattern1.FactoryPattern.*;

public class DesignPattern1 {

   
    public static void main(String[] args) {
      
      
//X x=new X();
//X.Y y=x.new Y();
       
     FactoryPattern t1 =new FactoryPattern();
     FactoryPattern.ShapeFactory sf=t1.new ShapeFactory();
     
     Shape  sh1 = sf.getShape("CIRCLE");
     sh1.draw();
     Shape sh2 = sf.getShape("RECTANGLE");
     sh2.draw();
     Shape sh3 = sf.getShape("SQUARE");
     sh3.draw();
     
     
       
       
        
    }
    
}
