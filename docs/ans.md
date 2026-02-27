# AnsService

Authoritative DNS record and nameserver management endpoints.

## Accessor

```java
var service = client.ans();
```

## Endpoints

### searchAnsName

Calls `GET /v1/agents`.

```java
var response = client.ans().searchAnsName("sample", "sample", "sample", "sample", 1L, 1L);
```

```json
{}
```

### registerAgent

Calls `POST /v1/agents/register`.

```java
var response = client.ans().registerAgent(Map.of("sample", true));
```

```json
{}
```

### resolveAnsName

Calls `POST /v1/agents/resolution`.

```java
var response = client.ans().resolveAnsName(Map.of("sample", true));
```

```json
{}
```

### getAgent

Calls `GET /v1/agents/{agentId}`.

```java
var response = client.ans().getAgent("sample");
```

```json
{}
```

### validateRegistration

Calls `POST /v1/agents/{agentId}/verify-acme`.

```java
var response = client.ans().validateRegistration("sample");
```

```json
{}
```

### verifyDnsRecords

Calls `POST /v1/agents/{agentId}/verify-dns`.

```java
var response = client.ans().verifyDnsRecords("sample");
```

```json
{}
```

### getAgentIdentityCertificateByAgentId

Calls `GET /v1/agents/{agentId}/certificates/identity`.

```java
var response = client.ans().getAgentIdentityCertificateByAgentId("sample");
```

```json
{}
```

### submitAgentIdentityCsrByAgentId

Calls `POST /v1/agents/{agentId}/certificates/identity`.

```java
var response = client.ans().submitAgentIdentityCsrByAgentId("sample", Map.of("sample", true));
```

```json
{}
```

### getAgentServerCertificateByAgentId

Calls `GET /v1/agents/{agentId}/certificates/server`.

```java
var response = client.ans().getAgentServerCertificateByAgentId("sample");
```

```json
{}
```

### submitAgentServerCsrByAgentId

Calls `POST /v1/agents/{agentId}/certificates/server`.

```java
var response = client.ans().submitAgentServerCsrByAgentId("sample", Map.of("sample", true));
```

```json
{}
```

### getAgentCsrStatusByAgentId

Calls `GET /v1/agents/{agentId}/csrs/{csrId}/status`.

```java
var response = client.ans().getAgentCsrStatusByAgentId("sample", "sample");
```

```json
{}
```

### getAgentEvents

Calls `GET /v1/agents/events`.

```java
var response = client.ans().getAgentEvents("header-value", "sample", "sample", 1L);
```

```json
{}
```

