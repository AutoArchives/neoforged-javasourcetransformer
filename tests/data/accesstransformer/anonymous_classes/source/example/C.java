package example;

public class C {
    static C INSTANCE = new C() {
        @Override
        protected void method() {
        }
    };

    protected void method() {
    }
}
