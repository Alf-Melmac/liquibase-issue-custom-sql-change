package de.webalf;

import liquibase.change.custom.CustomSqlChange;
import liquibase.database.Database;
import liquibase.exception.CustomChangeException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationErrors;
import liquibase.resource.ResourceAccessor;
import liquibase.statement.SqlStatement;

public class CustomChange implements CustomSqlChange {
	private static boolean executed = false;

	@Override
	public SqlStatement[] generateStatements(Database database) {
		if (executed) {
			throw new RuntimeException("Already executed");
		}
		executed = true;
		System.out.println("!!! EXECUTE");

		return new SqlStatement[0];
	}

	@Override
	public String getConfirmationMessage() {
		return "confirmation message";
	}

	@Override
	public void setUp() {
		//noop
	}

	@Override
	public void setFileOpener(ResourceAccessor resourceAccessor) {
		//noop
	}

	@Override
	public ValidationErrors validate(Database database) {
		return null;
	}
}
