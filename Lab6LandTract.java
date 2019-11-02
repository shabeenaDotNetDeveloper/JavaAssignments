/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class Lab6LandTract {
 private double length;
    private double width;
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        
        
        this.width = width;
    }
   
    
    public Lab6LandTract(double inLength, double inWidth){
        
        this.length = inLength;
        this.width = inWidth;
        
    }
    
    public double tractArea()
    {
        return (this.length * this.width);
    }

    @Override
    public String toString() {
        return "Dimensions Of Tract Land: " + "Length=" + this.length + ", Width=" + this.width;
    }
    
    public boolean equals(Lab6LandTract landTract){
        if(this.tractArea() == landTract.tractArea()){
            return true;
        }
        else 
            return false;
        
    }
    
    
    
}
