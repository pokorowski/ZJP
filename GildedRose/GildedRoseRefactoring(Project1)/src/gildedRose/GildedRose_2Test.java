package gildedRose;

import static org.junit.Assert.*;
import org.junit.Test;

public class GildedRose_2Test {
    
	@Test
	public void tSetItemQualityTo0IfQualityBelowAcceptableRange() {
	     Item item = new Item("+5 Dexterity Vest", 10, -1);
	     item.legaliseItemQuality();
	     assertEquals(item.quality,0);
	}
	
	@Test
    public void SetItemQualityTo50IfQualityBeyondAcceptableRange() {
		  Item item = new Item("+5 Dexterity Vest", 10, 51);
		  item.legaliseItemQuality();
		  assertEquals(item.quality,50);
    }
    
    @Test
    public void DoNotChangeItemQualityIfQualityIsInRange() {
    	  Item item = new Item("+5 Dexterity Vest", 10, 45);
		  item.legaliseItemQuality();
		  assertEquals(item.quality,45);
    }
    
    @Test
    public void SetQualityModifierTo1IfsellInIsGreaterThan11(){
          BackStagePass item = new BackStagePass("BackStagePass", 12, 45);
          assertEquals(item.backstagePassssSellInModifier(),1);
    }

    @Test
    public void SetQualityModifierTo2IfsellInIsBetween5And11(){
         BackStagePass item = new BackStagePass("BackStagePass", 6, 45);
         assertEquals(item.backstagePassssSellInModifier(),2);
    }
    

    @Test
    public void SetQualityModifierTo3IfsellInIsLesserThan6(){
    	 BackStagePass item = new BackStagePass("BackStagePass", 5, 45);
         assertEquals(item.backstagePassssSellInModifier(),3);
    }
    
    @Test
    public void AddFirstModifierToItemQualityIfsellInIsNegative(){
    	  Item item = new Item("+5 Dexterity Vest", -1,10);
		  int quality = item.quality;
    	  item.qualityModifier(-5,-20);
		  assertEquals(item.quality,quality-5);
    }

    @Test
    public void AddSecondModifierToItemQualityIfsellInIsNonNegative(){
    	 Item item = new Item("+5 Dexterity Vest", 0,10);
		 int quality = item.quality;
   	     item.qualityModifier(-5,-20);
		 assertEquals(item.quality,quality-20);
    }
    
    @Test
    public void Substract2FromItemQualityIfIteamIsDefaultAndsellInIsNegative(){
    	 Item item = new Item("+5 Dexterity Vest", -1,10);
		 int quality = item.quality;
   	     item.dailyUpdate();
		 assertEquals(item.quality,quality-2);
    }
    
    @Test
    public void Substract1FromItemQualityIfIteamIsDefaultAndsellInIsNonNegative(){
    	 Item item = new Item("+5 Dexterity Vest", 0,10);
		 int quality = item.quality;
		 item.dailyUpdate();
		 assertEquals(item.quality,quality-1);
    }
    
    @Test
    public void Substract4FromItemQualityIfIteamIsConjuredAndsellInIsNegative(){
    	 Conjured item = new Conjured("Conjured", -1,10);
		 int quality = item.quality;
   	     item.dailyUpdate();
		 assertEquals(item.quality,quality-4);
    }
    
    @Test
    public void Substract2FromItemQualityIfIteamIsConjuredAndsellInIsNonNegative(){
    	 Conjured item = new Conjured("Conjured", 0,10);
		 int quality = item.quality;
		 item.dailyUpdate();
		 assertEquals(item.quality,quality-2);
    }
    
    @Test
    public void Add2ToItemQualityIfIteamIsAgedBrieAndsellInIsNegative(){
    	 Item item = new AgedBrie("AgedBrie", -1,10);
		 int quality = item.quality;
   	     item.dailyUpdate();
		 assertEquals(item.quality,quality+2);
    }
    
    @Test
    public void Add1ToItemQualityIfIteamIsAgedBrieAndsellInIsNonNegative(){
    	 Item item = new AgedBrie("AgedBrie", 0,10);
		 int quality = item.quality;
		 item.dailyUpdate();
		 assertEquals(item.quality,quality+1);
    }
    
    @Test
    public void Add1ToItemQualityIfIteamIsBackStagePassAndsellInIsGreaterThan10(){
    	 Item item = new BackStagePass("BackStagePass", 11,10);
		 int quality = item.quality;
   	     item.dailyUpdate();
		 assertEquals(item.quality,quality+1);
    }
    
    @Test
    public void Add2ToItemQualityIfIteamIsBackStagePassAndsellInIsBetween6And10(){
    	 Item item = new BackStagePass("BackStagePass", 6,10);
		 int quality = item.quality;
		 item.dailyUpdate();
		 assertEquals(item.quality,quality+2);
    }
    
    @Test
    public void Add3ToItemQualityIfIteamIsBackStagePassAndsellInIsBetween0And5(){
    	 Item item = new BackStagePass("BackStagePass", 0,10);
		 int quality = item.quality;
		 item.dailyUpdate();
		 assertEquals(item.quality,quality+3);
    }
    
    @Test
    public void SetItemQualityTo0IfIteamIsBackStagePassAndsellInIsNegative(){
    	 Item item = new BackStagePass("BackStagePass", -1,10);
		 item.dailyUpdate();
		 assertEquals(item.quality,0);
    }
}
