package example;

public class C {
    static C REGULAR = new C() {
        @Override
        public void method() {
        }
    };

    static C WILDCARD = new C() {
        @Override
        public void method() {
        }

        @Override
        public void method2() {
        }
    };

    protected void method() {
    }

    protected void method2() {
    }
}
