package com.principles.e_commerceplatform;

class Electronics extends Product implements Taxable {
	public Electronics(String productId, String name, double price) {
		super(productId, name, price);
	}

	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10; // 10% discount
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.18; // 18% tax
	}

	@Override
	public String getTaxDetails() {
		return "Electronics Tax: 18%";
	}
}