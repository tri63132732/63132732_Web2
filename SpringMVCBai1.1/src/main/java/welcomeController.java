import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {
	@RequestMapping("welcome")
	public String welcome(ModelMap model) {
		return "viewWelcome";
	}
}

