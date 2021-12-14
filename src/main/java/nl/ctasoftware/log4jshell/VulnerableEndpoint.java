package nl.ctasoftware.log4jshell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnerableEndpoint {
    private static final Logger logger = LogManager.getLogger(VulnerableEndpoint.class);

    @GetMapping("/seeforyourself")
    void seeforyourself(@RequestParam(name = "loggedData") String loggedData){
        logger.error(loggedData);
    }
}
