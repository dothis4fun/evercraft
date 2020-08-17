package com.dojo.evercraft.cucumber;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.stereotype.Component;
import io.cucumber.spring.ScenarioScope;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Component
@ScenarioScope
public class BossServer {
    final WireMockServer wireMockServer = new WireMockServer(8089);

    public void stubDarthPlagueis() {
        wireMockServer.stubFor(get(urlEqualTo("/boss"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/json")
                        .withBody("Darth Plagueis")));
    }

    public void stubDarthSidious() {
        wireMockServer.stubFor(get(urlEqualTo("/boss"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/json")
                        .withBody("Darth Sidious")));
    }

    public void stop() {
        wireMockServer.stop();
    }

    public void start() {
        wireMockServer.start();
    }

}
