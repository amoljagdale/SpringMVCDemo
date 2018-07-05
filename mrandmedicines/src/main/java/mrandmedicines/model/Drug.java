package mrandmedicines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Medicine")
@Table(name = "Medicine")
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productCode;
	private String name;
	private String description;
	private String about;
	private String symptoms;
	private String moleculeName;

	public Drug() {
		super();
	}

	public Drug(long productCode, String name, String description, String about, String symptoms, String moleculeName) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.description = description;
		this.about = about;
		this.symptoms = symptoms;
		this.moleculeName = moleculeName;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getMoleculeName() {
		return moleculeName;
	}

	public void setMoleculeName(String moleculeName) {
		this.moleculeName = moleculeName;
	}

}