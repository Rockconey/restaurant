package Restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {

        private Date lastUpdated;
        private ArrayList<Object> smallBites;
        private ArrayList<Object> plates;
        private ArrayList<Object> dessert;
        private String hours;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    protected void setLastUpdated(Date aDate){
        this.lastUpdated = aDate;
    }

    public ArrayList<Object> getSmallBites(){
        return smallBites;
    }
/*I was unsure of the best way to do this. Setting the list equal to one item didn't seem right. So I went with add.
    I would like feedback.*/
    protected void setSmallBites(ArrayList<Object> aSmallBite){
        this.smallBites.add(aSmallBite);
    }

    public ArrayList<Object> getPlates(){
        return plates;
    }

    protected void setPlates(ArrayList<Object> aPlate){
        this.plates.add(aPlate);
    }

    public ArrayList<Object> getDessert(){
        return dessert;
    }

    protected void setDessert(ArrayList<Object> aDessert){
        this.dessert.add(aDessert);
    }

    public String getHours(){
        return hours;
    }

    protected void setHours(String aHours){
        this.hours = aHours;
    }
}
