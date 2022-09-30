package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@SpringBootApplication
@RestController
public class Application {
  private Db db;

  public Application() {
      this.db = new Db();
  }

  public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
  }

  @GetMapping("/")
  public ResponseEntity<Vendor[]> listVendors() {
    return ResponseEntity.status(HttpStatus.OK).body(this.db.listVendors());
  }

  @GetMapping("/{id}")
  public ResponseEntity<String> getVendor(@PathVariable int id) {
    try {
      Vendor vendor = this.db.getVendor(id);
  
      ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
      String resBody;
  
      if(vendor == null) {
        resBody = mapper.writeValueAsString(new HashMap<String, String>() {{
            put("message", "vendor with id " + id + " is not found");
        }});
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resBody);
      } 

      resBody = mapper.writeValueAsString(vendor);
      return ResponseEntity.status(HttpStatus.OK).body(resBody);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("internal server error");
    }
  }
}
