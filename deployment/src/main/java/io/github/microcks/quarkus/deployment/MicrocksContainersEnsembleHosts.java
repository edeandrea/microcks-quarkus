/*
 * Copyright The Microcks Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.microcks.quarkus.deployment;

/**
 * A simple bean for holding immutable configuration of Microcks ensemble components hosts.
 * @author laurent
 */
public final class MicrocksContainersEnsembleHosts {

   private final String microcksHost;
   private final String postmanHost;
   private final String asyncMinionHost;

   /**
    * Store the host names of the Ensemble components.
    * @param microcksHost The hostname of the microcks container.
    * @param postmanHost The hostname of the postman-runtime container.
    * @param asyncMinionHost The hostname of the async-minion container.
    */
   public MicrocksContainersEnsembleHosts(String microcksHost, String postmanHost, String asyncMinionHost) {
      this.microcksHost = microcksHost;
      this.postmanHost = postmanHost;
      this.asyncMinionHost = asyncMinionHost;
   }

   public String getMicrocksHost() {
      return microcksHost;
   }

   public String getPostmanHost() {
      return postmanHost;
   }

   public String getAsyncMinionHost() {
      return asyncMinionHost;
   }
}
