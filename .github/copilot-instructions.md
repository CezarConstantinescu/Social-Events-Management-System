<!-- Copilot instructions for AI coding agents working on this repository -->
# Copilot / AI assistant instructions — Social Events Management System

Purpose
- Deliver concise, actionable changes for the Java Spring Boot backend under `backend/`.
- Prefer minimal, well-scoped edits; reference existing interfaces and implementation packages.

Big picture (quick)
- This is a small Spring Boot (Java 8, Spring Boot 1.2.7) backend located in `backend/`.
- Entry point: `backend/src/main/java/com/social_events_management_system/App.java`.
- DB/config: `AppConfig.java` builds a `DataSource` and wraps it with `DataSourceSpy` (log4jdbc). H2 is included as an embedded DB in `pom.xml`.
- Domain model: `backend/src/main/java/com/social_events_management_system/entities/` contains `Event`, `Ticket`, `User`, `Venue`.
- Service pattern: service *interfaces* live under `services.*` (e.g. `services.workflow.EventService`) and concrete implementations under `services.implementation.*` (e.g. `services.implementation.workflow.EventServiceImpl`). Many implementations are lightweight/in-memory for tests or demo purposes.

Key files to inspect for changes
- `App.java` — application bootstrap.
- `AppConfig.java` — DataSource and bean-level wiring; wrap with `DataSourceSpy` here.
- `backend/pom.xml` — use Maven commands; note project uses older Spring Boot and Java 8.
- `services/implementation/*` — where to add new concrete classes.
- `src/test/java/...` — unit and workflow tests; examples: `SimpleComputationServiceTest.java`, `SimpleValidationServiceTest.java`, `EventServiceWorkflowTest.java`.

Project-specific patterns & conventions
- Interface vs implementation: put new service interfaces under `services.<category>` and implementations under `services.implementation.<category>`.
- In-memory implementations: several `*Impl` classes (e.g. `EventServiceImpl`) use a plain Java `Map` store and are not annotated as Spring components — they are used directly in tests. If you want Spring-managed beans add `@Service`/`@Component` and register them or create a configuration class.
- Factory usage: `factory/EntityFactory.java` centralizes test/demo entity creation — reuse it in tests and demo endpoints.
- Testing: tests rely on old versions of libraries (Rest-Assured 2.x). Use the same API shape when updating tests.

Build, run, and test commands (Windows PowerShell)
- Run tests:
```powershell
cd backend; mvn clean test
```
- Run the application (Spring Boot):
```powershell
cd backend; mvn spring-boot:run
```
- Build an executable JAR and run it:
```powershell
cd backend; mvn clean package
java -jar backend/target/*.jar
```
- Notes: the project targets Java 1.8 — ensure your JDK is 1.8 when running locally.

Integration points & external deps
- H2 embedded DB (see `pom.xml`). DB connection properties live in `backend/src/main/resources/application.properties`.
- Log4jdbc / DataSourceSpy used in `AppConfig` for SQL logging (`log4jdbc-log4j2-jdbc4.1`).
- No external microservices are wired; most services are local/in-memory.

Common pitfalls for contributors (AI agents)
- Do not assume all `*Impl` classes are Spring-managed — check for annotations. If you make them Spring beans, update configuration accordingly.
- Spring Boot version is old (1.2.7). Avoid using modern Spring APIs/features without verifying compatibility.
- Lombok is defined in `pom.xml` as `provided` — generated code may not be present in some environments. Prefer plain POJOs when editing unless you confirm Lombok use in the target file.
- Tests may depend on in-memory implementations; adding persistence without updating tests will break expectations.

How to make safe changes (recommended workflow for AI agents)
- Small, isolated edits: update a single service implementation or a single test.
- Run `mvn -DskipTests=false test` locally after changes.
- If adding a new Spring bean, add the appropriate stereotype (`@Service`, `@Repository`, `@Component`) and/or register it in a `@Configuration` class.
- When changing DB behavior, update `application.properties` under `backend/src/main/resources/` and run `mvn test` to ensure tests still pass.

Examples (copy-paste friendly)
- Add a new service implementation:
  - Create `backend/src/main/java/com/social_events_management_system/services/implementation/yourcategory/YourServiceImpl.java` implementing `services.yourcategory.YourService`.
  - If you want Spring to manage it, add `@Service` and import `org.springframework.stereotype.Service`.
- Run a focused test class:
```powershell
cd backend; mvn -Dtest=com.social_events_management_system.validation.SimpleValidationServiceTest test
```

When unsure
- Search for patterns under `services/` and mimic the directory structure and naming.
- Prefer reading `AppConfig.java` before editing DB code — it controls the `DataSource` wiring.

Feedback
- If anything in this guide is unclear or you want more detail about a specific package, tell me which area to expand.

-- End of file
