package workflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import workflow.dto.ClientDTO;
import workflow.services.UserService;

@RestController
@RequestMapping(path = "user/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(path = "/createUser")
    public ResponseEntity<String> blockUser(@RequestParam ClientDTO clientDTO) {

        if (clientDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't create a user", responseHeaders, HttpStatus.NO_CONTENT);
        }
        userService.create(clientDTO);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been created", responseHeaders, HttpStatus.OK);
    }

}
