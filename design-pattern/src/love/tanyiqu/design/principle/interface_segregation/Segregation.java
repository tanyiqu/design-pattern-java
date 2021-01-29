package love.tanyiqu.design.principle.interface_segregation;

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

interface Interface {
    void fun1();

    void fun2();

    void fun3();

    void fun4();

    void fun5();
}

class A {
    void fun1(Interface i) {
        i.fun1();
    }

    void fun2(Interface i) {
        i.fun2();
    }

    void fun3(Interface i) {
        i.fun3();
    }
}

class C {
    void fun1(Interface i) {
        i.fun1();
    }

    void fun4(Interface i) {
        i.fun4();
    }

    void fun5(Interface i) {
        i.fun5();
    }
}


class B implements Interface {
    @Override
    public void fun1() {
        System.out.println("B 实现 fun1");
    }

    @Override
    public void fun2() {
        System.out.println("B 实现 fun2");
    }

    @Override
    public void fun3() {
        System.out.println("B 实现 fun3");
    }

    @Override
    public void fun4() {
        System.out.println("B 实现 fun4");
    }

    @Override
    public void fun5() {
        System.out.println("B 实现 fun5");
    }
}

class D implements Interface {
    @Override
    public void fun1() {
        System.out.println("D 实现 fun1");
    }

    @Override
    public void fun2() {
        System.out.println("D 实现 fun2");
    }

    @Override
    public void fun3() {
        System.out.println("D 实现 fun3");
    }

    @Override
    public void fun4() {
        System.out.println("D 实现 fun4");
    }

    @Override
    public void fun5() {
        System.out.println("D 实现 fun5");
    }
}