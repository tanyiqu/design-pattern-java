package love.tanyiqu.design.principle.single_responsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

/**
 * 分析：
 * 不会出现错误
 * 但是花销很大
 * 改进：SingleResponsibility3
 */


class RoadVehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在路上运行...");
    }
}

class AirVehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在天空运行...");
    }
}

class WaterVehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在水上运行...");
    }
}