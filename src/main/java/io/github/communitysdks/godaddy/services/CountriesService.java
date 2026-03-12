package io.github.communitysdks.godaddy.services;

import io.github.communitysdks.godaddy.ApiClient;
import io.github.communitysdks.godaddy.errors.ApiException;
import io.github.communitysdks.godaddy.dto.countries.requests.GetCountriesRequest;
import io.github.communitysdks.godaddy.dto.countries.requests.GetCountryRequest;
import io.github.communitysdks.godaddy.dto.countries.responses.GetCountriesResponse;
import io.github.communitysdks.godaddy.dto.countries.responses.GetCountryResponse;
import io.github.communitysdks.godaddy.errors.countries.CountriesApiException;
import io.github.communitysdks.godaddy.errors.countries.CountriesBadRequestException;
import io.github.communitysdks.godaddy.errors.countries.CountriesConflictException;
import io.github.communitysdks.godaddy.errors.countries.CountriesForbiddenException;
import io.github.communitysdks.godaddy.errors.countries.CountriesGatewayTimeoutException;
import io.github.communitysdks.godaddy.errors.countries.CountriesNotFoundException;
import io.github.communitysdks.godaddy.errors.countries.CountriesRateLimitException;
import io.github.communitysdks.godaddy.errors.countries.CountriesServerException;
import io.github.communitysdks.godaddy.errors.countries.CountriesUnauthorizedException;
import io.github.communitysdks.godaddy.errors.countries.CountriesUnprocessableEntityException;
import io.github.communitysdks.godaddy.runtime.JsonCodec;

public final class CountriesService extends AbstractService {
    public CountriesService(ApiClient client) {
        super(client, "countries");
    }

    public GetCountriesResponse getCountries(GetCountriesRequest request) {
        GetCountriesRequest safe = request == null ? new GetCountriesRequest() : request;
        Object response = execute(
            "GET",
            "/v1/countries",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetCountriesResponse.fromMixed(response);
    }

    public GetCountryResponse getCountry(GetCountryRequest request) {
        GetCountryRequest safe = request == null ? new GetCountryRequest() : request;
        Object response = execute(
            "GET",
            "/v1/countries/{countryKey}",
            safe.toPathParams(),
            safe.toQueryParams(),
            safe.toHeaders(),
            safe.body()
        );
        return GetCountryResponse.fromMixed(response);
    }

    @Override
    protected ApiException mapException(ApiException exception) {
        Object errorResponse = exception.responseBody == null || exception.responseBody.isBlank() ? null : JsonCodec.parse(exception.responseBody);
        int status = exception.statusCode;
        if (status == 400) return new CountriesBadRequestException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 401) return new CountriesUnauthorizedException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 403) return new CountriesForbiddenException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 404) return new CountriesNotFoundException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 409) return new CountriesConflictException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 422) return new CountriesUnprocessableEntityException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 429) return new CountriesRateLimitException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status == 504) return new CountriesGatewayTimeoutException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        if (status >= 500) return new CountriesServerException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
        return new CountriesApiException(exception.getMessage(), status, exception.responseBody, exception.headers, exception.requestMethod, exception.requestUrl, errorResponse);
    }
}
