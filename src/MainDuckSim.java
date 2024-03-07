import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args){
        ArrayList<Duck> kaczki = new ArrayList<>();
        Duck kaczka1 = new MallardDuck(new Quack(), new FlyWithWings());
        kaczki.add(kaczka1);
        kaczki.add(new RubberDuck(new Squeak(),new FlyNoWay()));
        kaczki.add(new FakeDuck(new MuteQuack(),new FlyNoWay()));

        for (Duck a:kaczki){
            a.performFly();
            a.performQuack();
        }
        kaczki.get(1).setFlyBehaviour(new FlyBehaviour() {
            @Override
            public void fly() {
                System.out.println("naped odrzutowy");
            }
        });
        kaczki.get(1).performFly();
    }
}
