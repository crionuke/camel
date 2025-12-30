/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.component.telegram.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to send invoices.
 *
 * @see <a href="https://core.telegram.org/bots/api#sendinvoice"> https://core.telegram.org/bots/api#sendinvoice</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendInvoiceMessage extends OutgoingMessage {

    private static final long serialVersionUID = 2243358307498153269L;

    private String title;

    private String description;

    private String payload;

    @JsonProperty("provider_token")
    private String providerToken;

    private String currency;

    private List<LabeledPrice> prices;

    @JsonProperty("start_parameter")
    private String startParameter;

    @JsonProperty("provider_data")
    private String providerData;

    @JsonProperty("need_phone_number")
    private Boolean needPhoneNumber;

    @JsonProperty("need_email")
    private Boolean needEmail;

    @JsonProperty("need_shipping_address")
    private Boolean needShippingAddress;

    @JsonProperty("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider;

    @JsonProperty("send_email_to_provider")
    private Boolean sendEmailToProvider;

    public SendInvoiceMessage(String title, String description, String payload, String providerToken, String currency,
                              List<LabeledPrice> prices, String startParameter, String providerData,
                              Boolean needPhoneNumber, Boolean needEmail, Boolean needShippingAddress,
                              Boolean sendPhoneNumberToProvider, Boolean sendEmailToProvider) {
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.providerToken = providerToken;
        this.currency = currency;
        this.prices = prices;
        this.startParameter = startParameter;
        this.providerData = providerData;
        this.needPhoneNumber = needPhoneNumber;
        this.needEmail = needEmail;
        this.needShippingAddress = needShippingAddress;
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
        this.sendEmailToProvider = sendEmailToProvider;
    }

    public SendInvoiceMessage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getProviderToken() {
        return providerToken;
    }

    public void setProviderToken(String providerToken) {
        this.providerToken = providerToken;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<LabeledPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

    public String getProviderData() {
        return providerData;
    }

    public void setProviderData(String providerData) {
        this.providerData = providerData;
    }

    public Boolean getNeedPhoneNumber() {
        return needPhoneNumber;
    }

    public void setNeedPhoneNumber(Boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
    }

    public Boolean getNeedEmail() {
        return needEmail;
    }

    public void setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
    }

    public Boolean getNeedShippingAddress() {
        return needShippingAddress;
    }

    public void setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
    }

    public Boolean getSendPhoneNumberToProvider() {
        return sendPhoneNumberToProvider;
    }

    public void setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
    }

    public Boolean getSendEmailToProvider() {
        return sendEmailToProvider;
    }

    public void setSendEmailToProvider(Boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendInvoiceMessage{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", payload='").append(payload).append('\'');
        sb.append(", providerToken='").append(providerToken).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", prices=").append(prices);
        sb.append(", startParameter='").append(startParameter).append('\'');
        sb.append(", providerData='").append(providerData).append('\'');
        sb.append(", needPhoneNumber=").append(needPhoneNumber);
        sb.append(", needEmail=").append(needEmail);
        sb.append(", needShippingAddress=").append(needShippingAddress);
        sb.append(", sendPhoneNumberToProvider=").append(sendPhoneNumberToProvider);
        sb.append(", sendEmailToProvider=").append(sendEmailToProvider);
        sb.append('}');
        return sb.toString();
    }
}
