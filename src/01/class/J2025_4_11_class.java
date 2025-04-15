
public class J2025_4_11_class {
    public static vodi main(String[] args) {
        new SD();
        SD.m();
    }
}

abstract class SD {
    static  {
        System.out.println("running");
    }

    final int i = 0;
    public static void m() {
        System.out.println("m~~~~");
    }

    public void modifyI() {
        this.i = i;
    }

    public abstract void eat();
}


