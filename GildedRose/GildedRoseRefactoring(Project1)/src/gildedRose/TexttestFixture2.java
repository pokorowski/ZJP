package gildedRose;

public class TexttestFixture2 {
	 public static void main(String[] args) {
	       

	        Item[] items = new Item[] {
	                new Item("+5 Dexterity Vest", 10, 20), //
	                new AgedBrie("Aged Brie", 2, 0), //
	                new Item("Elixir of the Mongoose", 5, 7), //
	                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80), //
	                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
	                new BackStagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
	                new BackStagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
	                new BackStagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49),
	                new Conjured("Conjured Mana Cake", 3, 6) };

	        GildedRose_2 app = new GildedRose_2(items);

	        int days = 9;
	        if (args.length > 0) {
	            days = Integer.parseInt(args[0]) + 1;
	        }

	        for (int i = 0; i < days; i++) {
	            System.out.println("-------- day " + i + " --------");
	            System.out.println("name, sellIn, quality");
	            for (Item item : items) {
	                System.out.println(item);
	            }
	            System.out.println();
	            app.updateQuality();
	        }
	    }
}
