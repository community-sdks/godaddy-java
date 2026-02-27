# GoDaddy Java SDK

A community-maintained Java SDK for the provided GoDaddy OpenAPI specs.

## Build

```bat
build.bat
```

## Getting Started

```java
import com.communitysdks.godaddy.Client;
import com.communitysdks.godaddy.Config;

public class Example {
    public static void main(String[] args) {
        Config config = new Config();
        config.apiKey = "your-api-key";
        config.apiSecret = "your-api-secret";

        Client client = new Client(config, null);
        var response = client.domains().tlds();
        System.out.println(response.asString());
    }
}
```

## Services

- [AbuseService](./docs/abuse.md): Abuse reporting and ticket lookup endpoints for phishing, malware, and related investigations.
- [AftermarketService](./docs/aftermarket.md): Aftermarket listing and sales endpoints for secondary-market domain workflows.
- [AgreementsService](./docs/agreements.md): Agreement retrieval endpoints for legal terms and consent workflows.
- [AnsService](./docs/ans.md): Authoritative DNS record and nameserver management endpoints.
- [AuctionsService](./docs/auctions.md): Auction listing discovery endpoints for GoDaddy Auctions inventory.
- [CertificatesService](./docs/certificates.md): SSL certificate purchase, validation, lifecycle, and revocation endpoints.
- [CountriesService](./docs/countries.md): Country and market metadata endpoints used across purchase flows.
- [DomainsService](./docs/domains.md): Domain availability, purchase, management, transfer, and DNS endpoints.
- [OrdersService](./docs/orders.md): Order lookup endpoints for commerce and fulfillment status.
- [ParkingService](./docs/parking.md): Domain parking optimization and template management endpoints.
- [ShoppersService](./docs/shoppers.md): Shopper profile, account, and delegated access endpoints.
- [SubscriptionsService](./docs/subscriptions.md): Subscription listing and management endpoints for recurring products.
