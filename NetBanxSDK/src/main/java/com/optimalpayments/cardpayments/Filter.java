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

/**
 * Filter class to be used by lookup queries.
 */
public class Filter {

  private Integer limit;
  private Integer offset;
  private String startDate;
  private String endDate;
  
  public Integer getLimit() {
    return limit;
  }
  
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  
  public Integer getOffset() {
    return offset;
  }
  
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
  
  public String getStartDate() {
    return startDate;
  }
  
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }
  
  public String getEndDate() {
    return endDate;
  }
  
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
