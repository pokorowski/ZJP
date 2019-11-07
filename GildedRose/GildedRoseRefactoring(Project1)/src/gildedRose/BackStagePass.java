package gildedRose;

public class BackStagePass extends Item {

	public BackStagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public int backstagePassssSellInModifier() {
		int modifier = 1;
		if(sellIn < 11) modifier++;
		if(sellIn < 6) modifier++;
		return modifier;
	}

	@Override
	public void dailyUpdate() {
        qualityModifier(0,backstagePassssSellInModifier());
        legaliseAndDecSellIn();
	}

}
