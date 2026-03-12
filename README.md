# Unofficial GoDaddy Java SDK

## Installation

Maven (`pom.xml`):

```xml
<dependency>
	<groupId>io.github.communitysdks</groupId>
	<artifactId>godaddy</artifactId>
	<version>1.0.0</version>
</dependency>
```

Gradle:

```gradle
implementation 'io.github.communitysdks:godaddy:1.0.0'
```

## Getting Started

```java
import io.github.communitysdks.godaddy.Client;
import io.github.communitysdks.godaddy.Config;

Config config = Config.sandbox("your-key", "your-secret");
Client client = new Client(config, null);
```

## Environment Base URLs

Base URLs are configured through `Config`.

- Sandbox (OTE): `https://api.ote-godaddy.com`
- Production: `https://api.godaddy.com`

`new Config()` defaults to sandbox (OTE).

Use production for all services:

```java
Config config = Config.production("your-key", "your-secret");
Client client = new Client(config, null);
```

Override base URL for specific services (`abuse`, `aftermarket`, `agreements`, `ans`, `auctions`, `certificates`, `countries`, `domains`, `orders`, `parking`, `shoppers`, `subscriptions`):

```java
Config config = Config.production("your-key", "your-secret");
config.serviceBaseUrls.put("abuse", Config.SANDBOX_BASE_URL);
Client client = new Client(config, null);
```

## Services

- [Abuse](./docs/abuse.md): `client.abuse()`
- [Aftermarket](./docs/aftermarket.md): `client.aftermarket()`
- [Agreements](./docs/agreements.md): `client.agreements()`
- [Ans](./docs/ans.md): `client.ans()`
- [Auctions](./docs/auctions.md): `client.auctions()`
- [Certificates](./docs/certificates.md): `client.certificates()`
- [Countries](./docs/countries.md): `client.countries()`
- [Domains](./docs/domains.md): `client.domains()`
- [Orders](./docs/orders.md): `client.orders()`
- [Parking](./docs/parking.md): `client.parking()`
- [Shoppers](./docs/shoppers.md): `client.shoppers()`
- [Subscriptions](./docs/subscriptions.md): `client.subscriptions()`