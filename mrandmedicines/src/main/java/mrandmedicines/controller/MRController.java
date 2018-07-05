package mrandmedicines.controller;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import mrandmedicines.constants.PathConstant;
import mrandmedicines.constants.URLConstant;
import mrandmedicines.model.Representative;
import mrandmedicines.representativebo.RepresentativeBO;
import mrandmedicines.service.MRService;

/**Representative Webservices: 
 * Create representative--->http://localhost:8080/mrandmedicines/representative
 * Edit representative --->http://localhost:8080/mrandmedicines/representative/2
 * Delete representative --->http://localhost:8080/mrandmedicines/representative/1
 * Get information of an representative by its ID --->http://localhost:8080/mrandmedicines/representative/8
 * Get List of all representatives --->http://localhost:8080/mrandmedicines/representative
 * 
 * 
 * 
 * @author Amit
 *
 */
@RestController
public class MRController {

	private static final Logger LOGGER = Logger.getLogger(MRController.class);
	/**
	 * constants used for keys in message.properties file 
	 */
	private static final String NO_RECORD = "log.info.noRecord";
	private static final String EMPTY_RESPONSE = "response.noContent";
	
	@Autowired
	private MRService mrService;
	@Autowired
	private MessageSource messageSource;

	@GetMapping("/")
	public String home() {
		LOGGER.info(messageSource.getMessage("greeting", null, Locale.US));
		return messageSource.getMessage("greeting", null, Locale.US);
	}

	/**
	 * Retrieve All MedicalRepresentatives with Medicines
	 * 
	 */
	@GetMapping(URLConstant.GET_ALL_REPRESENTATIVE)
	public ResponseEntity<Object> listAllRepresentatives() {
		List<RepresentativeBO> mrs = mrService.getAllRepresentatives();
		if (mrs.isEmpty()) {
			return new ResponseEntity<>(messageSource.getMessage("response.empty", null, Locale.US),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(mrs, HttpStatus.OK);
	}

	/**
	 * Retrieve Single MedicalRepresentative
	 * 
	 */

	@GetMapping(value = URLConstant.GET_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getRepresentative(@PathVariable(PathConstant.GET_ID) long id) {
		LOGGER.info(messageSource.getMessage("log.info.fetch", null, Locale.US) + id);
		Representative mr = mrService.getRepresentative(id);
		if (mr == null) {
			LOGGER.info(messageSource.getMessage(NO_RECORD, null, Locale.US) + id);
			return new ResponseEntity<>(messageSource.getMessage(EMPTY_RESPONSE, null, Locale.US),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(mr, HttpStatus.OK);
	}

	/**
	 * Create a MedicalRepresentative
	 * 
	 */
	@PostMapping(URLConstant.CREATE_REPRESENTATIVE)
	public ResponseEntity<Object> createRepresentative(@RequestBody Representative mr, UriComponentsBuilder ucBuilder) {
		LOGGER.info(messageSource.getMessage("log.info.create", null, Locale.US) + mr.getRepresentativeEmployeeId());

		if (mrService.isRepresentativeExist(mr)) {
			LOGGER.info(messageSource.getMessage("log.info.exist", null, Locale.US) + mr.getRepresentativeFirstName());
			return new ResponseEntity<>(messageSource.getMessage("response.recordExist", null, Locale.US),
					HttpStatus.CONFLICT);
		}

		mrService.addRepresentative(mr);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path(PathConstant.CREATE_RESPONSE_HEADER)
				.buildAndExpand(mr.getRepresentativeEmployeeId()).toUri());
		return new ResponseEntity<>(messageSource.getMessage("response.created", null, Locale.US), headers,
				HttpStatus.CREATED);
	}

	/**
	 * Update a MedicalRepresentative
	 * 
	 */

	@PutMapping(URLConstant.UPDATE_REPRESENTATIVE)
	public ResponseEntity<Object> updateRepresentative(@PathVariable(PathConstant.GET_ID) long id,
			@RequestBody Representative mr) {
		LOGGER.info(messageSource.getMessage("log.info.update", null, Locale.US) + id);

		Representative currentRepresentative = mrService.getRepresentative(id);

		if (currentRepresentative == null) {
			LOGGER.info(messageSource.getMessage(NO_RECORD, null, Locale.US) + id);
			return new ResponseEntity<>(messageSource.getMessage(EMPTY_RESPONSE, null, Locale.US),
					HttpStatus.NOT_FOUND);
		}

		currentRepresentative.setRepresentativeFirstName(mr.getRepresentativeFirstName());
		currentRepresentative.setRepresentativeLastName(mr.getRepresentativeLastName());
		currentRepresentative.setCompanyId(mr.getCompanyId());
		currentRepresentative.setRepresentativeAddress(mr.getRepresentativeAddress());
		currentRepresentative.setRepresentativeCountry(mr.getRepresentativeCountry());
		currentRepresentative.setRepresentativeState(mr.getRepresentativeState());
		currentRepresentative.setRepresentativeCity(mr.getRepresentativeCity());
		currentRepresentative.setRepresentativePinCode(mr.getRepresentativePinCode());
		currentRepresentative.setDrugList(mr.getDrugList());

		mrService.updateRepresentative(currentRepresentative);

		return new ResponseEntity<>(currentRepresentative, HttpStatus.OK);
	}

	/**
	 * Delete a MedicalRepresentative
	 * 
	 */

	@DeleteMapping(value = URLConstant.DELETE_REPRESENTATIVE_BY_ID, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> deleteRepresentative(@PathVariable(PathConstant.GET_ID) long id) {
		LOGGER.info(messageSource.getMessage("log.info.delete", null, Locale.US) + id);

		Representative mr = mrService.getRepresentative(id);
		if (mr == null) {
			LOGGER.info(messageSource.getMessage(NO_RECORD, null, Locale.US) + id);
			return new ResponseEntity<>(messageSource.getMessage(EMPTY_RESPONSE, null, Locale.US),
					HttpStatus.NOT_FOUND);
		}

		mrService.deleteRepresentative(mr);
		return new ResponseEntity<>(messageSource.getMessage("response.delete", null, Locale.US), HttpStatus.OK);
	}

}