/**
 * 
 */
package chances.demo.jpa.ctrl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import chances.demo.jpa.entity.User;
import chances.demo.jpa.repo.UserRepository;

/**
 * @author chenxx
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/login")
	public String login(@RequestParam String loginName, @RequestParam String loginPwd) throws Exception {
		User user = userRepository.findUser(loginName, loginPwd);
		if (null == user) {
			return "not_found";
		} else {
			return "main";
		}
	}

	@RequestMapping("/saveUser")
	public String insert(@ModelAttribute User user) throws Exception {
		userRepository.save(user);

		return "user_saved";
	}

	@RequestMapping("/listUser")
	public String list(@RequestParam int status, @RequestParam(defaultValue = "0") int page, HttpServletRequest req)
			throws Exception {
		Sort sort = new Sort("loginName");
		PageRequest pageReq = new PageRequest(page, 1, sort);
		Page<User> users = userRepository.findByStatus(status, pageReq);

		req.setAttribute("users", users);

		return "list_user";
	}

}
