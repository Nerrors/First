import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, CalculatorTest2.class, ExpenseListTest.class })
public class AllTests {

}

/* 
 * Η εκτέλεση της σουίτας ελέγχων, συνεπάγεται την εκτέλεση και των 3ον περιπτώσεων ελέγχου
 * Δηλαδή και των CalculatorTest.class, CalculatorTest2.class, ExpenseListTest.class.
 * 
 * Η κλάση αυτή εκτελείται με έναν ειδικό Runner όπως και οι παραμετρικές κλάσεις.
 * Αυτός ο Runner είναι ο Suiterunner.
 * Γι’ αυτό πρέπει να μπει η επισήμανση @RunWith(Suite.class)στην αρχή της κλάσης.
 * 
 * Οι κλάσεις (περιπτώσεις) ελέγχου που θα εκτελεσθούν όταν τρέξει 
 * η σουίτα προσδιορίζονται με την επισήμανση @SuiteClasses({...}
 * 
 */
