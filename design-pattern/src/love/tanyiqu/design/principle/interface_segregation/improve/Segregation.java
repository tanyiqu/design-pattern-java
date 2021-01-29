package love.tanyiqu.design.principle.interface_segregation.improve;

public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.fun1(b);
        a.fun2(b);
        a.fun3(b);
        C c = new C();
        D d = new D();
        c.fun1(d);
        c.fun4(d);
        c.fun5(d);
    }
}

interface Interface1 {
    void fun1();
}

interface Interface2 {
    void fun2();

    void fun3();
}

interface Interface3 {
    void fun4();

    void fun5();
}

class A {
    void fun1(Interface1 interface1) {
        interface1.fun1();
    }

    void fun2(Interface2 interface2) {
        interface2.fun2();
    }

    void fun3(Interface2 interface2) {
        interface2.fun3();
    }
}

class C {
    void fun1(Interface1 interface1) {
        interface1.fun1();
    }

    void fun4(Interface3 interface2) {
        interface2.fun4();
    }

    void fun5(Interface3 interface2) {
        interface2.fun5();
    }
}

class B implements Interface1, Interface2 {
    @Override
    public void fun1() {
        System.out.println("B 实现 Interface1的 fun1");
    }

    @Override
    public void fun2() {
        System.out.println("B 实现 Interface2的 fun2");
    }

    @Override
    public void fun3() {
        System.out.println("B 实现 Interface2的 fun3");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void fun1() {
        System.out.println("D 实现 Interface1的 fun1");
    }

    @Override
    public void fun4() {
        System.out.println("D 实现 Interface3的 fun4");
    }

    @Override
    public void fun5() {
        System.out.println("D 实现 Interface3的 fun5");
    }
}