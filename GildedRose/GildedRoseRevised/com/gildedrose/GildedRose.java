package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void legaliseItemQuality(Item item) {
      if(item.quality > 50) item.quality = 50;
      if(item.quality < 0) item.quality = 0;
    }
    
    public void backstagePassesHandler(Item pass) {
      pass.quality = (pass.sellIn <= 0) ? 0 : pass.quality+backstagePassssSellInModifier(pass.sellIn);
    }
    
    public int backstagePassssSellInModifier(int sellIn) {
    	int modifier = 1 ;
    	if (sellIn  < 11) modifier++;
        if (sellIn  < 6) modifier++;
    	return modifier;
    }
        
    public void agedBrieHandler(Item brie) {
    	brie.quality = (brie.sellIn < 0) ? brie.quality+2 : brie.quality+1;
    }
    
    public void conjuredItemHandler(Item conjuredItem) {
    	conjuredItem.quality = (conjuredItem.sellIn < 0) ? conjuredItem.quality-4 : conjuredItem.quality-2;
    }
    
    public void defaultItemHandler(Item defaultItem) {
    	defaultItem.quality = (defaultItem.sellIn < 0) ? defaultItem.quality-2 : defaultItem.quality-1;
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
