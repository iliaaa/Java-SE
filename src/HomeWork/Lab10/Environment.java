package HomeWork.Lab10;
import stub.Simulator;
import test.*;
import HomeWork.Lab10.Robot.Terminator;

public class Environment {
    public static void main(String[] args) {
        System.out.println(TestCase.startTestCase());
        System.out.println(TestChain.startTestChain());
        HomeWork.Lab10.Animal.Cat.sayHello();
        HomeWork.Lab10.Animal.Dog.sayHello();
        Terminator.sayHello();
    }
}
