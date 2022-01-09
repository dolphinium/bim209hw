package edu.estu;


public class PizzaBuilder {
    Pizza pizza ;


    public PizzaBuilder() {

    }

    public void start(){
        System.out.println("Pizza machine is started!");
    }

    public void pizzaReady(){
        System.out.println("PIZZA MACHINE GIVES AUDIBLE WARNING! Your pizza is ready to deliver! PIZZA MACHINE GIVES AUDIBLE WARNING!");
    }

    public void stop(){
        System.out.println("Pizza machine is stopped for energy saving!");
    }

    public void remakeThePizza(Pizza pizza){
        System.out.println("Remaking the pizza!");
        this.pizza = new Pizza();
        pizza.printPizzaSpecs();
    }

    public void remainingRunningLow(String remaining){
        System.out.println(remaining+" running low!");
    }

}
