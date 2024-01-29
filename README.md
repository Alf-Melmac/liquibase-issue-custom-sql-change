# liquibase-issue-custom-sql-change
Minimally reproducible example of a custom sql change getting executed twice.

## Steps
1. Execute `mvn liquibase:update`
2. Error: generateStatements method is called twice

To compare with an old version, empty the database and set liquibase.version in `pom.xml` to the last working version 4.24.0.
