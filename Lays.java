class Lays {
    public static void main(String args[]) {

        String brandName = "Lays";
		
		String i1="potatoes";
		String i2="Edible";
		String i3="salt";
		String i4="chilli powder";
		String i5="onion powder";
		String i6="garlic powder";
		String i7="sugar";
		String i8="spices";
		

        String ingredients[] = {
           i1,i2,i3,i4,i5,i6,i7,i8
        };

        System.out.println("Brand name is " + brandName);

        System.out.println("List of ingredients are:");
		
		for(String ingrediant:ingredients){
			System.out.println(ingrediant);
		}
			

        /*String i1 = ingredients[0];
        System.out.println(i1);

        String i2 = ingredients[1];
        System.out.println(i2);

        String i3 = ingredients[2];
        System.out.println(i3);

        String i4 = ingredients[3];
        System.out.println(i4);

        String i5 = ingredients[4];
        System.out.println(i5);

        String i6 = ingredients[5];
        System.out.println(i6);

        String i7 = ingredients[6];
        System.out.println(i7);

        String i8 = ingredients[7];
        System.out.println(i8);
		*/
		
    }
}
