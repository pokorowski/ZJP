package gildedRose;

public class GildedRose_02 {
	Item[] items;

    public GildedRose_02(Item[] items) {
        this.items = items;
    }
    
    public void legaliseItemQuality(Item item) {
	      if(item.quality > 50) item.quality = 50;
	      if(item.quality < 0) item.quality = 0;
	    }
	    
	    public int backstagePassssSellInModifier(int sellIn) {
	    	int modifier = 0 ;
	    	if (sellIn  < 11) modifier++;
	        if (sellIn  < 6) modifier++;
	    	return modifier;
	    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
               
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                       if(!items[i].name.contains("Conjured")){
                         items[i].quality = items[i].quality - 1;
                       }else{
                         items[i].quality = items[i].quality - 2;
                           
                       }
                    }
                    legaliseItemQuality(items[i]);
            } else {
                
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    	items[i].quality = items[i].quality + backstagePassssSellInModifier(items[i].sellIn);
                    }
                    legaliseItemQuality(items[i]);
            }
            
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                if(!items[i].name.contains("Conjured")){
                                  items[i].quality = items[i].quality - 1;
                                }
                                else{
                                   if(items[i].quality <2 ){items[i].quality = 0;
                                   } else{items[i].quality = items[i].quality - 2;
                                   }
                                }
                                
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
