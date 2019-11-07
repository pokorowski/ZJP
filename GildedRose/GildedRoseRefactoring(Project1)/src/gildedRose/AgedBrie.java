package gildedRose;

public class AgedBrie extends Item {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}
    
	@Override
	public void dailyUpdate() {
		qualityModifier(2,1);
		legaliseAndDecSellIn();
    }
}
