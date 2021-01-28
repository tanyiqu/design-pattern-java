package love.tanyiqu.design.principle.single_responsibility;


public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 分析：
 * 输出会出现 “飞机在路上运行”
 * 违反单一职责原则
 * 改进：
 * 将各个交通工具分离出来
 */


class Vehicle {
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在路上运行...");
    }
}