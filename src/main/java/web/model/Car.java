package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;
    private String color;
    private int price;

    public Car(){}

    public Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return ("model: "+this.model+" color: "+this.color+" price: "+this.price);
    }

}
