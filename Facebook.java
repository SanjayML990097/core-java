class Facebook
{
	Account accounts[] = new Account[5];
	int index;
	public boolean createAccount(Account ref)
	{
			accounts[index] = ref;
			index++;
			return true;
	}

	public void getAllAccountDetails()
	{
		for(Account account : accounts)
		{
			System.out.println(account.accountId);
			System.out.println(account.userName);
			System.out.println(account.email);
			System.out.println(account.password);
			System.out.println(account.gender);
			System.out.println(account.age);

			for(String interest : account.interests)
			{
				System.out.println(interest);
			}
		}
	}
}