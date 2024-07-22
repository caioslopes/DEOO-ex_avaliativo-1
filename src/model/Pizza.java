package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String cheese;
    private List<String> toppings;
    private SizeType size;
    private CrustType crust;

    private Pizza(String cheese, List<String> toppings, SizeType size, CrustType crust) {
        this.cheese = cheese;
        this.toppings = toppings;
        this.size = size;
        this.crust = crust;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public SizeType getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", addTopping=" + toppings +
                ", size=" + size +
                ", crust=" + crust +
                '}';
    }

    public static class Builder{

        private String cheese;
        private List<String> toppings;
        private SizeType size;
        private CrustType crust;

        public Builder(){
            this.cheese = "mussarela";
            this.toppings = new ArrayList<>();
            this.size = SizeType.DEFAULT;
            this.crust = CrustType.THIN;
        }

        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder addTopping(String topping){
            this.toppings.add(topping);
            return this;
        }

        public Builder size(SizeType size){
            this.size = size;
            return this;
        }

        public Builder crust(CrustType crust){
            this.crust = crust;
            return this;
        }

        public Pizza build(){
            return new Pizza(this.cheese, this.toppings, this.size, this.crust);
        }

    }

}
