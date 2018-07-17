# Frameworkium API

[![CI Status][status-svg]][status]
[![codecov.io][codecov-svg]][codecov]
[![Maintainability][cc-badge]][codeclimate]

This is the Frameworkium 3 API module.

It contains code to provide structure to (REST) API tests.

## Frameworkium 3

Frameworkium 3 is a re-organisation of the original [frameworkium-core][core] aka Frameworkium 2.

Frameworkium 3 splits the project up into logical modules that can be used largely independently.
 
### Frameworkium 3 Modules

 1. [frameworkium-ui][ui]
 2. [frameworkium-api][api]
 3. [frameworkium-reporting][reporting]
 4. [frameworkium-jira][jira]
 
### Example Projects

 - [frameworkium-examples][examples]
 - [frameworkium-bdd][bdd]
 
### Rest Assured

`frameworkium-api` includes the [RestAssured][ra] library for interacting with HTTP APIs.

See the [RestAssured docs][ra-docs] for an in-depth guide for the Rest Assured library.

[status-svg]: https://travis-ci.org/Frameworkium/frameworkium-api.svg?branch=master
[status]: https://travis-ci.org/Frameworkium/frameworkium-api
[codecov-svg]: https://codecov.io/gh/Frameworkium/frameworkium-api/branch/master/graph/badge.svg
[codecov]: https://codecov.io/gh/Frameworkium/frameworkium-api
[codeclimate]: https://codeclimate.com/github/Frameworkium/frameworkium-api/maintainability
[cc-badge]: https://api.codeclimate.com/v1/badges/f021c0563f084a0d779c/maintainability

[core]: https://github.com/Frameworkium/frameworkium-core
[ui]: https://github.com/Frameworkium/frameworkium-ui
[api]: https://github.com/Frameworkium/frameworkium-api
[reporting]: https://github.com/Frameworkium/frameworkium-reporting
[jira]: https://github.com/Frameworkium/frameworkium-jira
[examples]: https://github.com/Frameworkium/frameworkium-examples/tree/frameworkium3
[bdd]: https://github.com/Frameworkium/frameworkium-bdd/tree/frameworkium3

[ra-docs]: https://github.com/rest-assured/rest-assured/wiki/Usage
[ra]: https://github.com/rest-assured/rest-assured/
