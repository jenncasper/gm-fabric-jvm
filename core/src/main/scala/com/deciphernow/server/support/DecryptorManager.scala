package com.deciphernow.server.support


/*
    Copyright 2017 Decipher Technology Studios LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

/**
  * Created by ghershfield on 6/8/16.
  */
object DecryptorManager extends DecryptorManager

class DecryptorManager {

  lazy val className : Option[String] = com.deciphernow.server.config.resources.decryptClass.getWithDefault
  lazy val clazz: Class[_] = Class.forName(className.get)
  lazy val instance = clazz.newInstance().asInstanceOf[Decryptor]

  def getInstance : Decryptor = instance

}
