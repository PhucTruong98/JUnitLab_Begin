package csc131.junit;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
@Test
    public void getIssuingStore()
    {
        double       balance;
        GiftCard     card;
        int          issuingStore;
        issuingStore = 1337;
        balance      = 100.00;
        card = new GiftCard(issuingStore, balance);
        assertEquals("getIssuingStore()",
                     issuingStore, card.getIssuingStore());
} 

@Test
public void getIssuingStore2()
{
    double       balance;
    GiftCard     card;
    int          issuingStore;
    issuingStore = 1337;
    balance      = 100.00;
    card = new GiftCard(issuingStore, balance);
    assertEquals("getIssuingStore()",
                 issuingStore, card.getIssuingStore(), 0.001);
} 

@Test
public void deduct()
{
	double       balance;
    GiftCard     card;
    int          issuingStore;
    issuingStore = 1337;
    balance      = 100.00;
    card = new GiftCard(issuingStore, balance);
    assertEquals("deduct()",
            "Remaining Balance:  50.00", card.deduct(50.00));
}

}