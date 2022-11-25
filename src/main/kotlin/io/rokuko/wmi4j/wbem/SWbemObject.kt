package io.rokuko.wmi4j.wbem

import cn.chenlichao.wmi4j.SWbemObject
import cn.chenlichao.wmi4j.WMIVariant

operator fun SWbemObject.get(propertyName: String): WMIVariant? = getPropertyByName(propertyName)