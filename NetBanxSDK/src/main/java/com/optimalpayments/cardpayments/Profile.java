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
package com.optimalpayments.cardpayments;

import com.google.gson.annotations.Expose;

import com.optimalpayments.common.impl.DomainObject;
import com.optimalpayments.common.impl.GenericBuilder;
import com.optimalpayments.common.impl.NestedBuilder;

/**
 * The Class Profile.
 */
public class Profile implements DomainObject {

  @Expose
  private String firstName;
  @Expose
  private String lastName;
  @Expose
  private String email;

  public final String getFirstName() {
    return firstName;
  }

  public final void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public final String getLastName() {
    return lastName;
  }

  public final void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public final String getEmail() {
    return email;
  }

  public final void setEmail(final String email) {
    this.email = email;
  }

  /**
   * The sub-builder class for Profile.
   *
   * @param <BLDRT> the parent builder
   */
  public static class ProfileBuilder<BLDRT extends GenericBuilder> extends
          NestedBuilder<Profile, BLDRT> {

    private final Profile profile = new Profile();

    public ProfileBuilder(final BLDRT parent) {
      super(parent);
    }
    
    public ProfileBuilder(final BLDRT parent, com.optimalpayments.customervault.Profile p) {
      super(parent);
      profile.setEmail(p.getEmail());
      profile.setFirstName(p.getFirstName());
      profile.setLastName(p.getLastName());
    }

    /**
     * Build this CardExpiry object.
     *
     * @return CardExpiry
     */
    @Override
    public final Profile build() {
      return profile;
    }

    /**
     * Set the firstName property.
     *
     * @param firstName
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> firstName(final String firstName) {
      profile.setFirstName(firstName);
      return this;
    }

    /**
     * Set the lastName property.
     *
     * @param lastName
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> lastName(final String lastName) {
      profile.setLastName(lastName);
      return this;
    }

    /**
     * Set the email property.
     *
     * @param email
     * @return ProfileBuilder< BLDRT >
     */
    public final ProfileBuilder<BLDRT> email(final String email) {
      profile.setEmail(email);
      return this;
    }
  }
}
