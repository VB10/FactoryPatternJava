//burasi açtığınız java dosyasına göre değişecek
package designpattern1;
public class FactoryPattern {
    
    //bir kalıp oluşturuyoruz ve diyoruzki bundan türüyen herkesin draw adında 
    //bir metodu olsun
    public  interface Shape {
        void draw();
    }
    
    //Alttaki 3 class Shape'den kalıtım alarak draw metodlarının içini dolduruyoruz
    public class Rectangle implements Shape {
        //Shape int kullnarak metodumuzu dolduruyoruz
        @Override
        public void draw() {
            System.out.println("Rectangle Method");
        }    
    }
    public class Square implements Shape {

        @Override
        public void draw() {
            System.out.println("Square Method");
        }
        
    }
    public class Circle implements Shape {

        @Override
        public void draw() {
            System.out.println("Circle Method");
        }       
    }
    
    //olayın gerçekleştiği ortayı bulan sınıfmız ana sınıftan gelen isteği alıp yorumlayıp
    //ona göre döndürme işlemi yapıyor
    public class ShapeFactory extends FactoryPattern{   
        //get metodumuzun tipi shape turunden olacak
        
        public Shape getShape (String shapeType) {
            if (shapeType == null ) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            }
            else if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }
            else if(shapeType.equalsIgnoreCase("SQUARE")) {
                return new  Square();
            }
            return null;
            
        }
        
        
    }
    
    
}
