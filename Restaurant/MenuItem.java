package Restaurant;

public class MenuItem {

    private Boolean isNew = true;
    private Double price;
    private String description;
    private String category;

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
}
