public class Main extends CalculatorClass implements Calculator {
    public static void main(String[] args) {

        CalculatorClass c = new CalculatorClass() {
            @Override
            void add() {
                System.out.println("Add");
            }

            @Override
            void addNums() {
                System.out.println("AddNums");
            }
        };


    }

    @Override
    void addNums() {
        System.out.println("AddNums");
        super.subtractNums(1,2);
    }

    @Override
    int subtractNums(int a, int b) {
        return super.subtractNums(a, b);
    }

    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void subtract() {
        System.out.println("Subtract");
    }

    @Override
    public void multiply() {
        System.out.println("Multiply");
    }

    @Override
    public void divide() {
        System.out.println("Divide");
    }
}





interface Calculator {
    void add();
    void subtract();
    void multiply();
    void divide();
}

abstract class CalculatorClass {
    abstract void add();

    abstract void addNums();

    int subtractNums(int a, int b) {
        return a-b;
    }
}