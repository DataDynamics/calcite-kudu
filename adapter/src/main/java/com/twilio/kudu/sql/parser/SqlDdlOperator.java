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
package com.twilio.kudu.sql.parser;

import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSpecialOperator;
import org.apache.calcite.sql.SqlWriter;

/**
 * Operator for a DDL statement. Used by as th operator for
 * {@link SqlCreateTable} The unparse method must be implemented while
 * overriding a SqlSpecialOperator as the base class implementation calls
 * getSyntax().unparse() which throws an exception.
 */
public class SqlDdlOperator extends SqlSpecialOperator {
  public SqlDdlOperator(String name, SqlKind kind) {
    super(name, kind);
  }

  @Override
  public void unparse(SqlWriter writer, SqlCall call, int leftPrec, int rightPrec) {
    call.unparse(writer, leftPrec, rightPrec);
  }

  @Override
  protected void unparseListClause(SqlWriter writer, SqlNode clause) {
    super.unparseListClause(writer, clause);
  }
}
