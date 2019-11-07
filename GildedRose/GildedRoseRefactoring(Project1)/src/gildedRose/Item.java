package gildedRose;

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

    protected void legaliseItemQuality() {
      if(quality > 50) quality = 50;
      if(quality < 0)  quality = 0;
    }
    
    protected void legaliseAndDecSellIn(){
      legaliseItemQuality();
      sellIn--;
    }
      
    protected void qualityModifier(int modifier1,int modifier2) {
      quality = (sellIn < 0) ? quality+modifier1 : quality+modifier2;
    }
    
    public void dailyUpdate() {
      qualityModifier(-2,-1);
      legaliseAndDecSellIn();
    }
}
