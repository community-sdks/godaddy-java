package io.github.communitysdks.godaddy;

import io.github.communitysdks.godaddy.runtime.Transport;
import io.github.communitysdks.godaddy.services.AbuseService;
import io.github.communitysdks.godaddy.services.AftermarketService;
import io.github.communitysdks.godaddy.services.AgreementsService;
import io.github.communitysdks.godaddy.services.AnsService;
import io.github.communitysdks.godaddy.services.AuctionsService;
import io.github.communitysdks.godaddy.services.CertificatesService;
import io.github.communitysdks.godaddy.services.CountriesService;
import io.github.communitysdks.godaddy.services.DomainsService;
import io.github.communitysdks.godaddy.services.OrdersService;
import io.github.communitysdks.godaddy.services.ParkingService;
import io.github.communitysdks.godaddy.services.ShoppersService;
import io.github.communitysdks.godaddy.services.SubscriptionsService;

public final class Client {
    private final ApiClient apiClient;
    private final AbuseService abuse;
    private final AftermarketService aftermarket;
    private final AgreementsService agreements;
    private final AnsService ans;
    private final AuctionsService auctions;
    private final CertificatesService certificates;
    private final CountriesService countries;
    private final DomainsService domains;
    private final OrdersService orders;
    private final ParkingService parking;
    private final ShoppersService shoppers;
    private final SubscriptionsService subscriptions;

    public Client(Config config, Transport transport) {
        this.apiClient = new ApiClient(config, transport);
        this.abuse = new AbuseService(apiClient);
        this.aftermarket = new AftermarketService(apiClient);
        this.agreements = new AgreementsService(apiClient);
        this.ans = new AnsService(apiClient);
        this.auctions = new AuctionsService(apiClient);
        this.certificates = new CertificatesService(apiClient);
        this.countries = new CountriesService(apiClient);
        this.domains = new DomainsService(apiClient);
        this.orders = new OrdersService(apiClient);
        this.parking = new ParkingService(apiClient);
        this.shoppers = new ShoppersService(apiClient);
        this.subscriptions = new SubscriptionsService(apiClient);
    }

    public ApiClient apiClient() { return apiClient; }

    public AbuseService abuse() { return abuse; }

    public AftermarketService aftermarket() { return aftermarket; }

    public AgreementsService agreements() { return agreements; }

    public AnsService ans() { return ans; }

    public AuctionsService auctions() { return auctions; }

    public CertificatesService certificates() { return certificates; }

    public CountriesService countries() { return countries; }

    public DomainsService domains() { return domains; }

    public OrdersService orders() { return orders; }

    public ParkingService parking() { return parking; }

    public ShoppersService shoppers() { return shoppers; }

    public SubscriptionsService subscriptions() { return subscriptions; }
}
