package com.example

import com.amazonaws.services.lambda.runtime.Context

object Mock {
  trait ContextMock extends Context {
    override def getAwsRequestId() = ???
    override def getLogGroupName() = ???
    override def getLogStreamName() = ???
    override def getFunctionName() = ???
    override def getIdentity() = ???
    override def getClientContext() = ???
    override def getRemainingTimeInMillis() = ???
    override def getMemoryLimitInMB() = ???
    override def getLogger() = ???
  }
}
