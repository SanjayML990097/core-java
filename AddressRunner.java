class AddressRunner{
	
	public static void main(String[] args){
	Address address[] = new Address[15];

	
	Address addres1 = new Address();
	addres1.addressId = 101;
	addres1.street = "MG Road";
	addres1.city = "Banglore";
	addres1.state = "Karnataka";
	addres1.pincode = 577201;
	
	address[0]=addres1;
	
	Address addres2 = new Address();
	addres2.addressId = 102;
	addres2.street ="Brigade Road";
	addres2.city = "Banglore";
	addres2.state = "Karnataka";
	addres2.pincode = 578204;
	
	address[1] = addres2;
	
	Address addres3 = new Address();
	addres3.addressId = 103;
	addres3.street ="Brigade Road";
	addres3.city = "Banglore";
	addres3.state = "Karnataka";
	addres3.pincode = 578204;
	
	address[2] = addres3;
	
	Address addres4 = new Address();
	addres4.addressId = 104;
	addres4.street ="Church Street";
	addres4.city = "Banglore";
	addres4.state = "Karnataka";
	addres4.pincode = 578206;
	
	address[3] = addres4;
	
	Address addres5 = new Address();
	addres5.addressId = 105;
	addres5.street ="Commercial Street";
	addres5.city = "Banglore";
	addres5.state = "Karnataka";
	addres5.pincode = 577207;
	
	address[4] = addres5;
	
	Address addres6 = new Address();
	addres6.addressId = 106;
	addres6.street ="Brigade Road";
	addres6.city = "Banglore";
	addres6.state = "Karnataka";
	addres6.pincode = 578206;
	
	address[5] = addres6;
	
	Address addres7 = new Address();
	addres7.addressId = 107;
	addres7.street ="Avenue Road";
	addres7.city = "Banglore";
	addres7.state = "Karnataka";
	addres7.pincode = 578208;
	
	address[6] = addres7;
	
	Address addres8 = new Address();
	addres8.addressId = 108;
	addres8.street ="Residency Road ";
	addres8.city = "Banglore";
	addres8.state = "Karnataka";
	addres8.pincode = 578210;
	
	address[7] = addres8;
	
	Address addres9 = new Address();
	addres9.addressId = 109;
	addres9.street ="Outer Ring Road";
	addres9.city = "Banglore";
	addres9.state = "Karnataka";
	addres9.pincode = 578211;
	
	address[8] = addres9;
	
	Address addres10 = new Address();
	addres10.addressId = 110;
	addres10.street ="Hosur Road";
	addres10.city = "Banglore";
	addres10.state = "Karnataka";
	addres10.pincode = 578212;
	
	address[9] = addres10;
	
	Address addres11 = new Address();
	addres11.addressId = 111;
	addres11.street ="Chord Road ";
	addres11.city = "Banglore";
	addres11.state = "Karnataka";
	addres11.pincode = 578213;
	
	address[10] = addres11;
	
	Address addres12 = new Address();
	addres12.addressId = 112;
	addres12.street ="Brigade Road";
	addres12.city = "Banglore";
	addres12.state = "Karnataka";
	addres12.pincode = 578214;
	
	address[11] = addres12;
	
	Address addres13 = new Address();
	addres13.addressId = 113;
	addres13.street ="Kasturba Road";
	addres13.city = "Banglore";
	addres13.state = "Karnataka";
	addres13.pincode = 578215;
	
	address[12] = addres13;
	
	Address addres14 = new Address();
	addres14.addressId = 114;
	addres14.street ="Brigade Road";
	addres14.city = "Banglore";
	addres14.state = "Karnataka";
	addres14.pincode = 578216;
	
	address[13] = addres14;
	
	Address addres15 = new Address();
	addres15.addressId = 112;
	addres15.street ="Brigade Road";
	addres15.city = "Banglore";
	addres15.state = "Karnataka";
	addres15.pincode = 578217;
	
	address[14] = addres15;
	
	for(Address addres:address){
		System.out.println(addres.addressId);
		System.out.println(addres.street);
		System.out.println(addres.city);
		System.out.println(addres.state);
		System.out.println(addres.pincode);
		
	}
  }
}