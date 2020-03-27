package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[ProductConversionApi].to[ProductConversionApiImpl],
    bind[ProductLookupApi].to[ProductLookupApiImpl]
  )
}
