package Candle;

//File: Candle.java
public class Candle {
 private String color;
 private int height;
 protected double price;

 public String getColor() {
     return color;
 }

 public int getHeight() {
     return height;
 }

 public double getPrice() {
     return price;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public void setHeight(int height) {
     this.height = height;
     this.price = height * 2.0;
 }
}
