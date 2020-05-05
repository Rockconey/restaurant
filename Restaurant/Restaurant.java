package Restaurant;

import javax.swing.*;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args){
        Menu dinner = new Menu("5/4/20");

        MenuItem  prosciuttoAndOlives = new MenuItem("Prosciutto and Olives", 18.52, "Appetizers");
        prosciuttoAndOlives.setDescription("Black and green olives stuffed with garlic and blue cheese wrapped in freshly farmed prosciutto");
        dinner.addToMenu(prosciuttoAndOlives);


        MenuItem ravioli = new MenuItem("Ravioli", 22.50, "Main Course");
        ravioli.setDescription("Ravioli cooked al dente and filled with goat cheese and dressed with a warm apricot compote. Served with artisan bread.");
        dinner.addToMenu(ravioli);

        MenuItem calfLiver = new MenuItem("Calf Liver D'onorio", 32.98, "Main Course");
        calfLiver.setDescription("Calf liver fresh from organic, grass-fed beef. Fresh from the farm and cooked in sherry and served with sauteed onions and braised mushrooms");
        calfLiver.setIsNew(false);
        dinner.addToMenu(calfLiver);


        MenuItem strawberryKiwi = new MenuItem("Strawberry Savarin", 17.25, "Dessert");
        strawberryKiwi.setDescription("This yeast-leavened delicacy is incredibly buttery and wonderfully rich.");
        dinner.addToMenu(strawberryKiwi);

        System.out.println(dinner.toString());
        dinner.removeFromMenu(calfLiver);
        System.out.println(dinner.toString());
        System.out.println(ravioli);

        //Bonus:

        dinner.addToMenu(prosciuttoAndOlives);
        System.out.println(dinner);





    }
}
