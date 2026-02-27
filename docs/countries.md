# CountriesService

Country and market metadata endpoints used across purchase flows.

## Accessor

```java
var service = client.countries();
```

## Endpoints

### getCountries

Calls `GET /v1/countries`.

```java
var response = client.countries().getCountries("sample");
```

```json
{}
```

### getCountry

Calls `GET /v1/countries/{countryKey}`.

```java
var response = client.countries().getCountry("sample", "sample");
```

```json
{}
```

