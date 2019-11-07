package gildedRose;

public class GildedRose_1 {
	 Item[] items;

	    public GildedRose_1(Item[] items) {
	        this.items = items;
	    }
	    public void legaliseItemQuality(Item item) {
	      if(item.quality > 50) item.quality = 50;
	      if(item.quality < 0) item.quality = 0;
	    }
	    
	    public int backstagePassssSellInModifier(int sellIn) {
	    	int modifier = 1 ;
	    	if (sellIn  < 11) modifier++;
	        if (sellIn  < 6) modifier++;
	    	return modifier;
	    }

	     public void qualityModifier(Item item,int modifier1,int modifier2) {
	       	item.quality = (item.sellIn < 0) ? item.quality+modifier1 : item.quality+modifier2;
	    }

	    public void backstagePassesHandler(Item pass) {
	        qualityModifier(pass,0,backstagePassssSellInModifier(pass.sellIn));
	    }    
	    public void agedBrieHandler(Item brie) {
	    	qualityModifier(brie,2,1);
	    }
	    
	    public void conjuredItemHandler(Item conjuredItem) {
	        qualityModifier(conjuredItem,-4,-2);
	    }
	    
	    public void defaultItemHandler(Item defaultItem) {
	        qualityModifier(defaultItem,-2,-1);
	    }
	    
	    public void updateQuality() {
	        for (int i = 0; i < items.length; i++) {
	           if(!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
	        	  if (items[i].name.equals("Aged Brie"))agedBrieHandler(items[i]);
	              else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert"))backstagePassesHandler(items[i]);
	              else if(items[i].name.contains("Conjured"))conjuredItemHandler(items[i]);
	              else defaultItemHandler(items[i]);
	              legaliseItemQuality(items[i]);
	              items[i].sellIn--;
	           }
	        }
	    }
}
