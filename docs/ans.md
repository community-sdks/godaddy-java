# AnsService

## Accessor

```java
var serviceAccessor = client.ans();
```

## Method Index

- `searchAnsname`: `SearchAnsnameResponse`
- `registerAgent`: `RegisterAgentResponse`
- `resolveAnsname`: `ResolveAnsnameResponse`
- `getAgent`: `GetAgentResponse`
- `revokeAgent`: `RevokeAgentResponse`
- `validateRegistration`: `ValidateRegistrationResponse`
- `verifyDnsRecords`: `VerifyDnsRecordsResponse`
- `getAgentIdentityCertificateByAgentId`: `GetAgentIdentityCertificateByAgentIdResponse`
- `submitAgentIdentityCsrByAgentId`: `SubmitAgentIdentityCsrByAgentIdResponse`
- `getAgentServerCertificateByAgentId`: `GetAgentServerCertificateByAgentIdResponse`
- `submitAgentServerCsrByAgentId`: `SubmitAgentServerCsrByAgentIdResponse`
- `getAgentCsrStatusByAgentId`: `GetAgentCsrStatusByAgentIdResponse`
- `getAgentEvents`: `GetAgentEventsResponse`

### searchAnsname

Returns: `SearchAnsnameResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.SearchAnsnameRequest;
SearchAnsnameRequest request = new SearchAnsnameRequest(
    "value",
    "value",
    "value",
    "value",
);
var response = client.ans().searchAnsname(request);
```

```json
{
  "agents": [
    {
      "agentDescription": "An agent that analyzes sentiment in text",
      "agentHost": "myagent.example.com",
      "agentDisplayName": "Sentiment Analyzer",
      "ansName": "ans://v1.0.0.myagent.example.com",
      "agentId": "550e8400-e29b-41d4-a716-446655440000",
      "endpoints": [
        {
          "agentUrl": "https://myagent.example.com/mcp",
          "metaDataUrl": "https://myagent.example.com/.well-known/mcp.json",
          "documentationUrl": "https://docs.myagent.example.com",
          "protocol": "MCP",
          "transports": [
            "STREAMABLE-HTTP"
          ],
          "functions": [
            {
              "id": "domain_suggest",
              "name": "Domain Suggest",
              "tags": [
                "domain",
                "suggestion",
                "availability"
              ]
            }
          ]
        }
      ],
      "links": [
        {
          "href": "https://api.godaddy.com/v1/agents/550e8400-e29b-41d4-a716-446655440000",
          "rel": "agent-details"
        }
      ],
      "registrationTimestamp": "2024-01-01T00:00:00Z",
      "ttl": 1,
      "version": "1.0.0"
    }
  ],
  "hasMore": false,
  "limit": 1,
  "offset": 1,
  "returnedCount": 1,
  "searchCriteria": {
    "agentHost": "myagent.example.com",
    "agentDisplayName": "Sentiment Analyzer",
    "protocol": "A2A",
    "version": "^1.0.0"
  },
  "totalCount": 1
}
```

### registerAgent

Returns: `RegisterAgentResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.RegisterAgentRequest;
RegisterAgentRequest request = new RegisterAgentRequest(
    java.util.Map.of("key", "value"),
);
var response = client.ans().registerAgent(request);
```

```json
{
  "ansName": "ans://v1.0.0.external-domain.com",
  "challenges": [
    {
      "dnsRecord": {
        "name": "_acme-challenge.agent.example.com",
        "type": "TXT",
        "value": "value"
      },
      "expiresAt": "value",
      "httpPath": "/.well-known/acme-challenge/xyz123",
      "keyAuthorization": "value",
      "token": "value",
      "type": "DNS_01"
    }
  ],
  "dnsRecords": [
    {
      "name": "value",
      "priority": 1,
      "purpose": "DISCOVERY",
      "required": true,
      "ttl": 1,
      "type": "HTTPS",
      "value": "value"
    }
  ],
  "expiresAt": "value",
  "links": [
    {
      "href": "https://api.godaddy.com/v1/agents/550e8400-e29b-41d4-a716-446655440000",
      "rel": "agent-details"
    }
  ],
  "nextSteps": [
    {
      "action": "CONFIGURE_DNS",
      "description": "value",
      "endpoint": "value"
    }
  ],
  "status": "PENDING_VALIDATION"
}
```

### resolveAnsname

Returns: `ResolveAnsnameResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.ResolveAnsnameRequest;
ResolveAnsnameRequest request = new ResolveAnsnameRequest(
    java.util.Map.of("key", "value"),
);
var response = client.ans().resolveAnsname(request);
```

