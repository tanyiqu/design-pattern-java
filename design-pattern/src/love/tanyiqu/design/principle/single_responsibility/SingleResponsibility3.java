package love.tanyiqu.design.principle.single_responsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

/**
 * 分析：
 * 这种方法没有对原来的类做大的修改
 * 没有在类的级别上做到单一职责原则，但是在方法级别上遵守了单一职责原则
 */


class Vehicle2 {
    public void runRoad(String vehicleName) {
        System.out.println(vehicleName + " 正在路上运行...");
    }

    public void runAir(String vehicleName) {
        System.out.println(vehicleName + " 正在天空运行...");
    }

    public void runWater(String vehicleName) {
        System.out.println(vehicleName + " 正在水上运行...");
    }
}

