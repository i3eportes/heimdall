
package br.com.conductor.heimdall.core.exception;

/*-
 * =========================LICENSE_START==================================
 * heimdall-core
 * ========================================================================
 * Copyright (C) 2018 Conductor Tecnologia SA
 * ========================================================================
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ==========================LICENSE_END===================================
 */

/**
 * This class represents the exceptions related to server errors.
 * 
 * @author Filipe Germano
 * @see HeimdallException
 *
 */
public class ServerErrorException extends HeimdallException {

     private static final long serialVersionUID = 5382794478221159589L;

     public ServerErrorException(ExceptionMessage exeptionMessage) {
          super(exeptionMessage);
     }
}
