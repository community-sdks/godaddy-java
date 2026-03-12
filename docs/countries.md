# CountriesService

## Accessor

```java
var serviceAccessor = client.countries();
```

## Method Index

- `getCountries`: `GetCountriesResponse`
- `getCountry`: `GetCountryResponse`

### getCountries

Returns: `GetCountriesResponse`

```java
import io.github.communitysdks.godaddy.dto.countries.requests.GetCountriesRequest;
GetCountriesRequest request = new GetCountriesRequest(
    "value",
);
var response = client.countries().getCountries(request);
```

```json
[
  {
    "callingCode": "value",
    "countryKey": "US",
    "label": "value"
  }
]
```

### getCountry

Returns: `GetCountryResponse`

```java
import io.github.communitysdks.godaddy.dto.countries.requests.GetCountryRequest;
GetCountryRequest request = new GetCountryRequest(
    "value",
    "value",
);
var response = client.countries().getCountry(request);
```

```json
[
  {
    "callingCode": "value",
    "countryKey": "US",
    "label": "value",
    "states": [
      {
        "label": "value",
        "stateKey": "value"
      }
    ]
  }
]
```