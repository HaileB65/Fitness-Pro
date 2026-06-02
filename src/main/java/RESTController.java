import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RESTController {
    /**
     * Shows home page.
     *
     * @return returns home page.
     */
    @GetMapping("/")
    public String showWelcomePage() {
        return "home-page";
    }
}
