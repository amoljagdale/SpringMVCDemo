package mrandmedicines.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "MedicalRepresentative")

public class Representative {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="Id cannot be null")
	private long representativeEmployeeId;
	@NotNull(message="first Name cannot be null")	
	@Size(max = 50, min = 6)
	private String representativeFirstName;
	
	@NotNull(message="last Name cannot be null")	
	@Size(max = 50, min = 6,message="length should be between 6-50")
	private String representativeLastName;
	
	@NotNull(message="companyId cannot be null")	
	private long companyId;
	
	@NotNull(message="address cannot be null")	
	@Size(max = 50, min = 6,message="length should be between 6-50")
	private String representativeAddress;
	
	@NotNull(message="country cannot be null")		
	private String representativeCountry;
	
	@NotNull(message="state cannot be null")	
	private String representativeState;
	
	@NotNull(message="city cannot be null")	
	private String representativeCity;
	
	@NotNull(message="pincode cannot be null")	
	@Digits(integer=6,fraction=0,message="pincode must be 6 digit")
	private int representativePinCode;

	@OneToMany(cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	@JoinTable
	private List<Drug> drugList;

	public Representative() {
		super();
	}

	public Representative(long representativeEmployeeId, String representativeFirstName, String representativeLastName,
			long companyId, String representativeAddress, String representativeCountry, String representativeState,
			String representativeCity, int representativePinCode, List<Drug> drugList) {
		super();
		this.representativeEmployeeId = representativeEmployeeId;
		this.representativeFirstName = representativeFirstName;
		this.representativeLastName = representativeLastName;
		this.companyId = companyId;
		this.representativeAddress = representativeAddress;
		this.representativeCountry = representativeCountry;
		this.representativeState = representativeState;
		this.representativeCity = representativeCity;
		this.representativePinCode = representativePinCode;
		this.drugList = drugList;
	}

	public long getRepresentativeEmployeeId() {
		return representativeEmployeeId;
	}

	public void setRepresentativeEmployeeId(long representativeEmployeeId) {
		this.representativeEmployeeId = representativeEmployeeId;
	}

	public String getRepresentativeFirstName() {
		return representativeFirstName;
	}

	public void setRepresentativeFirstName(String representativeFirstName) {
		this.representativeFirstName = representativeFirstName;
	}

	public String getRepresentativeLastName() {
		return representativeLastName;
	}

	public void setRepresentativeLastName(String representativeLastName) {
		this.representativeLastName = representativeLastName;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getRepresentativeAddress() {
		return representativeAddress;
	}

	public void setRepresentativeAddress(String representativeAddress) {
		this.representativeAddress = representativeAddress;
	}

	public String getRepresentativeCountry() {
		return representativeCountry;
	}

	public void setRepresentativeCountry(String representativeCountry) {
		this.representativeCountry = representativeCountry;
	}

	public String getRepresentativeState() {
		return representativeState;
	}

	public void setRepresentativeState(String representativeState) {
		this.representativeState = representativeState;
	}

	public String getRepresentativeCity() {
		return representativeCity;
	}

	public void setRepresentativeCity(String representativeCity) {
		this.representativeCity = representativeCity;
	}

	public int getRepresentativePinCode() {
		return representativePinCode;
	}

	public void setRepresentativePinCode(int representativePinCode) {
		this.representativePinCode = representativePinCode;
	}

	public List<Drug> getDrugList() {
		return drugList;
	}

	public void setDrugList(List<Drug> drugList) {
		this.drugList = drugList;
	}

}
