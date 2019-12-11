package Problema6;

public class StateModel {
    private String description;
    private String shipping_zone_id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShipping_zone_id() {
        return shipping_zone_id;
    }

    public void setShipping_zone_id(String shipping_zone_id) {
        this.shipping_zone_id = shipping_zone_id;
    }

   /* @Override
    public String toString() {
        return "StateModel{" +
                ", description='" + description + '\'' +
                ", shipping_zone_id='" + shipping_zone_id + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "StateModel{" +
                "description='" + description + '\'' +
                ", shipping_zone_id='" + shipping_zone_id + '\'' +
                '}';
    }
}
