package example;

public class C {
    static C REGULAR = new C() {
        @Override
        protected void method() {
        }
    };

    static C WILDCARD = new C() {
        @Override
        protected void method() {
        }

        @Override
        protected void method2() {
        }
    };

    protected void method() {
    }

    protected void method2() {
    }
}
