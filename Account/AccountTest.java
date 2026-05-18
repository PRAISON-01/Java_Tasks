public class AccountTest{

    @Test
    public void testThat

//Given
    Account myAccount = new Account();

//Creating a new object of class Account
//The class Account has not been created yet
//This test should fail

//Class is a bluePrint(Architectural Drawing)
//Object can be the houses that come out of that drawing

    int expectedBalance = 0;
    int actualBalance = myAccount.checkBalance();
    assertEquals(actualBalance, expectedBalance);


}