```json
{
  "ansName": "ans://v1.0.0.myagent.example.com",
  "links": [
    {
      "href": "https://api.godaddy.com/v1/agents/550e8400-e29b-41d4-a716-446655440000",
      "rel": "agent-details"
    }
  ]
}
```

### getAgent

Returns: `GetAgentResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentRequest;
GetAgentRequest request = new GetAgentRequest(
    "value",
);
var response = client.ans().getAgent(request);
```

```json
{
  "agentId": "550e8400-e29b-41d4-a716-446655440000",
  "agentDisplayName": "Sentiment Analyzer",
  "agentDescription": "An agent that analyzes sentiment in text",
  "agentHost": "myagent.example.com",
  "ansName": "ans://v1.0.0.myagent.example.com",
  "version": "1.0.0",
  "agentStatus": "ACTIVE",
  "endpoints": [
    {
      "agentUrl": "https://myagent.example.com/mcp",
      "protocol": "MCP",
      "transports": [
        "STREAMABLE-HTTP"
      ],
      "functions": [
        {
          "id": "analyze_sentiment",
          "name": "Analyze Sentiment",
          "tags": [
            "nlp",
            "sentiment"
          ]
        }
      ]
    },
    {
      "agentUrl": "https://myagent.example.com/a2a",
      "metaDataUrl": "https://myagent.example.com/.well-known/agent-card.json",
      "protocol": "A2A",
      "transports": [
        "JSON-RPC"
      ]
    },
    {
      "agentUrl": "https://myagent.example.com/api/v1",
      "protocol": "HTTP-API",
      "transports": [
        "REST"
      ],
      "documentationUrl": "https://docs.myagent.example.com/api"
    }
  ],
  "links": [
    {
      "href": "https://api.godaddy.com/v1/agents/550e8400-e29b-41d4-a716-446655440000",
      "rel": "self"
    }
  ]
}
```

### revokeAgent

Returns: `RevokeAgentResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.RevokeAgentRequest;
RevokeAgentRequest request = new RevokeAgentRequest(
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.ans().revokeAgent(request);
```

```json
{
  "agentId": "abc123",
  "ansName": "ans://v1.0.0.myagent.example.com",
  "status": "PENDING_VALIDATION",
  "revokedAt": "value",
  "reason": "KEY_COMPROMISE",
  "links": [
    {
      "href": "https://api.godaddy.com/v1/agents/550e8400-e29b-41d4-a716-446655440000",
      "rel": "agent-details"
    }
  ],
  "dnsRecordsToRemove": [
    {
      "name": "value",
      "priority": 1,
      "purpose": "DISCOVERY",
      "required": true,
      "ttl": 1,
      "type": "HTTPS",
      "value": "value"
    }
  ]
}
```

### validateRegistration

Returns: `ValidateRegistrationResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.ValidateRegistrationRequest;
ValidateRegistrationRequest request = new ValidateRegistrationRequest(
    "value",
);
var response = client.ans().validateRegistration(request);
```

```json
{
  "completedSteps": [
    "value"
  ],
  "createdAt": "value",
  "expiresAt": "value",
  "pendingSteps": [
    "value"
  ],
  "phase": "INITIALIZATION",
  "status": "PENDING_VALIDATION",
  "updatedAt": "2024-01-01T00:00:00Z"
}
```

### verifyDnsRecords

Returns: `VerifyDnsRecordsResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.VerifyDnsRecordsRequest;
VerifyDnsRecordsRequest request = new VerifyDnsRecordsRequest(
    "value",
);
var response = client.ans().verifyDnsRecords(request);
```

```json
{
  "completedSteps": [
    "value"
  ],
  "createdAt": "value",
  "expiresAt": "value",
  "pendingSteps": [
    "value"
  ],
  "phase": "INITIALIZATION",
  "status": "PENDING_VALIDATION",
  "updatedAt": "2024-01-01T00:00:00Z"
}
```

### getAgentIdentityCertificateByAgentId

Returns: `GetAgentIdentityCertificateByAgentIdResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentIdentityCertificateByAgentIdRequest;
GetAgentIdentityCertificateByAgentIdRequest request = new GetAgentIdentityCertificateByAgentIdRequest(
    "value",
);
var response = client.ans().getAgentIdentityCertificateByAgentId(request);
```

