package com.communitysdks.godaddy;

import com.communitysdks.godaddy.runtime.Transport;
import com.communitysdks.godaddy.services.AbuseService;
import com.communitysdks.godaddy.services.AftermarketService;
import com.communitysdks.godaddy.services.AgreementsService;
import com.communitysdks.godaddy.services.AnsService;
import com.communitysdks.godaddy.services.AuctionsService;
import com.communitysdks.godaddy.services.CertificatesService;
import com.communitysdks.godaddy.services.CountriesService;
import com.communitysdks.godaddy.services.DomainsService;
import com.communitysdks.godaddy.services.OrdersService;
import com.communitysdks.godaddy.services.ParkingService;
import com.communitysdks.godaddy.services.ShoppersService;
import com.communitysdks.godaddy.services.SubscriptionsService;

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
