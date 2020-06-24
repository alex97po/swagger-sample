package com.pogorelov.swaggersample.web;

import com.pogorelov.swaggersample.domain.Ping;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api/pings")
public class PingController {

    private final ConcurrentMap<Integer, Ping> pings = new ConcurrentHashMap<>();

    @GetMapping
    @ApiOperation(value = "Get all pings",
            notes = "This API could be used to get list of all pings",
            response = Ping.class)
    public List<Ping> getAllPings() {
        return new ArrayList<>(pings.values());
    }

    @GetMapping("/{id}")
    public Ping getPingById(@PathVariable Integer id) {
        return pings.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPing(@RequestBody Ping ping) {
        pings.put(ping.getId(), ping);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePing(@PathVariable Integer id) {
        pings.remove(id);
    }
}
