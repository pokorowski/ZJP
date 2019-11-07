package gildedRose;

public class Conjured extends Item  {

	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
	
	@Override
	public void dailyUpdate() {
		qualityModifier(-4,-2);
		legaliseAndDecSellIn();
	}
}
