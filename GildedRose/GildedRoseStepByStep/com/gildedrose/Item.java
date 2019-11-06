package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void legaliseItemQuality(Item item) {
      if(item.quality > 50) item.quality = 50;
      if(item.quality < 0) item.quality = 0;
    }

    public void qualityModifier(Item item,int modifier1,int modifier 2) {
      item.quality = (item.sellIn < 0) ? item.quality+modifier1 : item.quality+modifier2;
    }
}
