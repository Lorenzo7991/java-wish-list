package org.exercise.model;

public class Gift {
    //Attributes
    private String giftName;

    public Gift(String giftName){
        this.giftName = giftName;
    }


    //Getter and Setter methods
    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    //Override gift name format
    @Override
    public String toString(){
        return giftName;
    }
}
