public abstract class Duck  {
 QuackBehaviour quackBehaviour;
 FlyBehaviour flyBehaviour;


 public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
  this.quackBehaviour = quackBehaviour;
  this.flyBehaviour = flyBehaviour;
 }

public void performQuack(){
  quackBehaviour.quack();
 }
 public void performFly(){
  flyBehaviour.fly();
 }
 public void performSwim(){
  System.out.println("plusk plusk");
 }

 public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
  this.quackBehaviour = quackBehaviour;
 }

 public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
  this.flyBehaviour = flyBehaviour;
 }
}

