class ShampooRefill {

    static String brandName="xyz";
    static String productName="abcd";
    static String packType="refine";
    static String modelDescription="hard hair";
    static String appliedFor="strong hair";
    static String hairType="white hair";
    static int priceINR=444;

    public static void main(String args[]) {

        brandName = "Dabur";
        productName = "Almond Intense Repair Shampoo";
        packType = "Refill Pack";
        modelDescription = "Nourished & Smooth Hair | Almond Protein";
        appliedFor = "Damage Repair";
        hairType = "All Hair Types";
        priceINR = 233;

        System.out.println("Brand Name : " + brandName);
		System.out.println("Another Brand Name : " + ShampooRefill.brandName);

        System.out.println("Product Name : " + productName);
		System.out.println("Another Product Name : " +ShampooRefill.productName);

        System.out.println("Pack Type : " + packType);
	    System.out.println("Another Pack Type : " +ShampooRefill.packType);

        System.out.println("Model Description : " + modelDescription);
		System.out.println("Another Model Description : " + ShampooRefill.modelDescription);

        System.out.println("Applied For : " + appliedFor);
		System.out.println("Another Applied For : " + ShampooRefill.appliedFor);

        System.out.println("Hair Type : " + hairType);
        System.out.println("Another Hair Type : " +ShampooRefill.hairType);

        System.out.println("Price : Rs. " + priceINR);
		System.out.println("Another Price : Rs. " +ShampooRefill.priceINR);

    }
}
