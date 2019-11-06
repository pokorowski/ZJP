//asciidoc markdown
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
 
    @Test
    public void tSetItemQualityTo0IfQualityBelowAcceptableRange() {
     int ItemQuality = -1;
     int check = app.legaliseItemQuality(ItemQuality);
     assertEquals(check,0);
    }

    @Test
    public void SetItemQualityTo50IfQualityBeyondAcceptableRange() {
     int ItemQuality = 51;
     int check = app.legaliseItemQuality(ItemQuality);
     assertEquals(check,50);
    }
    
    @Test
    public void DoNotChangeItemQualityIfQualityIsInRange() {
     int ItemQuality = 45;
     int check = app.legaliseItemQuality(ItemQuality);
     assertEquals(check,ItemQuality);
    }
    
    @Test
    SetQualityModifierTo1IfsellInIsGreaterThan11(){
     assertEquals(backstagePassssSellInModifier(12),1);
    }

    @Test
    SetQualityModifierTo2IfsellInIsBetween5And11(){
     assertEquals(backstagePassssSellInModifier(6),1);
    }
    

    @Test
    SetQualityModifierTo3IfsellInIsLesserThan6(){
     assertEquals(backstagePassssSellInModifier(5),3);
    }
    
    @Test
    AddFirstModifierToItemQualityIfsellInIsNegative(){
     int itemQuality = items[4];
     int changedQuality = qualityModifier(item[4],-1,2);
      assertEquals(changedQuality);
    }

    @Test
    AddSecondModifierToItemQualityIfsellInIsNonNegative(){
    

    }



}   
    