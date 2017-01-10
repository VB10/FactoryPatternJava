//oluşturduğunuz java dosyasının ismi gelecek buraya
package designpattern1;

public class FactoryPattern {
    
    //bir kalıp oluşturuyoruz ve diğer sınıflar bu kalıpta oluşacak diyoruz
    public  interface Shape {
        void draw();
    }
    
    //Olşuturduğumuz kalıptan çağırıyoruz ve içini buna göre dolduruyoruz
    public class Rectangle implements Shape {
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
    
    //Ana sınıfımız ile Dizayn sınıfmız arasındaki köprü
    //Gelen veriye göre işlem yapıp geri döndürüyor.
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
