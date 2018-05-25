package AH1N1.App.endpoints;

import AH1N1.App.gs_producing_web_service.Country;
import AH1N1.App.gs_producing_web_service.Currency;
import AH1N1.App.gs_producing_web_service.GetCountryRequest;
import AH1N1.App.gs_producing_web_service.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.annotation.PostConstruct;

@Endpoint
public class LoginEp {

        private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

        @PostConstruct
        private void print() {
            System.out.println("--------------------------------aaaa");
        }
//        private CountryRepository countryRepository;
//
//        @Autowired
//        public CountryEndpoint(CountryRepository countryRepository) {
//            this.countryRepository = countryRepository;
//        }

        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
        @ResponsePayload
        public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
            GetCountryResponse response = new GetCountryResponse();
            response.setCountry(new Country("kraj", 2222, "stoliczka", Currency.PLN));

            return response;
        }
    }


