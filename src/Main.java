import model.CrustType;
import model.Pizza;
import model.SizeType;

public class Main {
    public static void main(String[] args) {
        Pizza marguerita = new Pizza.Builder()
                .size(SizeType.LARGE)
                .crust(CrustType.THIN)
                .addTopping("tomate")
                .addTopping("manjericao")
                .build();

        System.out.println(marguerita);
    }
}