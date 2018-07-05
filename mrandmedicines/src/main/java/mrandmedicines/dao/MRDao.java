package mrandmedicines.dao;

import java.util.List;

import mrandmedicines.model.Representative;

public interface MRDao {
	public Representative addRepresentative(Representative mr);
	 public Representative updateRepresentative(Representative mr);
	 public void deleteRepresentative(Representative mr);
	 public Representative getRepresentative(long id);
	 public List<Representative> getAllRepresentatives();
}
