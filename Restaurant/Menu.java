package Restaurant;
import javax.swing.*;
import java.util.ArrayList;

public class Menu {

        private String lastUpdated;
        protected ArrayList<Object> menu = new ArrayList<>();


    public Menu(String lastUpdated){
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    protected void setLastUpdated(String aDate){
        this.lastUpdated = aDate;
    }

    public void removeFromMenu(Object aMenuItem){
       menu.remove(aMenuItem);

    }

    protected void addToMenu(MenuItem aMenuItem){
        if(menu.contains(aMenuItem)) {
            System.out.println("Warning: Menu already contains " + aMenuItem.getName());
        } else {
            menu.add(aMenuItem);
        }
    }

        public boolean equals(Object toBeCompared){
            if (toBeCompared == this){
                return true;
            }
            if (toBeCompared == null){
                return false;
            }
            if (toBeCompared.getClass() != getClass()){
                return false;
            }

        Menu thisMenu = (Menu) toBeCompared;
        return thisMenu.lastUpdated.equals(getLastUpdated());
    }

    public String toString(){
        StringBuilder results = new StringBuilder("");
        for (Object item : menu) {
            results.append("Last updated: ").append(lastUpdated).append("\n").append("***** \n").append(item.toString());
        }
        return results.toString();
    }

}





