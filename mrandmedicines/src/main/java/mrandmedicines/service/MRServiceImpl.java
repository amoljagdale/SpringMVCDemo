package mrandmedicines.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mrandmedicines.dao.MRDao;
import mrandmedicines.model.Representative;
import mrandmedicines.representativebo.RepresentativeBO;

@Service
public class MRServiceImpl implements MRService {

	@Autowired
	private MRDao mrDao;

	@Override
	public Representative addRepresentative(Representative mr) {
		return mrDao.addRepresentative(mr);

	}

	@Override
	public Representative updateRepresentative(Representative mr) {
		return mrDao.updateRepresentative(mr);
	}

	@Override
	public void deleteRepresentative(Representative mr) {
		mrDao.deleteRepresentative(mr);
	}

	@Override
	public Representative getRepresentative(long id) {
		return mrDao.getRepresentative(id);
	}

	@Override
	public List<RepresentativeBO> getAllRepresentatives() {
		
		return convertModelToBo(mrDao.getAllRepresentatives());
		
	}

	private List<RepresentativeBO> convertModelToBo(List<Representative> mrList) {
		List<RepresentativeBO> mrBoList=new ArrayList<>();
		RepresentativeBO rBO=null;	

		for (Representative mr : mrList) {
				rBO = new RepresentativeBO();
				rBO.setCompanyId(mr.getCompanyId());
				rBO.setRepresentativeAddress(mr.getRepresentativeAddress());
				rBO.setRepresentativeCity(mr.getRepresentativeCity());
				rBO.setRepresentativeCountry(mr.getRepresentativeCountry());
				rBO.setRepresentativeEmployeeId(mr.getRepresentativeEmployeeId());
				rBO.setRepresentativeFirstName(mr.getRepresentativeFirstName());
				rBO.setRepresentativeLastName(mr.getRepresentativeLastName());
				rBO.setRepresentativePinCode(mr.getRepresentativePinCode());
				rBO.setRepresentativeState(mr.getRepresentativeState());
				mrBoList.add(rBO);
			}
			
			
			return mrBoList;
			
		}

	public boolean isRepresentativeExist(Representative mr) {
		return getRepresentative(mr.getRepresentativeEmployeeId()) != null;
	}
}
