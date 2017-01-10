
package designpattern1;
//Dizayn sınıfımızı dahil ediyoruz
import designpattern1.FactoryPattern.*;

public class DesignPattern1 {   
    public static void main(String[] args) {
      
      //Farklı sınıflar arasında işlem yaparken alttaki gibi kullanmanız gerekiyor
    //X x=new X();
    //X.Y y=x.new Y();
       
     FactoryPattern t1 =new FactoryPattern();
     //ortak olan metodu çağırıyoruz 
     FactoryPattern.ShapeFactory sf=t1.new ShapeFactory();
     
     //Nesneleri  oluşturup  getshape diyerek calistiriyoruz ve artık hazır
     Shape  sh1 = sf.getShape("CIRCLE");
     sh1.draw();
     Shape sh2 = sf.getShape("RECTANGLE");
     sh2.draw();
     Shape sh3 = sf.getShape("SQUARE");
     sh3.draw();
    }
    
}
