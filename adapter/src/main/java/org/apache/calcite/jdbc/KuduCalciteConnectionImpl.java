/* Copyright 2020 Twilio, Inc
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
package org.apache.calcite.jdbc;

import org.apache.calcite.adapter.java.JavaTypeFactory;
import org.apache.calcite.avatica.AvaticaFactory;

import java.sql.SQLException;
import java.util.Properties;

public class KuduCalciteConnectionImpl extends CalciteConnectionImpl {

  protected KuduCalciteConnectionImpl(Driver driver, AvaticaFactory factory, String url, Properties info,
      CalciteSchema rootSchema, JavaTypeFactory typeFactory) {
    super(driver, factory, url, info, rootSchema, typeFactory);
  }

  public KuduMetaImpl getMeta() {
    return (KuduMetaImpl) meta();
  }

  @Override
  public boolean getAutoCommit() {
    return false;
  }

  @Override
  public void setAutoCommit(boolean autoCommit) throws SQLException {
    super.setAutoCommit(false);
  }
}
