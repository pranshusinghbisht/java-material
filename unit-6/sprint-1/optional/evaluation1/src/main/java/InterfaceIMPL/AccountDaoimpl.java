package InterfaceIMPL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.id.enhanced.AccessCallback;

import com.beanclass.Account;
import com.interfaces.AccountDao;

public class AccountDaoimpl implements AccountDao{

	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em  = emt.createEntityManager();
		
		
		
		Account ac   = em.find(Account.class,id );
		
		em.close();
		
		if(ac!= null) {
			
			return ac;
		}
		
		
		return null;
	}

	@Override
	public String save(Account account) {
		
		if(account !=null) {
			
			EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
			
			EntityManager em  = emt.createEntityManager();
			
//			em.persist(account);
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(account);
			et.commit();
			
					
			
			
			
						
			em.close();
			return "success";
			
		}
		
		
		// TODO Auto-generated method stub
		return "Not Success";
	}

	@Override
	public String update(Account account) {

		if(account !=null) {
			
			EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
			
			EntityManager em  = emt.createEntityManager();
			
//			em.persist(account);
			
			Account ac = em.find(Account.class, account.getId());
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			
			ac.setEmail(account.getEmail());
			ac.setAddress(account.getAddress());
			ac.setBalance(account.getBalance());
			
			
			
			et.commit();
			
					
			em.close();
			return "success";
			
		}
		
		
		// TODO Auto-generated method stub
		return "Not Success";
	}

	@Override
	public String remove(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em  = emt.createEntityManager();
		
//		em.persist(account);
		
		Account ac = em.find(Account.class, id);
		
		if(ac!=null) {
			EntityTransaction et = em.getTransaction();
			et.begin();
			
			em.remove(ac);
			
			
			
			et.commit();
			
					
			em.close();
			return "success";
		}
		
		
		
		
		
		
		return "not found";
	}

	@Override
	public String withdraw(double amount, int accountId) {
		

			
			EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
			
			EntityManager em  = emt.createEntityManager();
			
//			em.persist(account);
			
			Account ac = em.find(Account.class, accountId);
			
			if(ac!= null) {
				
			
			EntityTransaction et = em.getTransaction();
			et.begin();
	
			ac.setBalance(ac.getBalance()-amount);
			
			
			
			et.commit();
			
					
			em.close();
			return "success";
			
			}
		
		
		// TODO Auto-generated method stub
		return "Not Success";
		

	}

	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
