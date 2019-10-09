package ch.dvbern.oss.lib.iso20022.pain008.v00102ch03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.RandomStringUtils;

import static ch.dvbern.oss.lib.iso20022.Iso2022ConstantsUtil.MESSAGE_PART_ID_LENGTH;
import static ch.dvbern.oss.lib.iso20022.Iso2022ConstantsUtil.PARTY_NAME_LENGTH;

/**
 * B-Level, payment info (creditor).
 */
public class PaymentInformationDTO {

	/**
	 * {@link RandomStringUtils#random(int, boolean, boolean)} by default.
	 */
	@NotNull
	@Size(min = 1, max = MESSAGE_PART_ID_LENGTH)
	private String paymentInfoId = RandomStringUtils.random(MESSAGE_PART_ID_LENGTH, true, true);

	@NotNull
	private LocalDate requestedCollectionDate = null;

	@NotNull
	@Size(min = 1, max = PARTY_NAME_LENGTH)
	private String creditorName = null;

	@NotNull
	@Pattern(regexp = "[A-Z]{2}[0-9]{2}[a-zA-Z0-9]{1,30}")
	private String creditorIBAN = null;

	/**
	 * Identification of creditors financial institution
	 */
	@NotNull
	@Pattern(regexp = "[0-9]{3,5}")
	private String creditorIID = null;

	/**
	 * ESR participation number of creditors financial institution
	 */
	@NotNull
	@Pattern(regexp = "[0-9]{9}")
	private String institutionEsr = null;

	/**
	 * Creditor LSV+ identification.
	 */
	@NotNull
	private String creditorId = null;

	@Valid
	private List<TransactionInformationDTO> transactionInfo = new ArrayList<>();

	public String getPaymentInfoId() {
		return paymentInfoId;
	}

	public void setPaymentInfoId(String paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}

	public LocalDate getRequestedCollectionDate() {
		return requestedCollectionDate;
	}

	public void setRequestedCollectionDate(LocalDate requestedCollectionDate) {
		this.requestedCollectionDate = requestedCollectionDate;
	}

	public String getCreditorName() {
		return creditorName;
	}

	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}

	public String getCreditorIBAN() {
		return creditorIBAN;
	}

	public void setCreditorIBAN(String creditorIBAN) {
		this.creditorIBAN = creditorIBAN;
	}

	public String getCreditorIID() {
		return creditorIID;
	}

	public void setCreditorIID(String creditorIID) {
		this.creditorIID = creditorIID;
	}

	public String getInstitutionEsr() {
		return institutionEsr;
	}

	public void setInstitutionEsr(String institutionEsr) {
		this.institutionEsr = institutionEsr;
	}

	public String getCreditorId() {
		return creditorId;
	}

	public void setCreditorId(String creditorId) {
		this.creditorId = creditorId;
	}

	public List<TransactionInformationDTO> getTransactionInfo() {
		return transactionInfo;
	}

	public void setTransactionInfo(List<TransactionInformationDTO> transactionInfo) {
		this.transactionInfo = transactionInfo;
	}
}
