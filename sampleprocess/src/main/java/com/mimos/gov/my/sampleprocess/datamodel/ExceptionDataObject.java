package com.mimos.gov.my.sampleprocess.datamodel;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ExceptionDataObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String errorId;
   private java.lang.String errorDesc;

   public ExceptionDataObject()
   {
   }

   public java.lang.String getErrorId()
   {
      return this.errorId;
   }

   public void setErrorId(java.lang.String errorId)
   {
      this.errorId = errorId;
   }

   public java.lang.String getErrorDesc()
   {
      return this.errorDesc;
   }

   public void setErrorDesc(java.lang.String errorDesc)
   {
      this.errorDesc = errorDesc;
   }

   public ExceptionDataObject(java.lang.String errorId,
         java.lang.String errorDesc)
   {
      this.errorId = errorId;
      this.errorDesc = errorDesc;
   }

}