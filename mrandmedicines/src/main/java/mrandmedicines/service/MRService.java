package mrandmedicines.service;

import java.util.List;

import mrandmedicines.model.Representative;
import mrandmedicines.representativebo.RepresentativeBO;

public interface MRService {
	public Representative addRepresentative(Representative mr);
	 public Representative updateRepresentative(Representative mr);
	 public void deleteRepresentative(Representative mr);
	 public Representative getRepresentative(long id);
	 public List<RepresentativeBO> getAllRepresentatives();
	 public boolean isRepresentativeExist(Representative mr) ;
}
