/**
 * @author Jim
 * @Description 单一职责原则
 * 方案一不遵守单一职责原则
 * @createTime 2022年08月12日
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("轮船");
        vehicle.run("飞机");

    }
}

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " 在路上跑的飞快");
    }
}
