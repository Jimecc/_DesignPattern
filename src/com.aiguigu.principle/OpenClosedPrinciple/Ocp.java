import java.awt.*;

/**
 * @author Jim
 * @Description OpenClosedPrinciple 开闭原则
 * @createTime 2022年08月12日
 */
public class Ocp {

    public static void main(String[] args) {

    }
}

class GraphicEditer{
    public void deawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }
        else if(s.m_type == 2){
            deawCircle(s);
        }
    }

    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }

    public void deawCircle(Shape r){
        System.out.println("圆形");
    }
}

class Shape{
    int m_type;
}