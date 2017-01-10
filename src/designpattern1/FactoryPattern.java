package designpattern1;
public class FactoryPattern {
    
    public  interface Shape {
        void draw();
    }
    
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
