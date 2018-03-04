package workflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import workflow.dto.ClientDTO;
import workflow.dto.ClientOutDTO;
import workflow.dto.IdDTO;
import workflow.entities.Client;
import workflow.entities.UserDocument;
import workflow.services.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "user/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(path = "/createUser")
    public ResponseEntity<String> createUser(@RequestParam ClientDTO clientDTO) {

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

    @PostMapping(path = "/updateUser")
    public ResponseEntity<String> updateUser(@RequestParam ClientDTO clientDTO) {
        if (clientDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't update a user", responseHeaders, HttpStatus.NO_CONTENT);
        }

        userService.update(clientDTO);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been updated", responseHeaders, HttpStatus.OK);

    }

    @GetMapping(path = "/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam IdDTO idDTO) {
        if (idDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't delete a user", responseHeaders, HttpStatus.NO_CONTENT);
        }

        userService.delete(idDTO);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been deleted", responseHeaders, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllDocuments")
    public List<UserDocument> getAllDocs(@RequestParam IdDTO idDTO) {
        if (idDTO == null) {
            throw new RuntimeException();
        }

        return userService.getAllDocuments(idDTO);
    }

    @GetMapping(path = "/getUser")
    public ClientOutDTO getUser(@RequestParam IdDTO idDTO) {
        if (idDTO == null) {
            throw new RuntimeException();
        }
        return userService.getUser(idDTO);
    }

    @GetMapping(path = "/getAllUsers")
    public List<Client> getAllUsers(){
        return userService.getAllUsers();
    }


}
