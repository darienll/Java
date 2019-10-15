package dar.iitu.kz.helloworldproject.controllers;


import dar.iitu.kz.helloworldproject.services.TestDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public class TestController {

    @Autowired
    private TestDBService testDBService;
    @GetMapping
    public String getLast() {

        return testDBService.getLastRecord();
    }
}
