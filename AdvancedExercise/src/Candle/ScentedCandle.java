package Candle;

//File: ScentedCandle.java
public class ScentedCandle extends Candle {
 private String scent;

 public String getScent() {
     return scent;
 }

 public void setScent(String scent) {
     this.scent = scent;
 }

 @Override
 public void setHeight(int height) {
     super.setHeight(height);
     super.price = height * 3.0;
 }
}
