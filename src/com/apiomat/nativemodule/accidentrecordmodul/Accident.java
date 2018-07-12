/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.accidentrecordmodul;


import com.apiomat.nativemodule.basics.*;
import com.apiomat.nativemodule.accidentrecordmodul.*;
import com.apiomat.nativemodule.accidentrecordmodul.*;
/**
* Generated class for your Accident data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "AccidentRecordModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.accidentrecordmodul.AccidentHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.accidentrecordmodul.AccidentHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Accident extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.accidentrecordmodul.Accident> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.accidentrecordmodul.Accident>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "AccidentRecordModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Accident";

    /** class specific attributes */
    private String carChange = null;
    private java.util.Date carEnd = null;
    private java.util.Date carFrom = null;
    private String carKilometer = null;
    private String carUsing = null;
    private String chargeOwn = null;
    private String chargeStrange = null;
    private String damageOwn = null;
    private String damageStrange = null;
    private String description = null;
    private java.util.Date disruptionEnd = null;
    private java.util.Date disruptionFrom = null;
    private String driverName = null;
    private String driverStreetNo = null;
    private String driverZipcode = null;
    private String ownerName = null;
    private String ownerStreetNo = null;
    private String ownerZipcode = null;
    private String police = null;
    private com.apiomat.nativemodule.accidentrecordmodul.typeNature selectionNature = null;
    private com.apiomat.nativemodule.accidentrecordmodul.typeView selectionView = null;
    private String weather = null;
    private String witness1Name = null;
    private String witness1StreetNo = null;
    private String witness1Zipcode = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Accident ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getCarChange()
    {
         return this.carChange;
    }

    public void setCarChange( String arg )
    {
        this.carChange = arg;
    }

    public java.util.Date getCarEnd()
    {
         return this.carEnd;
    }

    public void setCarEnd( java.util.Date arg )
    {
        this.carEnd = arg;
    }

    public java.util.Date getCarFrom()
    {
         return this.carFrom;
    }

    public void setCarFrom( java.util.Date arg )
    {
        this.carFrom = arg;
    }

    public String getCarKilometer()
    {
         return this.carKilometer;
    }

    public void setCarKilometer( String arg )
    {
        this.carKilometer = arg;
    }

    public String getCarUsing()
    {
         return this.carUsing;
    }

    public void setCarUsing( String arg )
    {
        this.carUsing = arg;
    }

    public String getChargeOwn()
    {
         return this.chargeOwn;
    }

    public void setChargeOwn( String arg )
    {
        this.chargeOwn = arg;
    }

    public String getChargeStrange()
    {
         return this.chargeStrange;
    }

    public void setChargeStrange( String arg )
    {
        this.chargeStrange = arg;
    }

    public String getDamageOwn()
    {
         return this.damageOwn;
    }

    public void setDamageOwn( String arg )
    {
        this.damageOwn = arg;
    }

    public String getDamageStrange()
    {
         return this.damageStrange;
    }

    public void setDamageStrange( String arg )
    {
        this.damageStrange = arg;
    }

    public String getDescription()
    {
         return this.description;
    }

    public void setDescription( String arg )
    {
        this.description = arg;
    }

    public java.util.Date getDisruptionEnd()
    {
         return this.disruptionEnd;
    }

    public void setDisruptionEnd( java.util.Date arg )
    {
        this.disruptionEnd = arg;
    }

    public java.util.Date getDisruptionFrom()
    {
         return this.disruptionFrom;
    }

    public void setDisruptionFrom( java.util.Date arg )
    {
        this.disruptionFrom = arg;
    }

    public String getDriverName()
    {
         return this.driverName;
    }

    public void setDriverName( String arg )
    {
        this.driverName = arg;
    }

    public String getDriverStreetNo()
    {
         return this.driverStreetNo;
    }

    public void setDriverStreetNo( String arg )
    {
        this.driverStreetNo = arg;
    }

    public String getDriverZipcode()
    {
         return this.driverZipcode;
    }

    public void setDriverZipcode( String arg )
    {
        this.driverZipcode = arg;
    }

    public String getOwnerName()
    {
         return this.ownerName;
    }

    public void setOwnerName( String arg )
    {
        this.ownerName = arg;
    }

    public String getOwnerStreetNo()
    {
         return this.ownerStreetNo;
    }

    public void setOwnerStreetNo( String arg )
    {
        this.ownerStreetNo = arg;
    }

    public String getOwnerZipcode()
    {
         return this.ownerZipcode;
    }

    public void setOwnerZipcode( String arg )
    {
        this.ownerZipcode = arg;
    }

    public String getPolice()
    {
         return this.police;
    }

    public void setPolice( String arg )
    {
        this.police = arg;
    }

    public com.apiomat.nativemodule.accidentrecordmodul.typeNature getSelectionNature()
    { 
        if(this.selectionNature == null)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.selectionNature =  ( com.apiomat.nativemodule.accidentrecordmodul.typeNature ) m.invoke( this, "selectionNature", com.apiomat.nativemodule.accidentrecordmodul.typeNature.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.selectionNature;
    }

    public void postSelectionNature( final com.apiomat.nativemodule.accidentrecordmodul.typeNature refData )
    {
        addReference( "selectionNature", refData );
        this.selectionNature = refData;
    }

    public void removeSelectionNature( final com.apiomat.nativemodule.accidentrecordmodul.typeNature refData )
    {
        removeReference( "selectionNature", refData );
        this.selectionNature = null;
    }

    public com.apiomat.nativemodule.accidentrecordmodul.typeView getSelectionView()
    { 
        if(this.selectionView == null)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.selectionView =  ( com.apiomat.nativemodule.accidentrecordmodul.typeView ) m.invoke( this, "selectionView", com.apiomat.nativemodule.accidentrecordmodul.typeView.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.selectionView;
    }

    public void postSelectionView( final com.apiomat.nativemodule.accidentrecordmodul.typeView refData )
    {
        addReference( "selectionView", refData );
        this.selectionView = refData;
    }

    public void removeSelectionView( final com.apiomat.nativemodule.accidentrecordmodul.typeView refData )
    {
        removeReference( "selectionView", refData );
        this.selectionView = null;
    }

    public String getWeather()
    {
         return this.weather;
    }

    public void setWeather( String arg )
    {
        this.weather = arg;
    }

    public String getWitness1Name()
    {
         return this.witness1Name;
    }

    public void setWitness1Name( String arg )
    {
        this.witness1Name = arg;
    }

    public String getWitness1StreetNo()
    {
         return this.witness1StreetNo;
    }

    public void setWitness1StreetNo( String arg )
    {
        this.witness1StreetNo = arg;
    }

    public String getWitness1Zipcode()
    {
         return this.witness1Zipcode;
    }

    public void setWitness1Zipcode( String arg )
    {
        this.witness1Zipcode = arg;
    }

}
