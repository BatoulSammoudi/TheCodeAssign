package axsos.finalproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@PostMapping("/")
	public String homePage(@RequestParam(value = "input") String input) {
		if (input.equals("bushido")) {
			return "code.jsp";
		} else {
			return "redirect:/createError";

		}

	}

	@RequestMapping("/")
	public String moveTo() {
		return "index.jsp";
	}

	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder ");
		return "redirect:/";
	}
}
