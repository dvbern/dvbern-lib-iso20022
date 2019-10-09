/*
 * Copyright 2017 DV Bern AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */

package ch.dvbern.oss.lib.iso20022.pain008.v00102ch03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Pain008DTO {

	/**
	 * {@link UUID#randomUUID()} by default.
	 */
	@NotNull
	private String msgId = UUID.randomUUID().toString();

	/**
	 * {@link LocalDateTime#now()} by default.
	 */
	@NotNull
	private LocalDateTime creationDateTime = LocalDateTime.now();

	private String initiatingPartyName = null;

	/**
	 * LSV+ ID of the initiating party.
	 */
	@NotNull
	private String initiatingPartyId = null;

	private String softwareName = null;

	@Valid
	private List<PaymentInformationDTO> paymentInfo = new ArrayList<>();

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(@Nonnull String msgId) {
		this.msgId = msgId;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getInitiatingPartyName() {
		return initiatingPartyName;
	}

	public void setInitiatingPartyName(String initiatingPartyName) {
		this.initiatingPartyName = initiatingPartyName;
	}

	public String getInitiatingPartyId() {
		return initiatingPartyId;
	}

	public void setInitiatingPartyId(String initiatingPartyId) {
		this.initiatingPartyId = initiatingPartyId;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public List<PaymentInformationDTO> getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(List<PaymentInformationDTO> paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
}
