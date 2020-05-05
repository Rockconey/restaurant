package Restaurant;

import java.util.ArrayList;

public class MenuItem {

    private String name;
    private Boolean isNew = true;
    private Double price;
    private String description;
    protected String category;

    public MenuItem(String name, boolean isNew, double price, String description, String category){
        this.name = name;
        this.isNew = isNew;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public String getName(){
        return name;
    }
    protected void setName(String aName){
        this.name = aName;
    }

    public Boolean getIsNew(){
        return isNew;
    }

    protected void setIsNew(boolean aIsNew){
        this.isNew = aIsNew;
    }
    
    public Double getPrice(){
        return price;
    }
    
    protected void setPrice(Double aPrice){
        this.price = aPrice;
    }

    public String getDescription(){
        return description;
    }

    protected void setDescription(String aDescription){
        this.description = aDescription;
    }

    public String getCategory(){
        return category;
    }

    protected void setCategory(String aCategory){
        this.category = aCategory;
    }

    public String toString(){
        if (isNew){
            return "Category: " + category +  "\n" + "New! " + name  +  "\n" + "Price: " + price + "\n" + description + "\n";
        } else {
            return "Category: " + category +  "\n" + name  +  "\n" + "Price: " + price + "\n" + description + "\n";
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
        MenuItem theMenuItem = (MenuItem) toBeCompared;
        return theMenuItem.getDescription().equals(getDescription()) || theMenuItem.getName().equals(getName());
    }




}
