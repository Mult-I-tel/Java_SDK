/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.optimalpayments.hostedpayment;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class AncillaryFee.
 */
public class AncillaryFee implements DomainObject {

  @Expose
  private Integer amount;
  @Expose
  private String description;

  public final Integer getAmount() {
    return amount;
  }

  public final void setAmount(final Integer amount) {
    this.amount = amount;
  }

  public final String getDescription() {
    return description;
  }

  public final void setDescription(final String description) {
    this.description = description;
  }

  /**
   * The sub-builder class for AncillaryFee.
   *
   * @param <BLDRT> the parent builder
   */
  public static class AncillaryFeeBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<AncillaryFee, BLDRT> {

    private final AncillaryFee ancillaryFee = new AncillaryFee();

    public AncillaryFeeBuilder(final BLDRT parent) {
      super(parent);
    }

    /**
     * Build this AncillaryFee object.
     *
     * @return AncillaryFee
     */
    @Override
    public final AncillaryFee build() {
      return ancillaryFee;
    }

    /**
     * Set the amount property.
     *
     * @param amount
     * @return AncillaryFeeBuilder< BLDRT >
     */
    public final AncillaryFeeBuilder<BLDRT> amount(final Integer amount) {
      ancillaryFee.setAmount(amount);
      return this;
    }

    /**
     * Set the description property.
     *
     * @param description
     * @return AncillaryFeeBuilder< BLDRT >
     */
    public final AncillaryFeeBuilder<BLDRT> description(final String description) {
      ancillaryFee.setDescription(description);
      return this;
    }
  }
}
