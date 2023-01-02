package question3;

public interface AccountDao {
	
	Integer findById(int id);
	String save(Integer account);
	String deleteAccountById(int id);
	String withdraw(double amount,int accountId);
	String deposit(double amount,int accountId);

}
