/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.tools;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;


public abstract class QuickStartBase {
  protected File _tmpDir = FileUtils.getTempDirectory();

  public QuickStartBase setTmpDir(String tmpDir) {
    _tmpDir = new File(tmpDir);
    return this;
  }

  public abstract List<String> types();

  public abstract void execute()
      throws Exception;
}
