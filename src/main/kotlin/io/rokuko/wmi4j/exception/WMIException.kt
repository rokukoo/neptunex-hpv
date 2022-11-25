package io.rokuko.wmi4j.exception

import org.jinterop.dcom.common.JIException
import org.jinterop.dcom.common.JIRuntimeException

class WMIException : JIException {
    constructor(jiException: JIException) : super(jiException.errorCode, jiException.message, jiException.cause)
    constructor(errorCode: Int, message: String?) : super(errorCode, message)
    constructor(errorCode: Int) : super(errorCode)
    constructor(errorCode: Int, cause: Throwable?) : super(errorCode, cause)
    constructor(exception: JIRuntimeException?) : super(exception)
    constructor(errorCode: Int, message: String?, cause: Throwable?) : super(errorCode, message, cause)
}
