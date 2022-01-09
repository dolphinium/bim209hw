package edu.estu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


@AllArgsConstructor
@NoArgsConstructor
public class Pizza {
    @Setter
    @Getter
    private Size size;

    @Setter
    @Getter
    private Thickness doughThickness;

    @Getter
    @Setter
    private String ingredients;

    private Calendar creationTime;

    private Calendar deliveryTime;


    public Pizza(Size size, Thickness doughThickness, String ingredients) {
        this.size = size;
        this.doughThickness = doughThickness;
        this.ingredients = ingredients;
    }


    public String getCreationTime() {
        creationTime = Calendar.getInstance();
        return dateFormatter(creationTime);
    }

    public void setDeliveryTime(int minutesLater) {
        deliveryTime = Calendar.getInstance();
        deliveryTime.add(Calendar.MINUTE, minutesLater);
        dateFormatter(deliveryTime);
    }

    public void setDeliveryTime(int hoursLater, int minutesLater) {
        deliveryTime = Calendar.getInstance();
        deliveryTime.add(Calendar.HOUR, hoursLater);
        deliveryTime.add(Calendar.MINUTE, minutesLater);
        dateFormatter(deliveryTime);
    }

    public String getDeliveryTime() {
        return dateFormatter(deliveryTime);
    }


    public String dateFormatter(Calendar cal) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return dateFormat.format(cal.getTime());
    }

    public void printPizzaSpecs() {
        System.out.println("Size: " + size);
        System.out.println("Dough thickness: " + doughThickness);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Creation time: " + getCreationTime());
        System.out.println("Delivery time: " + getDeliveryTime());
    }

    public String printPizzaSpecsToTxt() {
        return "Size: " + size + "\n" +
                "Dough thickness: " + doughThickness + "\n" +
                "Ingredients: " + ingredients + "\n" +
                "Creation time: " + getCreationTime() + "\n" +
                "Delivery time: " + getDeliveryTime() + "\n" +
                "**********************************************************"
                + "\n";

    }

}
