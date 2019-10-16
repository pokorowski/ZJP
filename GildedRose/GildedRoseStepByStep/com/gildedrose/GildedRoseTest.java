package com.gildedrose;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

public class GildedRoseTest {
    private Item[] items;
    private GildedRose app;
    
    @Before
    public void setUp() {
        items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), 
                new Item("Aged Brie", 2, 0), 
                new Item("Elixir of the Mongoose", 5, 7), 
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), 
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),              
                new Item("Conjured Mana Cake", 3, 6) };
        app = new GildedRose(items);
    }
 
   
}