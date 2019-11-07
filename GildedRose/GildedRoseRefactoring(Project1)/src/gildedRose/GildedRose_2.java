package gildedRose;

public class GildedRose_2 {
	 Item[] items;

	    public GildedRose_2(Item[] items) {
	        this.items = items;
	    }
	  
	    public void updateQuality() {
	    	for (Item item : items) {
				item.dailyUpdate();
			}
	    }
}