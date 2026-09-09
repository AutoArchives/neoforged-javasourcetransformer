package example;

public class C {
    static C INSTANCE = new C() {
        @Override
        public void method() {
        }
    };

    protected void method() {
    }
}