```json
[
  {
    "certificateIssuer": "CN=Agent Name Service CA,O=GoDaddy,C=US",
    "certificatePEM": "-----BEGIN CERTIFICATE-----\nCERT DATA\n...truncated...\n-----END CERTIFICATE-----",
    "certificatePublicKeyAlgorithm": "RSA",
    "certificateSerialNumber": "1234567890ABCDEF",
    "certificateSignatureAlgorithm": "SHA256withRSA",
    "certificateSubject": "CN=myagent.example.com,O=Example Corp,C=US,SAN:URI:ans://v1.0.0.myagent.example.com",
    "certificateValidFrom": "abc123",
    "certificateValidTo": "abc123",
    "csrId": "abc123"
  }
]
```

### submitAgentIdentityCsrByAgentId

Returns: `SubmitAgentIdentityCsrByAgentIdResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.SubmitAgentIdentityCsrByAgentIdRequest;
SubmitAgentIdentityCsrByAgentIdRequest request = new SubmitAgentIdentityCsrByAgentIdRequest(
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.ans().submitAgentIdentityCsrByAgentId(request);
```

```json
{
  "csrId": "abc123",
  "message": "value"
}
```

### getAgentServerCertificateByAgentId

Returns: `GetAgentServerCertificateByAgentIdResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentServerCertificateByAgentIdRequest;
GetAgentServerCertificateByAgentIdRequest request = new GetAgentServerCertificateByAgentIdRequest(
    "value",
);
var response = client.ans().getAgentServerCertificateByAgentId(request);
```

```json
[
  {
    "certificateIssuer": "CN=Agent Name Service CA,O=GoDaddy,C=US",
    "certificatePEM": "-----BEGIN CERTIFICATE-----\nCERT DATA\n...truncated...\n-----END CERTIFICATE-----",
    "certificatePublicKeyAlgorithm": "RSA",
    "certificateSerialNumber": "1234567890ABCDEF",
    "certificateSignatureAlgorithm": "SHA256withRSA",
    "certificateSubject": "CN=myagent.example.com,O=Example Corp,C=US,SAN:URI:ans://v1.0.0.myagent.example.com",
    "certificateValidFrom": "abc123",
    "certificateValidTo": "abc123",
    "csrId": "abc123"
  }
]
```

### submitAgentServerCsrByAgentId

Returns: `SubmitAgentServerCsrByAgentIdResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.SubmitAgentServerCsrByAgentIdRequest;
SubmitAgentServerCsrByAgentIdRequest request = new SubmitAgentServerCsrByAgentIdRequest(
    "value",
    java.util.Map.of("key", "value"),
);
var response = client.ans().submitAgentServerCsrByAgentId(request);
```

```json
{
  "csrId": "abc123",
  "message": "value"
}
```

### getAgentCsrStatusByAgentId

Returns: `GetAgentCsrStatusByAgentIdResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentCsrStatusByAgentIdRequest;
GetAgentCsrStatusByAgentIdRequest request = new GetAgentCsrStatusByAgentIdRequest(
    "value",
    "value",
);
var response = client.ans().getAgentCsrStatusByAgentId(request);
```

```json
{
  "csrId": "abc123",
  "failureReason": "value",
  "status": "PENDING",
  "submittedAt": "value",
  "type": "SERVER",
  "updatedAt": "2024-01-01T00:00:00Z"
}
```

### getAgentEvents

Returns: `GetAgentEventsResponse`

```java
import io.github.communitysdks.godaddy.dto.ans.requests.GetAgentEventsRequest;
GetAgentEventsRequest request = new GetAgentEventsRequest(
    "value",
    "value",
    "value",
    1L,
);
var response = client.ans().getAgentEvents(request);
```

```json
{
  "items": [
    {
      "logId": "019a7a52-e5bf-7b5b-b048-d0b78f4b4c5f",
      "eventType": "AGENT_REGISTERED",
      "createdAt": "2025-01-08T12:30:00Z",
      "expiresAt": "2026-01-08T12:30:00Z",
      "agentId": "550e8400-e29b-41d4-a716-446655440000",
      "ansName": "ans://v1.0.0.myagent.example.com",
      "agentHost": "myagent.example.com",
      "agentDisplayName": "Sentiment Analyzer",
      "agentDescription": "An agent that analyzes sentiment in text",
      "version": "1.0.0",
      "providerId": "PC_1234567890",
      "endpoints": [
        {
          "agentUrl": "https://myagent.example.com/mcp",
          "metaDataUrl": "https://myagent.example.com/.well-known/mcp.json",
          "documentationUrl": "https://docs.myagent.example.com",
          "protocol": "MCP",
          "transports": [
            "STREAMABLE-HTTP"
          ],
          "functions": [
            {
              "id": "domain_suggest",
              "name": "Domain Suggest",
              "tags": [
                "domain",
                "suggestion",
                "availability"
              ]
            }
          ]
        }
      ]
    }
  ],
  "lastLogId": "abc123"
}
```