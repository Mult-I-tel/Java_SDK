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
package com.optimalpayments.common;

import java.util.ArrayList;

import com.optimalpayments.common.impl.DomainObject;

/**
 * The Class Error.
 */
public class Error implements DomainObject {

  private String code;
  private String message;
  private ArrayList<String> details;
  private ArrayList<FieldError> fieldErrors;
  private ArrayList<Link> links;

  public final String getCode() {
    return code;
  }

  public final void setCode(final String code) {
    this.code = code;
  }

  public final String getMessage() {
    return message;
  }

  public final void setMessage(final String message) {
    this.message = message;
  }

  public final ArrayList<String> getDetails() {
    return details;
  }

  public final void setDetails(final ArrayList<String> details) {
    this.details = details;
  }

  public final ArrayList<FieldError> getFieldErrors() throws OptimalException {
    return fieldErrors;
  }

  public final void setFieldErrors(final ArrayList<FieldError> fieldErrors) {
    this.fieldErrors = fieldErrors;
  }

  public final ArrayList<Link> getLinks() {
    return links;
  }

  public final void setLinks(final ArrayList<Link> links) {
    this.links = links;
  }

}
