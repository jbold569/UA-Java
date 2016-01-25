 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import java.util.EnumSet;

import org.opcfoundation.ua.builtintypes.Enumeration; 
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.Identifiers;



public enum AxisScaleEnumeration implements Enumeration {

    Linear,
    Log,
    Ln;
	
	public static final NodeId ID = Identifiers.AxisScaleEnumeration;
	public static EnumSet<AxisScaleEnumeration> NONE = EnumSet.noneOf( AxisScaleEnumeration.class );
	public static EnumSet<AxisScaleEnumeration> ALL = EnumSet.allOf( AxisScaleEnumeration.class );
	
	@Override
	public int getValue() {
		return ordinal();
	}

	public static AxisScaleEnumeration valueOf(int value)
	{
		if (value<0 || value>=values().length) return null;
		return values()[value];
	}

	public static AxisScaleEnumeration valueOf(Integer value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static AxisScaleEnumeration valueOf(UnsignedInteger value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static AxisScaleEnumeration[] valueOf(int[] value)
	{
		AxisScaleEnumeration[] result = new AxisScaleEnumeration[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static AxisScaleEnumeration[] valueOf(Integer[] value)
	{
		AxisScaleEnumeration[] result = new AxisScaleEnumeration[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}
	
	public static AxisScaleEnumeration[] valueOf(UnsignedInteger[] value)
	{
		AxisScaleEnumeration[] result = new AxisScaleEnumeration[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

}