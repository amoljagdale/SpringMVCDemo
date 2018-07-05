package mrandmedicines.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mrandmedicines.model.Representative;
@Repository
@Transactional
public class MRDaoImpl implements MRDao{

	@Autowired
	   private SessionFactory sessionFactory;
	@Override
	public Representative addRepresentative(Representative mr) {
		sessionFactory.getCurrentSession().persist(mr);
		return getRepresentative(mr.getRepresentativeEmployeeId());
	}

	@Override
	public Representative updateRepresentative(Representative mr) {
		sessionFactory.getCurrentSession().update(mr);
		return mr;
	}

	@Override
	public void deleteRepresentative(Representative mr) {
			sessionFactory.getCurrentSession().delete(mr);
	}

	@Override
	public Representative getRepresentative(long id) {
		return sessionFactory.getCurrentSession().get(Representative.class,id);
	}

	@Override
	public List<Representative> getAllRepresentatives() {
		return sessionFactory.getCurrentSession().createQuery("from Representative").list();
	}

}
