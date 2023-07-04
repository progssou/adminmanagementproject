package tn.taskmanager.adminmanagement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/tasksmanagement")
@AllArgsConstructor
public class AdminmanagementController {
	private final AdminmanagementService adminmanagementService = new AdminmanagementService();

    @PostMapping
    public String register(@RequestBody AdminmanagementRequest request) {
        return adminmanagementService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return adminmanagementService.confirmToken(token);
    }
    
    
  
}
