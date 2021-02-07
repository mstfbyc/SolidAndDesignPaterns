package com.bilgeadam.solid.openclose;

import java.util.List;

public class AreaService {

    //Buraya eklenen şekil ne olursa olsun bu metot değişmeli close
    public double calculateAreaBad(List<Object> shapes){
        double area =0;
        for (Object shape:shapes) {
            if(shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle)  shape;
                area += (rectangle.getLength()*rectangle.getHeight());
            }else if( shape instanceof Circle){
                Circle circle = (Circle) shape;
                area += circle.getRadius()*circle.getRadius()*Math.PI;
            }
        }
        return area;
    }

    public double calculateArea(List<Shape> shapes){
        double area = 0;
        for (Shape shape:shapes) {
            area += shape.getArea();
        }
        return area;
    }
}
