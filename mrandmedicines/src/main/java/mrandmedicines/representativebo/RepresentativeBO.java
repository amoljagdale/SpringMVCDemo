package mrandmedicines.representativebo;

public class RepresentativeBO {
	private long representativeEmployeeId;
	private String representativeFirstName;
	private String representativeLastName;
	private long companyId;
	private String representativeAddress;
	private String representativeCountry;
	private String representativeState;
	private String representativeCity;
	private int representativePinCode;
	public RepresentativeBO() {
		super();
	}
	public RepresentativeBO(long representativeEmployeeId, String representativeFirstName,
			String representativeLastName, long companyId, String representativeAddress, String representativeCountry,
			String representativeState, String representativeCity, int representativePinCode) {
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
	
}
