class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println("Before: " + obj.value);
        modifyObject(obj);
        System.out.println("After: " + obj.value);
    }

    public static void modifyObject(MyClass obj) {
        obj.value = 20;
    }
}
