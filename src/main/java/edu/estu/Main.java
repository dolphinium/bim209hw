package edu.estu;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("pizza-records.txt");

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.start();
        Pizza pizza = new Pizza();
        pizza.setSize(Size.MEDIUM);
        pizza.setDoughThickness(Thickness.THIN);
        pizza.setDeliveryTime(4, 30);
        pizza.setIngredients("Tomato sauce, mozzarella");
        pizzaBuilder.pizzaReady();
        pizza.printPizzaSpecs();
        fw.write(pizza.printPizzaSpecsToTxt());

        pizzaBuilder.stop();
        System.out.println("************************************************");

        Pizza pizza2 = new Pizza();
        pizzaBuilder.start();
        pizzaBuilder.pizzaReady();
        pizza2.setSize(Size.SMALL);
        pizza2.setDoughThickness(Thickness.MEDIUM);
        pizza2.setDeliveryTime(3, 30);
        pizza2.setIngredients("Tomato sauce, mozzarella, olives, bacon, ham, corn");
        pizza2.printPizzaSpecs();
        fw.write(pizza2.printPizzaSpecsToTxt());
        pizzaBuilder.stop();

        System.out.println("************************************************");

        Pizza pizza3 = new Pizza(Size.MEDIUM, Thickness.THICK, "Tomato sauce, mozzarella, mushrooms, olives, ham, cheddar, extra cheese");
        pizzaBuilder.start();
        pizzaBuilder.pizzaReady();
        pizza3.setDeliveryTime(0);
        pizza3.printPizzaSpecs();
        pizzaBuilder.remainingRunningLow("Tomato sauce");
        fw.write(pizza3.printPizzaSpecsToTxt());
        pizzaBuilder.stop();


        System.out.println("************************************************");

        // Remake specification of pizza machine
        pizzaBuilder.start();
        pizzaBuilder.pizzaReady();
        pizzaBuilder.remakeThePizza(pizza3);
        pizzaBuilder.stop();
        System.out.println("************************************************");


        Pizza pizza4 = new Pizza();
        pizzaBuilder.start();
        pizzaBuilder.pizzaReady();
        pizza4.setSize(Size.LARGE);
        pizza4.setDoughThickness(Thickness.THICK);
        pizza4.setDeliveryTime(3, 30);
        pizza4.setIngredients("Tomato sauce, mozzarella, ham, olives, mushrooms, pineapple, onions, peppers");
        pizza4.printPizzaSpecs();
        fw.write(pizza4.printPizzaSpecsToTxt());
        pizzaBuilder.stop();

        System.out.println("************************************************");


        Pizza pizza5 = new Pizza();
        pizzaBuilder.start();
        pizzaBuilder.pizzaReady();
        pizza5.setSize(Size.LARGE);
        pizza5.setDoughThickness(Thickness.THICK);
        pizza5.setDeliveryTime(3, 30);
        pizza5.setIngredients("Tomato sauce, mozzarella, ham, olives, mushrooms, onions, peppers, pineapple, sausage, bacon");
        pizza5.printPizzaSpecs();
        fw.write(pizza5.printPizzaSpecsToTxt());
        pizzaBuilder.stop();

        System.out.println("************************************************");


        fw.close();

    }


}
